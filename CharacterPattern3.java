package Milestone1;

import java.util.Scanner;

public class CharacterPattern3 {
	
	public static void main(String args[]) {
	
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n){
			int j=1;
			char charPrint = (char)('A'+i-1);
			while(j<=i){
			
				System.out.print(charPrint);
				charPrint = (char)(charPrint+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
