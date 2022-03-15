package Milestone1;

import java.util.Scanner;

import javax.management.Descriptor;

public class IsoscelesTrianglePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			
			//For spaces
			int spaces=1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;
			}
			
			//For Printing the numbers
			int numbers=1;
			while(numbers<=i) {
				System.out.print(numbers);
				numbers++;
			}
			
			//Now for decrease the number
			int decrease = i-1;
			while(decrease>=1) {
				System.out.print(decrease);
				decrease--;
			}
			
			System.out.println();
			i++;
		}
	}

}
