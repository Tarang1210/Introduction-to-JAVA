package Milestone1;

import java.util.Scanner;

public class CharacterPattern1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int i =1 ;
		while(i<=n){
			int j=1;
			while(j<=n) {
				int charPrint = ('A'+j-1);
				System.out.print((char)(charPrint));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
