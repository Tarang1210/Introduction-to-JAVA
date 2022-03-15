package Milestone1;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		if(a != b){
//			System.out.println("Number are not Equal");
//		}else {
//			System.out.println("Number are Equal");
//		}
		
		if(a>0 && b>0){
			System.out.println("Both Are Positive");
		}else {
			System.out.println("Both Are Not Positive");
		}
				
	}

}
