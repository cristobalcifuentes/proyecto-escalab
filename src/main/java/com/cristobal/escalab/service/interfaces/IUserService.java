package com.cristobal.escalab.service.interfaces;

import java.util.Optional;

import com.cristobal.escalab.models.entity.User;

public interface IUserService extends ICRUDService<User> {
	
	public Optional<User> getByRut(String rut);

}
