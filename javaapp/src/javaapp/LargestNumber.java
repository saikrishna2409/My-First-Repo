package javaapp;

import java.util.Scanner;

class LargestNumber
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int arr[],size,arr1[],arr2[];
		System.out.println("Enter the size of an array:");
		size=sc.nextInt();
		arr =new int[size];
		arr1=new int[size];
		arr2=new int[size];
		System.out.println("The values are:");
		
		for(int i=0;i<size;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		
		for(int i = 1; i < arr.length;i++)
		{
			if((arr[i] % 2 )==0)
			{
				arr1[i]= arr[i];
			}
			else if((arr[i]%2)!=0)
				arr2[i] = arr[i];
		}
		
		for(int i=0;i<arr1.length;i++)
		System.out.println("Even elements of an array is:" + arr1[i]);
		for(int j=0;j<arr2.length;j++)
		System.out.println("From The Array Element Largest Number is:" + arr2[j]);
	}
}