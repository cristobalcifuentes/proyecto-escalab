package com.cristobal.escalab.service.interfaces;

import java.util.List;

import com.cristobal.escalab.models.entity.Subject;

public interface ISubjectService extends ICRUDService<Subject> {
	
	int cuposTomados(int idSubjec);
	List<Subject> agregarCuposTomados(List<Subject> subjects);
	Subject agregarCuposTomados(Subject subject);
	List<Subject> cursosPorAlumno(int idUSer);

}
