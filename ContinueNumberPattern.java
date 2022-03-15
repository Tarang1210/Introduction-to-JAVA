package Milestone1;

import java.util.Scanner;

public class ContinueNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int numberCount = i+1-1;
			while(j<=i) {
				System.out.print(numberCount);
				numberCount = numberCount+1;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
