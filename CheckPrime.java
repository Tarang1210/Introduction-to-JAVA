package Milestone1;

import java.util.Scanner;

public class CheckPrime {

	
	public static boolean checkPrime(int n){
		int div = 2;
		//boolean isPrime = true;
		while(div<= n-1) {
			if(n%div==0) {
				//isPrime=false;
				//System.out.println("Composite Number");
				return false;
			}
			div++;
		}
		return true;
		//System.out.println("Prime Number");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		boolean result = checkPrime(n);
		System.out.println(result);
		
		/*
		 * if(isPrime){ System.out.println("Prime"); }else {
		 * System.out.println("Composite"); }
		 */
		
	}

}
