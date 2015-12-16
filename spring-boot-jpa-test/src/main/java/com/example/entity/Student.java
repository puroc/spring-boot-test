package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int age;

	private String name;

	private int sex;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="course")
	private Course courseBean;

	public Student() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return this.sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Course getCourseBean() {
		return this.courseBean;
	}

	public void setCourseBean(Course courseBean) {
		this.courseBean = courseBean;
	}

}