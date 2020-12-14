package com.cristobal.escalab.service.interfaces;

import com.cristobal.escalab.models.entity.ResetToken;

public interface IResetTokenService {
	
	ResetToken findByToken(String token);
	
	void guardar(ResetToken token);
	
	void eliminar(ResetToken token);
}
