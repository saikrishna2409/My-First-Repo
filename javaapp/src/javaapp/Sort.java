package javaapp;

import java.util.Scanner;

class SortN{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[], size,temp;
		System.out.println("Enter the size of an array:");
		size = sc.nextInt();
		arr = new int[size];
		
		System.out.println("The values are:");

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			}
		for(int k=0;k<size;k++)
			System.out.println("odd elements is:" + arr[k]);
	}
}