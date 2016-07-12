package com.gl.simpleweb.framework;

/**
 * 相关配置项常量
 * @author George
 *
 */
public interface ConfigConstant {
	String CONFIG_FILE = "simpleweb.properties";
	
	String JDBC_DRIVER = "simpleweb.framework.jdbc.driver";
	String JDBC_URL = "simpleweb.framework.jdbc.url";
	String JDBC_USERNAME = "simpleweb.framework.jdbc.username";
	String JDBC_PASSWORD = "simpleweb.framework.jdbc.password";
	
	String APP_BASE_PACKAGE = "simpleweb.framework.app.base_package";
	String APP_JSP_PATH = "simpleweb.framework.app.jsp_path";
	String APP_ASSERT_PATH = "simpleweb.framework.app.asset_path";
}
