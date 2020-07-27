package com.cranajit.booklist.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationConfigiration implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ApplicationConfig.class);
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic frontcontroller = servletContext.addServlet("frontcontroller", servlet);
		frontcontroller.addMapping("/");
		frontcontroller.setLoadOnStartup(1);
	}

}
