package com.cranajit.UMS.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebSecurityConfiguration extends AbstractSecurityWebApplicationInitializer{
	public WebSecurityConfiguration() {
		super(ApplicationConfig.class);
	}
}
