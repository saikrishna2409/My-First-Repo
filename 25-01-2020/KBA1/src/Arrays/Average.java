package Arrays;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
			sum=sum+a[i];
			
		}
		int avg =sum/n;
		System.out.println("Average is "+avg);
	}

}
