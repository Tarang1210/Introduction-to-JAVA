package Milestone1;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=1;
		int sum =0;
		int n =sc.nextInt();
		
		while(i<=n){
			sum = i+sum;
			i++;	
		}
		System.out.println(sum);
		
		
	}

}
