package com.cranajit.booklist.config;

import java.util.ArrayList;
import java.util.Properties;
import static org.hibernate.cfg.AvailableSettings.DIALECT;
import static org.hibernate.cfg.AvailableSettings.SHOW_SQL;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.cranajit.booklist.models.Book;

@Configuration
@EnableTransactionManagement
@PropertySource(value = "classpath:db.properties")
@ComponentScans(value = {
		@ComponentScan(basePackages = "com.cranajit.booklist.controllers"),
		@ComponentScan(basePackages = "com.cranajit.booklist.services"),
		@ComponentScan(basePackages = "com.cranajit.booklist.daos")
})
public class ApplicationConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public MappingJackson2HttpMessageConverter getConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setPrettyPrint(true);
		return converter;
	}
	
	@Bean
	public RequestMappingHandlerAdapter getAdapter() {
		RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
		ArrayList<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(getConverter());
		adapter.setMessageConverters(converters);
		return adapter;
	}
	
	@Bean
	public BasicDataSource getDataSource() {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(env.getProperty("mysql.driver"));
		datasource.setUrl(env.getProperty("mysql.url"));
		datasource.setUsername(env.getProperty("mysql.username"));
		datasource.setPassword(env.getProperty("mysql.password"));
		
		return datasource;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setAnnotatedClasses(Book.class);
		Properties props = new Properties();
		props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
		props.put(DIALECT, env.getProperty("hibernate.dialect"));
		factory.setHibernateProperties(props);
		return factory;
	}
	
	@Bean
	public HibernateTransactionManager getManager() {
		HibernateTransactionManager manager = new HibernateTransactionManager();
		manager.setSessionFactory(getSessionFactory().getObject());
		return manager;
	}
}
