package com.gl.simpleweb.framework.helper;

import java.util.HashSet;
import java.util.Set;

import com.gl.simpleweb.framework.annotation.Controller;
import com.gl.simpleweb.framework.annotation.Service;
import com.gl.simpleweb.framework.utils.ClassUtil;

public final class ClassHelper {

	private static final Set<Class<?>> CLASS_SET;
	
	static {
		String basePackage = ConfigHelper.getAppBasePackage();
		CLASS_SET = ClassUtil.getClassSet(basePackage);
	}
	
	/**
	 * 获取应用包名下的所有类
	 * @return
	 */
	public static Set<Class<?>> getClassSet(){
		return CLASS_SET;
	}
	
	/**
	 * 获取应用包名下的所有 Service 类
	 * @return
	 */
	public static Set<Class<?>> getServiceClassSet(){
		return getSpecificAnnotationClassSet(Service.class);
	}
	
	/**
	 * 获取应用包名下的所有 Controller 类
	 * @return
	 */
	public static Set<Class<?>> getControllerClassSet(){
		return getSpecificAnnotationClassSet(Controller.class);
	}
	
	/**
	 * 获取应用包名下的所有 Bean 类
	 * @return
	 */
	public static Set<Class<?>> getBeanClassSet(){
		Set<Class<?>> beanClassSet = new HashSet<Class<?>>();
		beanClassSet.addAll(getServiceClassSet());
		beanClassSet.addAll(getControllerClassSet());
		return beanClassSet;
	}
	
	private static Set<Class<?>> getSpecificAnnotationClassSet(Class annotationClass){
		Set<Class<?>> classSet = new HashSet<Class<?>>();
		for(Class<?> clz : classSet){
			if(clz.isAnnotationPresent(annotationClass)){
				classSet.add(clz);
			}
		}
		return classSet;
	}
	
}
