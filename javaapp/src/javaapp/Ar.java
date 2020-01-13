package javaapp;

import java.util.Scanner;

public class Ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		float a =sc.nextFloat();
		float b =sc.nextFloat();
		float c,d;
		 c=a*b;
		 System.out.println("Area is"+c);
		 d=2*(a+b);
		 System.out.println("Perimeter is"+d);
	}

}
