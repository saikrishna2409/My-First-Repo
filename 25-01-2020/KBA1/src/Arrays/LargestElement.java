package Arrays;

import java.util.Scanner;

import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		int largest;
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		largest=0;
		for(int i=0;i<a.length-1;i++)
		{
		if(largest<a[i])
		{
			largest=a[i];
		}
		}
		System.out.println("Largest is: "+largest);
		
	}

}
