package javaapp;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int c =sc.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println("This is the largest"+a);
			else
				System.out.println("This is the largest"+c);
		}
		else
		{
			if(b>c)
				System.out.println("This is the lARGEST"+b);
			else
				System.out.println("This is the largest"+c);
		}

	}

}