package Milestone1;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		/*  This code is without taking input from user
			int a = 10;
			int b = 15;
			int c = a+b;
			System.out.println(c); 
		*/
		
		//Start coding for Taking Input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Value of A: ");
		int a = sc.nextInt();
		System.out.println("Please Enter Value of B: ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Result of C is: " + c);
		//System.out.println(c);
		
//		String str 	= sc.nextLine();
//		char ch 	= str.charAt(0);
//		System.out.println(ch);
		
		
	}

}
