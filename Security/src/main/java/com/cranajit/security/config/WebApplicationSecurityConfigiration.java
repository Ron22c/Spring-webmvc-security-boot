package com.cranajit.security.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebApplicationSecurityConfigiration extends AbstractSecurityWebApplicationInitializer{
	public WebApplicationSecurityConfigiration() {
		super(ApplicationConfig.class);
	}
}
