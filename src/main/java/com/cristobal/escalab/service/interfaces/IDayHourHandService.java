package com.cristobal.escalab.service.interfaces;

import com.cristobal.escalab.models.entity.DayHourHand;

public interface IDayHourHandService extends ICRUDService<DayHourHand> {
	
	DayHourHand obtenerDayHourHandPorCampos(DayHourHand dayHourHand);
	
	int horarioAlumno(int IdUser, int idDayHourHand);

}
