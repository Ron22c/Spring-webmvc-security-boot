package com.cranajit.streammusic.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationConfig implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("initializing the front controller");
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ApplicationConfig.class);
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		
		ServletRegistration.Dynamic frontController = servletContext.addServlet("frontcontroller", servlet);
		frontController.setLoadOnStartup(1);
		frontController.addMapping("/");
	}
	
}
