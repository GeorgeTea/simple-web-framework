package com.gl.simpleweb.framework.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.gl.simpleweb.framework.utils.ReflectionUtil;

public final class BeanHelper {
	
	public static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();
	
	static {
		Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
		for (Class<?> beanClass : beanClassSet){
			BEAN_MAP.put(beanClass, ReflectionUtil.newInstance(beanClass));
		}
	}
	
	/**
	 * 获取 Bean 映射
	 * @return
	 */
	public static Map<Class<?>, Object> getBeanMap(){
		return BEAN_MAP;
	}
	
	/**
	 * 获取 Bean 实例
	 * @param clz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clz){
		if(!BEAN_MAP.containsKey(clz)){
			throw new RuntimeException("can not get bean by class: " + clz);
		}
		return (T) BEAN_MAP.get(clz);
	}
	
}
