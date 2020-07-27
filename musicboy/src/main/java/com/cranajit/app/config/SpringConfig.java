package com.cranajit.app.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.cranajit.app.controllers")
public class SpringConfig {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/*");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public MappingJackson2HttpMessageConverter getMessageConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setPrettyPrint(true);
		return converter;
	}
	
	@Bean
	public RequestMappingHandlerAdapter getAdapter() {
		RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
		
		ArrayList<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(getMessageConverter());
		
		adapter.setMessageConverters(converters);
		
		return adapter;
	}
}
