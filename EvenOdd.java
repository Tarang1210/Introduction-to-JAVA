package Milestone1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//int rem = a % 2;
		if(a % 2 == 0){
			System.out.println(a + " is Even Number");
		}else {
			System.out.println(a + " is Odd Number");
		}
	}
}
