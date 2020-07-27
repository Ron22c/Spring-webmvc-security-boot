package com.cranajit.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("initializing front controller");
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ApplicationConfiguration.class);
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", servlet);
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}
