package com.gl.simpleweb.framework.helper;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

import com.gl.simpleweb.framework.annotation.Inject;
import com.gl.simpleweb.framework.utils.CollectionUtil;
import com.gl.simpleweb.framework.utils.ReflectionUtil;

public class IocHelper {
	
	//如何实现依赖注入
	//1、先获取所有的Bean Map
	//2、遍历这个映射关系，分别取出Bean类与Bean实例，进而通过反射获取所有类中的所有成员变量。
	//3、继续遍历这些成员变量，若带有Inject注解，则从Bean Map中找到对应的Bean实例。
	//4、最后通过ReflectionUtil#setField方法来修改当前成员变量的值。
	//5、在统一的地方初始化IocHelper，实现Ioc
	static {
		Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
		if(CollectionUtil.isNotEmpty(beanMap)){
			for(Entry<Class<?>, Object> bean : beanMap.entrySet()){
				Class<?> beanClass = bean.getKey();
				Object beanInstance = bean.getValue();
				Field[] beanFields = beanClass.getDeclaredFields();
				for(Field beanField : beanFields){
					if(beanField.isAnnotationPresent(Inject.class)){
						Object beanFieldInstance = beanMap.get(beanField.getType());
						if(beanFieldInstance != null){
							ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
						}
					}
				}
			}
		}
	}

}
