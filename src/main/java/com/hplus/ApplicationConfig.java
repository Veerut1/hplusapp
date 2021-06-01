/**
 * 
 */
package com.hplus;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Virupaksha Tippa
 *	01-Jun-2021
 */


@Configuration
@ComponentScan("com.hplus")
public class ApplicationConfig extends WebMvcConfigurationSupport {

	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("css/**","images/**").addResourceLocations("classpath:/static/css/","classpath:/static/images");
		
	}
	
	
	
	
	
}
