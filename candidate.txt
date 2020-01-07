package javaapp;
import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first test score");
		int t1 =sc.nextInt();
		System.out.println("Enter the Second test score");
		int t2 =sc.nextInt();
		int avg =(t1+t2)/2;
		if((t1>75)&&(t2>75)&&(avg>=80))
		{
		System.out.println("Candidate is selected");
		}
		else
			System.out.println("Candidate is rejected");

}
}
