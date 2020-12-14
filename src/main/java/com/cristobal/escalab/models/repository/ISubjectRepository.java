package com.cristobal.escalab.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cristobal.escalab.models.entity.Subject;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject, Integer> {
	

	@Query(value = "SELECT count(*) FROM subject_user where subject_id=?", nativeQuery = true)
	int cuposTomados(int idSubjec);
	
	

	@Query(value = "select s.subject_id, s.description, s.name, s.quantity, s.day_hour_hand_id, s.teacher_id"
			+ " from subject s join subject_user su on s.subject_id= su.subject_id where su.user_id=?", nativeQuery = true)
	List<Subject> cursosPorAlumno(int idUSer);

}
