package com.gl.simpleweb.framework.utils;

import java.util.Collection;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

/**
 * ���Ϲ�����
 * @author George
 *
 */
public final class CollectionUtil {

	/**
	 * �ж� Collention �Ƿ�Ϊ��
	 * @param collection
	 * @return
	 */
	public static boolean isEmpty(Collection<?> collection){
		return CollectionUtils.isEmpty(collection);
	}
	
	/**
	 * �ж� Collention �Ƿ�ǿ�
	 * @param collection
	 * @return
	 */
	public static boolean isNotEmpty(Collection<?> collection){
		return !isEmpty(collection);
	}
	
	/**
	 * �ж� Map �Ƿ�Ϊ��
	 * @param collection
	 * @return
	 */
	public static boolean isEmpty(Map<?, ?> map){
		return MapUtils.isEmpty(map);
	}
	
	/**
	 * �ж� Map �Ƿ�ǿ�
	 * @param collection
	 * @return
	 */
	public static boolean isNotEmpty(Map<?, ?> map){
		return !isEmpty(map);
	}
	
}
