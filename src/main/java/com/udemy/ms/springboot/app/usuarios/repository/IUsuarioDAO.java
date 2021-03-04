package com.udemy.ms.springboot.app.usuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.udemy.ms.springboot.app.commons.usuarios.models.entity.Usuario;

@RepositoryRestResource(path = "repoUsuarios")
public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
	
	@RestResource(path = "buscar-username")
	public Usuario findByUsername(@Param("uName") String username);
}
