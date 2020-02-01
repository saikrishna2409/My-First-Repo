package KBAbasics;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean status =false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				status =true;
				break;
				
			}
		}
		if(!status)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
	}

}
