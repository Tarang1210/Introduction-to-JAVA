package Milestone1;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		 String s = sc.nextLine();
		 char c   = s.charAt(0);
		 
		 int m1,m2,m3;
		 m1 = sc.nextInt();
		 m2 = sc.nextInt();
		 m3 = sc.nextInt();
		 
		 int totalMarks = (m1+m2+m3)/3;
		
		System.out.println(totalMarks);

	}

}
