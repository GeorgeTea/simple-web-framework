package com.gl.simpleweb.framework.utils;

/**
 * 转型操作工具类
 * @author George
 *
 */
public final class CastUtil {

	/**
	 * 转为 String 型
	 * @param obj
	 * @return
	 */
	public static String castString(Object obj){
		return castString(obj, "");
	}
	
	/**
	 * 转为 String 类型（提供默认值）
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String castString(Object obj, String defaultValue){
		return obj != null ? String.valueOf(obj) : defaultValue;
	}
	
	/**
	 * 转为 double 型
	 * @param obj
	 * @return
	 */
	public static double castDouble(Object obj){
		return castDouble(obj, 0);
	}
	
	/**
	 * 转为 double 类型（提供默认值）
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
	 * 转为 long 类型
	 * @param obj
	 * @return
	 */
	public static long castLong(Object obj){
		return castLong(obj, 0);
	}
	
	/**
	 * 转为 long 类型（提供默认值）
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
	 * 转为 int 类型
	 * @param obj
	 * @return
	 */
	public static int castInt(Object obj){
		return castInt(obj, 0);
	}
	
	/**
	 * 转为 int 类型（提供默认值）
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
	 * 转为 boolean 类型
	 * @param obj
	 * @return
	 */
	public static boolean castBoolean(Object obj){
		return castBoolean(obj, false);
	}
	
	/**
	 * 转为 boolean 类型（提供默认值）
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
