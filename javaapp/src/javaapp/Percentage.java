package javaapp;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float crt =12000;
		float lcd =35000;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name of the tv:");
		String a =sc.nextLine();
		if(a.equals("crt"))
			{
			float d= crt*0.05F;
			float sp=crt-d;
			System.out.println("The price is:"+sp);
			}
		else if(a.equals("lcd"))
		{
			System.out.println("Enter the inches of tv");
			int b =sc.nextInt();
			if(b==14)
			{
				float e =lcd*0.08F;
				System.out.println("The price is:"+e);
			}
			else if(b==21)
			{
				float f =lcd*0.10F;
				System.out.println("The price is:"+f);
			}
				
		}
		
	}

}
