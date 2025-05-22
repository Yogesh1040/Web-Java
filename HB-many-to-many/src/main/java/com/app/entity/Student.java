package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "student2")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "course_student", joinColumns =  @JoinColumn(name = "student_id"),inverseJoinColumns = @JoinColumn(name ="course_id") )
	private List<Course> courses;
	
	
	
	
	public void add(Course tempCourse)
	{
		if(courses == null)
		{
			courses = new ArrayList<Course> ();
		}
		courses.add(tempCourse);
	}




	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
}
