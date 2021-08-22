package com.crud.spring.crudspringboot.student;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
 	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public void addNewStudent(Student student) {
		Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
		
		if(studentByEmail.isPresent()) {
			throw new IllegalStateException("Email taken.");
		}
		
		studentRepository.save(student);
	}

	public void deleteStudent(Long id) {
		Optional<Student> studentById = studentRepository.findById(id);
		
		if(studentById.isPresent()) {
			studentRepository.deleteById(id);
		}else {
			throw new IllegalStateException("Student with this ID does not exists.");
		}
	}

	@Transactional
	public void updateStudent(Long id, String name, String email) {
		Optional<Student> studentById = studentRepository.findById(id);
		
		if(studentById.isPresent()) {
			Student student = studentById.get();
			System.out.println(name);
			if(name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
				student.setName(name);
			}
			if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
				
				Optional<Student> studentByEmail = studentRepository.findStudentByEmail(email);
				if(studentByEmail.isPresent()) {
					throw new IllegalStateException("Email taken.");
				}
				student.setEmail(email);
			}
		}else {
			throw new IllegalStateException("Student with this ID does not exists.");
		}
	}
}
