package Milestone1;

import java.util.Scanner;

public class SumUsingFunction {

	
	public static double sumResult(int num1, int num2, double num3) {
		
		double result = num1 + num2 + num3;
		return result;
		
	}
	
	public static void printEvenNumbers(int n) {
		
		for(int i=2;i<=n;i+=2) {
			System.out.print(i +" ");
		}
		
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		printEvenNumbers(n);
		
		/*
		 * int num1 = sc.nextInt(); int num2 = sc.nextInt(); double num3 =
		 * sc.nextDouble(); double result = sumResult(num1,num2,num3);
		 * System.out.println(result);
		 */
		
	}

}
