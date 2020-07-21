/* Write a method that returns the average of a list of integers.
*/
package com.klu.epam.Streams_and_lambdas;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {

	private static int sum=0;
	private static void averageofintlist(int sum ,int n)
	{
		final double average=sum/n;
		System.out.println("Average: "+average);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: of list:");
		int size = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(size);
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the number");
			int z = sc.nextInt();
			arr.add(z);
			sum += z;
		}
		averageofintlist(sum, size);
		sc.close();
		
	}

}
