package javaapp;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    if(n>0)
    	System.out.println("Number is positive");
    else if(n<0)
    	System.out.println("Number is negative");
    else
    	System.out.println("Number is zero");
    	
    
    
	}

}
