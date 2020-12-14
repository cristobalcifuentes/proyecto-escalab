package com.cristobal.escalab.service.interfaces;

import com.cristobal.escalab.models.entity.User;

public interface ILoginService {
	
	User verificarNombreUsuario(String usuario) throws Exception;
	int cambiarClave(String clave, String nombre) throws Exception;
}
