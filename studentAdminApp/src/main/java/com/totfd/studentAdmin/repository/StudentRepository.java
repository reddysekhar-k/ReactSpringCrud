package com.totfd.studentAdmin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.totfd.studentAdmin.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
//	@Query("select s from Student s where s.email=?1 and s.password=?2")
//	Optional<Student> verifyStudent(String email, String password);

}
