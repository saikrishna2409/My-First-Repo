package javaapp;

import java.util.Scanner;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee emp =new Employee();
		emp.getData();
		emp.display();
	}
}
	
		
		class Employee
		{
			int id;
			String name;
			String dept;
	2		public void display()
			{
				System.out.println(id+ ":"+name+ ":"+dept);
			}
			public void getData()
			{
				Scanner sc =new Scanner(System.in);
				
				System.out.println("Enter the id:");
				id =Integer.parseInt(sc.nextLine());
				System.out.println("Enter the name:");
				name = sc.nextLine();
				System.out.println("Enter the department :");
				dept = sc.nextLine();
				}
				
				
			}

		class Developer extends Employee
		{
			String domain;
			
		}
		class Manager extends Employee
		{
			
		}

	


