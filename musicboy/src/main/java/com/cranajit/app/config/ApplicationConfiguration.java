package com.cranajit.app.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationConfiguration //implements WebApplicationInitializer 
{

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("*****FRONTCONTROLLER INITIALIZATION*****");
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(SpringConfig.class);
		
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic frontController = servletContext.addServlet("frontController", servlet);
		
		frontController.setLoadOnStartup(1);
		frontController.addMapping("/");
	}
}
