package com.cristobal.escalab.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.escalab.models.entity.ResetToken;



public interface IResetTokenRepository extends JpaRepository<ResetToken, Integer> {
	
	//from ResetToken where token = :?
	ResetToken findByToken(String token);

}

