package com.cristobal.escalab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristobal.escalab.DTO.ProfesorDetalleDTO;
import com.cristobal.escalab.exception.ModeloNotFoundException;
import com.cristobal.escalab.models.entity.Subject;
import com.cristobal.escalab.models.entity.Teacher;
import com.cristobal.escalab.service.interfaces.ITeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherRestController {

	@Autowired
	private ITeacherService teacherService;

	@GetMapping
	public ResponseEntity<List<Teacher>> listar() {

		List<Teacher> teacher = teacherService.listar();
		return new ResponseEntity<List<Teacher>>(teacher, HttpStatus.OK);
	}
	
	@GetMapping("/habilitados")
	public ResponseEntity<List<Teacher>> listarHabilitados() {

		List<Teacher> teacher = teacherService.listarHabilitados(teacherService.listar());
		return new ResponseEntity<List<Teacher>>(teacher, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Teacher> listarPorId(@PathVariable("id") Integer id) {

		Teacher teacher = teacherService.leerPorId(id);
		if (teacher == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Teacher>(teacher, HttpStatus.OK);
	}
	

	@PostMapping
	public ResponseEntity<Teacher> registrar(@RequestBody Teacher teacher) {
		Teacher teach = teacherService.registrar(teacher);
		return new ResponseEntity<Teacher>(teach, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Teacher> modificar(@RequestBody Teacher teacher) {

		Teacher teach = teacherService.registrar(teacher);
		return new ResponseEntity<Teacher>(teach, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id) {
		teacherService.eliminar(id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);

	}

	@GetMapping("/asociados/{id}")
	public ResponseEntity<Integer> subjectasociados(@PathVariable int id) {

		Integer asociados = teacherService.subjectAsociados(id);
		return new ResponseEntity<Integer>(asociados, HttpStatus.OK);
	}

	@GetMapping("/subject/{id}")
	public ResponseEntity<List<Subject>> obtenerSubjectAsociados(@PathVariable int id) {

		List<Subject> subjects = teacherService.obtenerListadoRamos(id);
		return new ResponseEntity<List<Subject>>(subjects, HttpStatus.OK);
	}
	
	@GetMapping("detalle/{id}")
	public ResponseEntity<ProfesorDetalleDTO> detalleSubject(@PathVariable int id) {

		
		Teacher teacher = teacherService.leerPorId(id);
		Integer asociados = teacherService.subjectAsociados(id);
		List<Subject> subjects = teacherService.obtenerListadoRamos(id);
		if (teacher == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		ProfesorDetalleDTO profesorDetalle = new ProfesorDetalleDTO(teacher, asociados, subjects);
		
		
		return new ResponseEntity<ProfesorDetalleDTO>(profesorDetalle, HttpStatus.OK);
	}

}
