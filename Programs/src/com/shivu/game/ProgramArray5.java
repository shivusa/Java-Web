package com.shivu.game;

import java.util.Scanner;

public class ProgramArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		System.out.println("Enter the array elements: ");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		int res[] = new int[101];
		for(int i=0; i<a.length; i++) {
				res[a[i]]++;
		}
		for(int j=0; j<res.length; j++) {
			if(res[j] != 0) {
				System.out.println("Frequency of "+j+" is: "+res[j]);
			}
		}

	}

}
