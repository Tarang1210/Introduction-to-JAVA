package Milestone1;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int div = 2;
		int n= sc.nextInt();
		while(div<=n-1)
		{
		  if(n%div==0)
		  {
			  System.out.print(div +" ");  
		  }
		  div++;
		}
		
	}

}
