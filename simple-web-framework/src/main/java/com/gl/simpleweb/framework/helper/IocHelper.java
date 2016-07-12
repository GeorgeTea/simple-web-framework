package com.gl.simpleweb.framework.helper;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

import com.gl.simpleweb.framework.annotation.Inject;
import com.gl.simpleweb.framework.utils.CollectionUtil;
import com.gl.simpleweb.framework.utils.ReflectionUtil;

public class IocHelper {
	
	//���ʵ������ע��
	//1���Ȼ�ȡ���е�Bean Map
	//2���������ӳ���ϵ���ֱ�ȡ��Bean����Beanʵ��������ͨ�������ȡ�������е����г�Ա������
	//3������������Щ��Ա������������Injectע�⣬���Bean Map���ҵ���Ӧ��Beanʵ����
	//4�����ͨ��ReflectionUtil#setField�������޸ĵ�ǰ��Ա������ֵ��
	//5����ͳһ�ĵط���ʼ��IocHelper��ʵ��Ioc
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
