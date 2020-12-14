package com.cristobal.escalab.models.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristobal.escalab.models.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByRut(String rut);

}
