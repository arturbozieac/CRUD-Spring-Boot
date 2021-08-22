package com.crud.spring.crudspringboot.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	/**
	 * Checks if student's email is already in the database. <br>
	 * <br>
	 * <code>SELECT * FROM STUDENT WHERE email = ?</code>
	 * 
	 * @param email Student's email.
	 * @return <code>Null</code> if email is not found.
	 */
	@Query("SELECT s FROM Student s WHERE s.email = ?1")
	Optional<Student> findStudentByEmail(String email);

	
	/**
	 * Checks if a student with given id is present in the database. <br>
	 * <br>
	 * <code>SELECT * FROM STUDENT WHERE id = ?</code>
	 * 
	 * @param id Id to check.
	 * @return <code>Null</code> if ID is not found.
	 */
	@Query("SELECT s FROM Student s WHERE s.id = ?1")
	Optional<Student> findStudentById(Long id);
}
