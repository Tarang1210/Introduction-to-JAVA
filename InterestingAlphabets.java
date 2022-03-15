package Milestone1;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char charPrint = (char)('A'+n-i);
			while(j<=i) {
				System.out.print(charPrint);
				charPrint = (char)(charPrint+1);
				j++;
			}
			System.out.println();
			i++;	
		}

	}

}
