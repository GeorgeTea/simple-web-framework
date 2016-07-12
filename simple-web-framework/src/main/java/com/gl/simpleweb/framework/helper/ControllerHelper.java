package com.gl.simpleweb.framework.helper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

import com.gl.simpleweb.framework.annotation.Action;
import com.gl.simpleweb.framework.bean.Handler;
import com.gl.simpleweb.framework.bean.Request;
import com.gl.simpleweb.framework.utils.CollectionUtil;

public final class ControllerHelper {

	private static final Map<Request, Handler> ACTION_MAP = new HashMap<Request, Handler>();
	
	static {
		Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
		if(CollectionUtil.isNotEmpty(controllerClassSet)){
			for(Class<?> controllerClass : controllerClassSet){
				Method[] controllerMethods = controllerClass.getDeclaredMethods();
				for(Method controllerMethod : controllerMethods){
					if(controllerMethod.isAnnotationPresent(Action.class)){
						Action action = controllerMethod.getAnnotation(Action.class);
						String mapping = action.value();
						if(mapping.matches("\\w+:/\\w*")){
							String[] array = mapping.split(":");
							if(ArrayUtils.isNotEmpty(array) && array.length == 2){
								Request request = new Request(array[0], array[1]);
								Handler handler = new Handler(controllerClass, controllerMethod);
								ACTION_MAP.put(request, handler);
							}
						}
					}
				}
			}
		}
	}
	
	public static Handler getHandler(String requestMethod, String requestPath){
		Request request = new Request(requestMethod, requestPath);
		return ACTION_MAP.get(request);
	}
	
}
