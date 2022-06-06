package com.shivu.game;

import java.util.Scanner;

public class ProgramArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int N[] = new int[5];
		int M[] = new int[5];
		for(int i=0; i<T; i++) {
			N[i]= scan.nextInt();
			M[i] = scan.nextInt();
		}
		for(int i=0; i<T; i++) {
			if(M[i]%N[i] == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
