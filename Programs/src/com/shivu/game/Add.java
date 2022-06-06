package com.shivu.game;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		System.out.println("Enter the value for a:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		System.out.println("Enter the value for b:");
		Scanner scan1 = new Scanner(System.in);
		b = scan1.nextInt();
		int c = a + b;
		System.out.println("Sum of a & b is: "+ c);
	}

}
