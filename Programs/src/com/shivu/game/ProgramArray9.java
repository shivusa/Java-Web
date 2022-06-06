//TO find the lonely element in an array

package com.shivu.game;
import java.util.Scanner;

public class ProgramArray9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int N = scan.nextInt();
		System.out.println("Enter the array elements: ");
		int a[] = new int[10];
		for(int i=0; i<N; i++) {
			a[i] = scan.nextInt();
		}
		int res[] = new int[50];
		for(int i=0; i<a.length; i++) {
			res[a[i]]++;
		}
		for(int i=0; i<res.length; i++) {
			if(res[i] == 1) {
				System.out.println(i);
			}
		}

	}

}
