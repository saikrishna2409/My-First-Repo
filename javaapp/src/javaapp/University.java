package javaapp;

import java.util.Scanner;

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		Principal p =new Principal();
		Scanner sc2 =new Scanner(System.in);
		int a =sc2.nextInt();
		if(a==1)
		{
			s.getData();
			s.display();
		}
		else if(a==2)
		{
			p.getData1();
			p.display1();
		}
		else
			System.out.println("Enter the correct number");
			
		
		

	}
}
	class Student
	{
		String firstname;
		String lastname;
		int age ;
		String courseenrolled ;
		int studentid;
		public void getData()
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the first name:");
			 firstname =sc.nextLine();
			 System.out.println("Enter the lastname:");
			 lastname =sc.nextLine();
			 System.out.println("Enter the age of the student:");
			 age =Integer.parseInt(sc.nextLine());
			 System.out.println("Enter the course enrolled");
			 courseenrolled =sc.nextLine();
			 System.out.println("Enter the studentid of the student:");
			 studentid =Integer.parseInt(sc.nextLine());
			
			 
		}
		public void display()
		{
			System.out.println(firstname+ ":" +lastname + ":"+age+ ":"+courseenrolled);
		}
	}
	class Principal extends Student
	{
		double salary;
		String departmentname;
		String designation;
		String employeeID;
		public void getData1()
		{
		Scanner sc1 =new Scanner(System.in);
		super.getData();
		
		System.out.println("Enter the Salary:");
		 salary =Integer.parseInt(sc1.nextLine());
		 System.out.println("Enter the department name");
		 departmentname =sc1.nextLine();
		 System.out.println("Enter the designation:");
		 designation =sc1.nextLine();
		 System.out.println("Enter the employee id");
		 employeeID =sc1.nextLine();
		 System.out.println("Enter the studentid of the student:");
		 studentid =Integer.parseInt(sc1.nextLine());
	}
		public void display1()
		{
			super.display();
			System.out.println(firstname+ ":" +lastname + ":"+age+ ":"+courseenrolled);
		}
		}
		

