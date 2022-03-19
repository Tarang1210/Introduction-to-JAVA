package Milestone1;

import java.util.Scanner;

public class NcR {
	
	
	//Create factorial name functions to avoid repetition code and more readability and testability
	public static int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int ncr(int n, int r){
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n-r);
		int result = factN / (factR * factNR);
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int result = ncr(n, r);
		
		System.out.println(result);
	}

}
