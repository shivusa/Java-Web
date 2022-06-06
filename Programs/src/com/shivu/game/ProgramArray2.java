//Sum of odd index values and product of even index values
package com.shivu.game;

import java.util.Scanner;

public class ProgramArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		System.out.println("Enter the array elements:");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		int sum = 0;
		int prod = 1;
		for(int i=0; i<a.length; i++) {
			if(i%2 == 0) {
				prod = prod * a[i];
			}
			else {
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of odd index values is: "+sum+ " and the product of even indexed values is: "+prod);

	}

}
