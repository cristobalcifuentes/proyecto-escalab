package com.cristobal.escalab.DTO;

import java.util.List;

import com.cristobal.escalab.models.entity.Subject;
import com.cristobal.escalab.models.entity.Teacher;

public class ProfesorDetalleDTO {
	
	private Teacher teacher;
	
	private Integer cantidadCursosAsociados;
	
	private List<Subject> subjectAsociados;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getCantidadCursosAsociados() {
		return cantidadCursosAsociados;
	}

	public void setCantidadCursosAsociados(Integer cantidadCursosAsociados) {
		this.cantidadCursosAsociados = cantidadCursosAsociados;
	}

	public List<Subject> getSubjectAsociados() {
		return subjectAsociados;
	}

	public void setSubjectAsociados(List<Subject> subjectAsociados) {
		this.subjectAsociados = subjectAsociados;
	}

	public ProfesorDetalleDTO(Teacher teacher, Integer cantidadCursosAsociados, List<Subject> subjectAsociados) {
		this.teacher = teacher;
		this.cantidadCursosAsociados = cantidadCursosAsociados;
		this.subjectAsociados = subjectAsociados;
	}

	public ProfesorDetalleDTO() {
	}
	
	
	
	
	
	
	
	
	

}
