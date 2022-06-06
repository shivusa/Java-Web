//Program for finding the frequency of a given number

package com.shivu.game;

import java.util.Scanner;

public class ProgramArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		System.out.println("Enter the array elements:");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the number to check the frequency: ");
		int N = scan.nextInt();
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(N == a[i]) {
				count++;
			}
		}
		System.out.println("Frequency of the number is: "+count);
		
		

	}

}
