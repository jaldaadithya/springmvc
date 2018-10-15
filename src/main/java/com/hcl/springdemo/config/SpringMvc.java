package com.hcl.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan({"com.hcl.springdemo"})
@EnableWebMvc
public class SpringMvc extends WebMvcConfigurerAdapter{

}
