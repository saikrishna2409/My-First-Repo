package com.stocks.datamodel;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	@Id
	@GeneratedValue
	@Column(name="Teacher_Id")
	private int id;
	@Column(name="Teacher_name")
	private String name;
	private String subject;
	
	@OneToMany(mappedBy = "teacher")
	@Column(name="Student_Names")
	public Set<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> stdId) {
		this.students = stdId;
	}
	
	
	

}
