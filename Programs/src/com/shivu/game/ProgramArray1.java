//Program to find the sum of the even indexed array elements

package com.shivu.game;
import java.util.Scanner;

public class ProgramArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		System.out.println("Enter the array elements:");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(i%2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("The sum of even index values is: "+sum);

	}

}
