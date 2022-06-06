//Program to find the number of occurrences of all the elements in the array

package com.shivu.game;

import java.util.Scanner;

public class ProgramArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		System.out.println("Enter the array elements: ");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			int x = a[i];
			if(x == -1)continue;
			int count = 0;
			for(int j=0; j<a.length; j++) {
				if(a[j] == x) {
					count++;
					a[j] = -1;
				}
			}
			System.out.println("Frequency of "+x+" is: "+count);
		}

	}

}
