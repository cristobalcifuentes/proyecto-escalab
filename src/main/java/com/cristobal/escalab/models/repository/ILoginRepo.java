package com.cristobal.escalab.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cristobal.escalab.models.entity.User;

public interface ILoginRepo extends JpaRepository<User, Integer> {
	
	@Query(value = "FROM Usuario us where us.name = ?", nativeQuery = true)
	User verificarNombreUsuario(String usuario) throws Exception;
	
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Usuario us SET us.password = ? WHERE us.name = ?" , nativeQuery = true)
	void cambiarClave( String clave, String nombre) throws Exception;

}
