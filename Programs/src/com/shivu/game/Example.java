package com.shivu.game;

import java.util.Scanner;

class Example
{
	public static void main (String[] args) {
		System.out.println("Enter the no of array elements: ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int a[] = new int[10];
		System.out.println("Enter the array elements: ");
		for (int i=0; i<N; i++) {
			a[i] = scan.nextInt();
		}
		int count = 0;
		int res[] = new int[10];
		for (int j=0; j<N; j++) {
			res[a[j]]++;
		}
		for (int i=0; i<N; i++) {
			if (res[i] != 0)
				System.out.println("Frequency of "+ i+"is "+res[i]);
		}
			
	}
}
