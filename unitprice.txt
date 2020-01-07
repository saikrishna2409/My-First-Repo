package javaapp;
import java.util.Scanner;
public class pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int Apple =200;
		int Samsung=100;
		System.out.println("Enter the product name:");
		String a=sc.nextLine();
		System.out.println("Enter the quantity:");
		float b=sc.nextFloat();
		float d;
		if (a.equals("Apple"))
			{
		 d =b*Apple;
		System.out.println("The unit price is:"+d);
			}
		else if (a.equals("Samsung"))
		{
			d =b*Samsung;
	System.out.println("The unit price is:"+d);
		}
		else
			System.out.println("Enter correct product name");
		
		

	}

}
