package com.chandras.fwb.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("LOADING DISPATCHER SERVLET");
		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("/WEB-INF/spring.xml");
		
		DispatcherServlet servlet = new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic myServlet = servletContext.addServlet("myServlet", servlet);
		myServlet.setLoadOnStartup(1);
		myServlet.addMapping("/api/*");
	}
}
