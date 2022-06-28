package com.kmh.main.dto;

public class Student implements Comparable<Student>{

	private String name;
	private String grade;
	
	
	public Student(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public String getGrade() {
		return grade;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}


	@Override
	public int compareTo(Student o) {
		if(Integer.valueOf(o.grade)  > Integer.valueOf(this.grade)) {
			return 0;
		}
		return 0;
	}}
