package com.udemy.ms.springboot.app.usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.ms.springboot.app.commons.usuarios.models.entity.Usuario;
import com.udemy.ms.springboot.app.usuarios.repository.IUsuarioDAO;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
	private IUsuarioDAO usuarioDao;
    
	@Transactional(readOnly = true)
	public Usuario getUsuarioById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public Usuario insertarUsuario(Usuario entity) {
		return usuarioDao.save(entity);
	}

	@Override
	@Transactional
	public Usuario editarUsuario(Usuario entity, Long id) {
		Usuario usuarioDB = usuarioDao.findById(id).orElse(null);
		if (usuarioDB != null) {
			usuarioDB.setNombre(entity.getNombre());
			usuarioDB.setApellido(entity.getApellido());
			usuarioDB.setEmail(entity.getEmail());
//			usuarioDB.setRoles(entity.getRoles());
			return usuarioDao.save(usuarioDB);
		}else
			return null; 
	}

	@Override
	@Transactional
	public void eliminarUsuario(Usuario entity) {
		usuarioDao.deleteById(entity.getId());
	}

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> getListUsuario() {		
		return (List<Usuario>)usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario getByUsername(String userName) {
		return usuarioDao.findByUsername(userName);
	}

}
