package com.cranajit.lc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cranajit.lc.formatters.CraditCardFormatter;
import com.cranajit.lc.formatters.PhoneFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.cranajit.lc.controllers")
public class ApplicationConfiguration implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public MappingJackson2HttpMessageConverter getmessageConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setPrettyPrint(true);
		return converter;
	}
	
	@Bean
	public RequestMappingHandlerAdapter getAdapter() {
		RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
		
		List<HttpMessageConverter<?>> converter = new ArrayList<HttpMessageConverter<?>>();
		converter.add(getmessageConverter());
		
		adapter.setMessageConverters(converter);
		return adapter;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new PhoneFormatter());
		registry.addFormatter(new CraditCardFormatter());
	}
}
