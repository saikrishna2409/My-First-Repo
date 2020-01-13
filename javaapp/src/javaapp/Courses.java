package javaapp;

import java.util.Scanner;

public class Courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t Courses\n");
		System.out.println("Java        5000");
		System.out.println("c           3000");
		System.out.println("cpp         5000");
		System.out.println("python       10000");
		System.out.println("angular        5000");
		Scanner sc =new Scanner(System.in);
		String choice =sc.nextLine();
		StringBuffer sb =new StringBuffer();
		int price =0;
		
		if(choice.contains("java"))
		{
			
			sb.append("java      5000\n");
			price =price+5000;
		}
		if(choice.contains("c"))
		{
			
			sb.append("c      3000\n");
			price =price+3000;
		}
		if(choice.contains("cpp"))
		{
			
			sb.append("cpp      5000\n");
			price =price+5000;
		}
		if(choice.contains("python"))
		{
			
			sb.append("python      10000\n");
			price =price+10000;
		}
		if(choice.contains("angular"))
		{
			
			sb.append("angular      5000\n");
			price =price+5000;
		}
		 
		System.out.println("price     "+price );
	}

}
