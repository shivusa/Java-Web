//Program for Birthday cake candle

package com.shivu.game;

import java.util.Scanner;

public class ProgramArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=0; i<N; i++) {
			a[i] = scan.nextInt();
		}
		int big = a[0];
		for(int i=0; i<N; i++) {
			if(a[i] < a[i+1]) {
				big = a[i+1];
			}
		}
		int count = 0;
		for(int i=0; i<N; i++) {
			if(a[i] == big) {
				count++;
			}
		}
		System.out.println(count);

	}

}


