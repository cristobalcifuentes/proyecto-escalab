package com.cristobal.escalab.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.escalab.models.entity.User;
import com.cristobal.escalab.models.repository.ILoginRepo;
import com.cristobal.escalab.service.interfaces.ILoginService;



@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private ILoginRepo repo;
	
	@Override
	public int cambiarClave(String clave, String nombre) {
		int rpta = 0;
		try {
			repo.cambiarClave(clave, nombre);
			rpta = 1;
		} catch (Exception e) {
			rpta = 0;
		}
		return rpta;
	}
	
	@Override
	public User verificarNombreUsuario(String usuario) throws Exception {
		User us = null;
		try {
			us = repo.verificarNombreUsuario(usuario);
			us = us != null ? us : new User();
		} catch (Exception e) {
			us = new User();
		}
		return us;
	}

}
