package Milestone1;

import java.util.Scanner;

public class FahrenheittoCelsius {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		int fah;
		
		while(S<=E)
		{
			fah = ((5*(S-32))/9);
			System.out.println(S+" "+fah);
			S = S+W;
		}
		
	}

}
