package Milestone1;

import java.util.Scanner;

public class MirrorImageStarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			
			int spaces = 1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;
			}
			
			int stars = 1;
			while(stars<=i){
				System.out.print("*");
				stars++;
			}
			
			System.out.println();
			i++;
		}

	}

}
