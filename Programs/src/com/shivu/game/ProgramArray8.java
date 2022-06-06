//Find the duplicate element in an array

package com.shivu.game;

import java.util.Scanner;

public class ProgramArray8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println("Enter the elements: ");
		int a[] = new int[10];
		for(int i=0; i<N; i++) {
			a[i] = scan.nextInt();
		}
		int res[] = new int[101];
		for(int i=0; i<N; i++) {
				res[a[i]]++;
		}
		for(int i=0; i<res.length; i++) {
			if(res[i] > 1) {
				System.out.println(i);
			}
		}
			
	}

}
