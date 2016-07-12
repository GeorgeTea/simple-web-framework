package com.gl.simpleweb.framework.utils;

/**
 * ת�Ͳ���������
 * @author George
 *
 */
public final class CastUtil {

	/**
	 * תΪ String ��
	 * @param obj
	 * @return
	 */
	public static String castString(Object obj){
		return castString(obj, "");
	}
	
	/**
	 * תΪ String ���ͣ��ṩĬ��ֵ��
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String castString(Object obj, String defaultValue){
		return obj != null ? String.valueOf(obj) : defaultValue;
	}
	
	/**
	 * תΪ double ��
	 * @param obj
	 * @return
	 */
	public static double castDouble(Object obj){
		return castDouble(obj, 0);
	}
	
	/**
	 * תΪ double ���ͣ��ṩĬ��ֵ��
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static double castDouble(Object obj, double defaultValue){
		double retValue = defaultValue;
		if(obj != null){
			String cast2String = castString(obj);
			if(StringUtil.isNotEmpty(cast2String)){
				try {
					retValue = Double.parseDouble(cast2String);
				} catch (NumberFormatException e) {
				}
			}
		}
		return retValue;
	}
	
	/**
	 * תΪ long ����
	 * @param obj
	 * @return
	 */
	public static long castLong(Object obj){
		return castLong(obj, 0);
	}
	
	/**
	 * תΪ long ���ͣ��ṩĬ��ֵ��
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static long castLong(Object obj, long defaultValue){
		long retValue = defaultValue;
		if(obj != null){
			String cast2String = castString(obj);
			if(StringUtil.isNotEmpty(cast2String)){
				try {
					retValue = Long.parseLong(cast2String);
				} catch (NumberFormatException e) {
				}
			}
		}
		return retValue;
	}
	
	/**
	 * תΪ int ����
	 * @param obj
	 * @return
	 */
	public static int castInt(Object obj){
		return castInt(obj, 0);
	}
	
	/**
	 * תΪ int ���ͣ��ṩĬ��ֵ��
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static int castInt(Object obj, int defaultValue){
		int retValue = defaultValue;
		if(obj != null){
			String cast2String = castString(obj);
			if(StringUtil.isNotEmpty(cast2String)){
				try {
					retValue = Integer.parseInt(cast2String);
				} catch (NumberFormatException e) {
				}
			}
		}
		return retValue;
	}
	
	/**
	 * תΪ boolean ����
	 * @param obj
	 * @return
	 */
	public static boolean castBoolean(Object obj){
		return castBoolean(obj, false);
	}
	
	/**
	 * תΪ boolean ���ͣ��ṩĬ��ֵ��
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static boolean castBoolean(Object obj, boolean defaultValue){
		boolean retValue = defaultValue;
		if(obj != null){
			retValue = Boolean.parseBoolean(castString(obj));
		}
		return retValue;
	}
	
}
