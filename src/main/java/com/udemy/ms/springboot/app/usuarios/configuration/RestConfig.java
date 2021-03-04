package com.udemy.ms.springboot.app.usuarios.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.udemy.ms.springboot.app.commons.usuarios.models.entity.*;
@Configuration
public class RestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class,Role.class);
	}
	
}
