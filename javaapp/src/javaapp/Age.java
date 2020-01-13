package javaapp;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int age =sc.nextInt();
		if((age>5)&&(age<12))
			System.out.println("Children");
		else if((age>13)&&(age<19))
			System.out.println("teenagers");
		else if((age>20)&&(age<35))
			System.out.println("Young Adults");
		else if((age>36)&&(age<45))
			System.out.println("Mature Adults");
		else if((age>46)&&(age<=55))
			System.out.println("Elders");
		else if((age>=56))
			System.out.println("Seniors");

	}

}
