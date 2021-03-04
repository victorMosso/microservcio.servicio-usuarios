package com.udemy.ms.springboot.app.usuarios.service;

import java.util.List;

import com.udemy.ms.springboot.app.commons.usuarios.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario getUsuarioById(Long id);
	
	public Usuario getByUsername(String userName);
	
	public List<Usuario> getListUsuario();
	
	public Usuario insertarUsuario(Usuario entity);
	
	public Usuario editarUsuario(Usuario entity,Long id);
	
	public void eliminarUsuario(Usuario entity);
	
	
}
