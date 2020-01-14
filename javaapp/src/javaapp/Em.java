package javaapp;

import java.io.Serializable;

public class Em implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6498461418305072738L;
	/**
	 * 
	 */

	private int id;
	private String name;
	transient private String address;
	private int age;
	private double phone;
	transient private double salary;
	public Em()
	{
		
	}
	public Em(int id, String name, String address, int age, double phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		this.salary = salary;
	}
	@Override
	public String toString() {
		//return "Em [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone
		//		+ ", salary=" + salary + "]";
		return id+ ":"+name+":"+address+":"+age+":"+phone+":"+salary ;
	}
/*	@Override
	public int compareTo(Em e) {
		// TODO Auto-generated method stub
		if(this.id >e.id)
			return -1;
		else if(this.id ==e.id)
			return 0;
		else
			return 1;
		
	}*/
	
	

}
