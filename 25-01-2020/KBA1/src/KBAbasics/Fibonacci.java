package KBAbasics;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c = 0;
		
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		System.out.printf(a+" "+b+" ");
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(c+" ");
		}
		
		
		

	}

}
