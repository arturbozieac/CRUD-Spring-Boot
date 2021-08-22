package com.crud.spring.crudspringboot.student;

import java.time.LocalDate;

public class Student {
	/**
	 * Student identifier
	 */
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
	 * @param age        Student age
	 */
	public Student(long id, String name, String email, LocalDate dayOfBirth, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dayOfBirth = dayOfBirth;
		this.age = age;
	}

	/**
	 * Constructor, without identifier
	 * 
	 * @param name       Student name
	 * @param email      Student email
	 * @param dayOfBirth Student birthday
	 * @param age        Student age
	 */
	public Student(String name, String email, LocalDate dayOfBirth, int age) {
		super();
		this.name = name;
		this.email = email;
		this.dayOfBirth = dayOfBirth;
		this.age = age;
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
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
