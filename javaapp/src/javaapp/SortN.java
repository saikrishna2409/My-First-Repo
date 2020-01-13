package javaapp;

import java.util.Scanner;

class Second{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[], size,temp=0;
		System.out.println("Enter the size of an array:");
		size = sc.nextInt();
		arr = new int[size];
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The values are:");

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("The given array is:" );
		for (int i = 0; i < size; i++) 
		{
			System.out.print(arr[i]);
		}
		for (int i = 0; i < size; i++)
		{
 
			if (arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest)
			{
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}

	}