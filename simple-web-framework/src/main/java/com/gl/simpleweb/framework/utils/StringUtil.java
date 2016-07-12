package com.gl.simpleweb.framework.utils;

/**
 * �ַ���������
 * @author George
 *
 */
public final class StringUtil {
	
	/**
	 * �ж��ַ����Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return str == null || str.trim().length() == 0;
	}
	
	/**
	 * �ж��ַ����Ƿ�ǿ�
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
	
}
