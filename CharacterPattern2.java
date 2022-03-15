package Milestone1;

import java.util.Scanner;

public class CharacterPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(i<=n) {
			char charPrint = (char)('A'+ i-1);
			int j=1;
			while(j<=n)
			{
				System.out.print(charPrint);
				charPrint = (char)(charPrint+1);
				j++;
			}
		System.out.println();
		i++;
		}
	}

}
