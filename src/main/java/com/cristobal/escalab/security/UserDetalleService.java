package com.cristobal.escalab.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cristobal.escalab.models.entity.User;
import com.cristobal.escalab.service.interfaces.IUserService;

@Service
public class UserDetalleService implements UserDetailsService{

	
	@Autowired
	private IUserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String rut) throws UsernameNotFoundException {
		
		User user = userService.getByRut(rut).get();
		return UsuarioDetalle.build(user);
	}

}
