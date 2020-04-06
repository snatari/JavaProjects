package com.perscholas.spring_hibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.perscholas.spring_hibernate.controllers")
public class WebAppConfig {
@Bean
InternalResourceViewResolver resolver(){
return new InternalResourceViewResolver("/WEB-INF/views/",".jsp");
}
}