package com.stocks.config;

import java.sql.DriverManager;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.integrator.spi.Integrator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.stocks.datamodel.Person;
import com.stocks.datamodel.User;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.stocks")
public class HibernateConfiguration {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.stocks.datamodel" });//1. Use this or use 2.
//		sessionFactory.setAnnotatedClasses(User.class);//2.
//		sessionFactory.setAnnotatedClasses(Person.class);//2.
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
		
	}
	
	public Properties hibernateProperties() {
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.show_sql",true);
		properties.put("hibernate.format_sql", true);
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}

	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/cts?autoReconnect=true&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		return dataSource;
	}
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}
	
	
}
