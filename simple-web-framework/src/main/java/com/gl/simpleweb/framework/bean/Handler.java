package com.gl.simpleweb.framework.bean;

import java.lang.reflect.Method;

/**
 * ·â×° Action ÐÅÏ¢
 * @author George
 *
 */
public class Handler {

	private Class<?> controllerClass;
	
	private Method actionMethod;

	public Handler(Class<?> controllerClass, Method actionMethod) {
		super();
		this.controllerClass = controllerClass;
		this.actionMethod = actionMethod;
	}

	public Class<?> getControllerClass() {
		return controllerClass;
	}

	public Method getActionMethod() {
		return actionMethod;
	}
	
}
