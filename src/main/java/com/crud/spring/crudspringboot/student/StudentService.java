package com.crud.spring.crudspringboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {

	@GetMapping
	public List<Student> getStudents() {
		return List.of(new Student(1L, "Andrew", "dummy_andrew@gmail.com", LocalDate.of(1998, Month.APRIL, 10), 23));
	}
}
