package com.crud.spring.crudspringboot.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Student {
	/**
	 * Student identifier
	 */
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	
	
	private long id;
	/**
	 * Student name
	 */
	private String name;
	/**
	 * Student email
	 */
	private String email;
	/**
	 * Student birthday
	 */
	private LocalDate dayOfBirth;
	/**
	 * Student age
	 */
	@Transient
	private int age;

	/**
	 * No-argument constructor
	 */
	public Student() {
	}

	/**
	 * Constructor
	 * 
	 * @param id         Student identifier
	 * @param name       Student name
	 * @param email      Student email
	 * @param dayOfBirth Student birthday
	 */
	public Student(long id, String name, String email, LocalDate dayOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dayOfBirth = dayOfBirth;
	}

	/**
	 * Constructor, without identifier
	 * 
	 * @param name       Student name
	 * @param email      Student email
	 * @param dayOfBirth Student birthday
	 */
	public Student(String name, String email, LocalDate dayOfBirth) {
		super();
		this.name = name;
		this.email = email;
		this.dayOfBirth = dayOfBirth;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dayOfBirth=" + dayOfBirth + ", age="
				+ age + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getAge() {
		return Period.between(
				this.dayOfBirth,
				LocalDate.now())
				.getYears();
	}

	public void setAge(int age) {
		this.age = age;
	}
}
