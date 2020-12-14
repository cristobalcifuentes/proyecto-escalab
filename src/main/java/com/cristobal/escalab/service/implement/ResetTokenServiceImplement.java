package com.cristobal.escalab.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.escalab.models.entity.ResetToken;
import com.cristobal.escalab.models.repository.IResetTokenRepository;
import com.cristobal.escalab.service.interfaces.IResetTokenService;



@Service
public class ResetTokenServiceImplement implements IResetTokenService {

	@Autowired
	private IResetTokenRepository repo;

	@Override
	public ResetToken findByToken(String token) {
		return repo.findByToken(token);
	}

	@Override
	public void guardar(ResetToken token) {
		repo.save(token);

	}

	@Override
	public void eliminar(ResetToken token) { 
		repo.delete(token);
	}

}
