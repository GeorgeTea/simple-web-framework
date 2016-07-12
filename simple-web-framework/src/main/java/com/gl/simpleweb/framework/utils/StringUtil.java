package com.gl.simpleweb.framework.utils;

/**
 * ×Ö·û´®¹¤¾ßÀà
 * @author George
 *
 */
public final class StringUtil {
	
	/**
	 * ÅÐ¶Ï×Ö·û´®ÊÇ·ñÎª¿Õ
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		return str == null || str.trim().length() == 0;
	}
	
	/**
	 * ÅÐ¶Ï×Ö·û´®ÊÇ·ñ·Ç¿Õ
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
	
}
