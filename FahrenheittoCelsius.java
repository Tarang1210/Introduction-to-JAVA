package Milestone1;

import java.util.Scanner;

public class FahrenheittoCelsius {

	public static void printFahrenheitTable(int start, int end, int step){
		
		int i,C;
        for(i=start;i<=end;i=i+step){
            C=((i-32)*5)/9;
            System.out.println(i+"\t"+C);
        }
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
		
		printFahrenheitTable(start, end, step);
		
//		while(S<=E)
//		{
//			fah = ((5*(S-32))/9);
//			System.out.println(S+" "+fah);
//			S = S+W;
//		}
		
	}

}
