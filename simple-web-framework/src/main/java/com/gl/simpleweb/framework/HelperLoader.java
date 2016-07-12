package com.gl.simpleweb.framework;

import com.gl.simpleweb.framework.helper.BeanHelper;
import com.gl.simpleweb.framework.helper.ClassHelper;
import com.gl.simpleweb.framework.helper.ControllerHelper;
import com.gl.simpleweb.framework.helper.IocHelper;
import com.gl.simpleweb.framework.utils.ClassUtil;

public final class HelperLoader {

	public static void init(){
		Class<?>[] classList = {
				ClassHelper.class,
				BeanHelper.class,
				IocHelper.class,
				ControllerHelper.class,
		};
		for(Class<?> clz : classList){
			ClassUtil.loadClass(clz.getName(), false);
		}
	}
	
}
