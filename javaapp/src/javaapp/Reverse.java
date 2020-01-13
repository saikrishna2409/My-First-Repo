package javaapp;

import java.util.Scanner;

class LargestNumber
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int arr[],size;
		System.out.println("Enter the size of an array:");
		size=sc.nextInt();
		arr =new int[size];
		System.out.println("The values are:");
		for(int i=0;i<size;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		int max = arr[0],min=0;
		for(int i = 1; i < arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			else if(arr[i]<max)
				min = arr[i];
		}
		
		
		System.out.println("From The Array Element Largest Number is:" + max);
		System.out.println("From The Array Element Largest Number is:" + min);
	}
}