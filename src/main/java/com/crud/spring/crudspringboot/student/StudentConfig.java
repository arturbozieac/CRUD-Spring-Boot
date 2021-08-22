package com.crud.spring.crudspringboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository){
		return args -> {
			Student andrew = new Student(
					"Andrew",
					"dummy_andrew@gmail.com",
					LocalDate.of(1998, Month.APRIL, 10));
			Student valentin = new Student(
					"Valentin",
					"dummy_valentin@gmail.com",
					LocalDate.of(2000, Month.MAY, 10));
			
			repository.saveAll(List.of(andrew, valentin));
		};
	}
}
