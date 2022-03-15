package Milestone1;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			int counter = i;
			while(counter>=1)
			{ 
				System.out.print(counter);
				counter = counter - 1;
			}
			System.out.println();
			i++;
		}
	}

}
