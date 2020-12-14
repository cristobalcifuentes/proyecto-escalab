package com.cristobal.escalab.service.interfaces;

import java.util.List;

import com.cristobal.escalab.models.entity.Subject;
import com.cristobal.escalab.models.entity.Teacher;

public interface ITeacherService extends ICRUDService<Teacher> {
	
	int subjectAsociados(int idTeacher);
	List<Subject> obtenerListadoRamos(int idTeacher);
	public List<Teacher> listarHabilitados(List<Teacher> teachers);
	
}
