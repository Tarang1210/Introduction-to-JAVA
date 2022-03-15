package Milestone1;

import java.util.Scanner;

public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		
		while(i<=n){
			
			//For Spaces
			int spaces =1;
			while(spaces<= n-i) {
				System.out.print(" ");
				spaces++;
			}
			
			//For Printing the numbers
			int numberPrint =1;
			while(numberPrint<=i) {
				System.out.print(numberPrint);
				numberPrint++;
			}
			
			System.out.println();
			i++;
		}
	}

}
