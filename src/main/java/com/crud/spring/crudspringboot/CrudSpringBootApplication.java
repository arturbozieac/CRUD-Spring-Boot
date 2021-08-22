package com.crud.spring.crudspringboot;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.crudspringboot.student.Student;

@SpringBootApplication
@RestController
public class CrudSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	
	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(1L, "Andrew", "dummy_andrew@gmail.com", LocalDate.of(1998, Month.APRIL, 10), 23));
	}

}
