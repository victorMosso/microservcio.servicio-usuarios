package com.udemy.ms.springboot.app.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.ms.springboot.app.commons.usuarios.models.entity.Usuario;
import com.udemy.ms.springboot.app.usuarios.service.IUsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private IUsuarioService servicioUsuario;
	
	@GetMapping("/username/{username}")
	public Usuario obternerByUsername(@PathVariable String username) {
		return servicioUsuario.getByUsername(username);
	}
	
	@GetMapping("/ver/{id}")
	public Usuario obtenerUsuarioById(@PathVariable Long id) {
		return servicioUsuario.getUsuarioById(id);
	}
	
	@GetMapping("/listar")
	public List<Usuario> listarUsuarios(){
		return servicioUsuario.getListUsuario();
    }
	
	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Usuario entity) {
		return servicioUsuario.insertarUsuario(entity);
	}
	
	@PutMapping("/editar/{id}")
	public Usuario modificarUsuario(@RequestBody Usuario entity, @PathVariable Long id) {
		return servicioUsuario.editarUsuario(entity,id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void eliminarUsuario(@PathVariable Long id) {
		Usuario usuarioDB = servicioUsuario.getUsuarioById(id);
		if(usuarioDB != null) {
			servicioUsuario.eliminarUsuario(usuarioDB);
		}
	}
	
}
