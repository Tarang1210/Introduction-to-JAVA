package Milestone1;

import java.util.Scanner;

public class Sumofevenodd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int	odd=0; int even=0;
	
		while(n!=0){
			int temp = n%10;
			if(temp%2==0)
			{
				odd = temp+odd;
			}else{
				even = temp+even;
			}
			n = (int)(n/10);
		}
		 System.out.println(odd+" "+even);
	}

}
