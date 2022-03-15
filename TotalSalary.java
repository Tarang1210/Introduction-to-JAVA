package Milestone1;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int basic = sc.nextInt();
		String str = sc.next();
		char grade = str.charAt(0);
		
		int allow; double totalSalary;
		double hra=(0.2d*basic);
		double da=(0.5d*basic);
		double pf=(0.11d*basic);
		if(grade=='A'){
			allow = 1700;
		}else if(grade=='B') {
			allow = 1500;
		}else
		{
			allow = 1300;
		}
		
		totalSalary = basic+hra+da+allow-pf;
		
		System.out.println(Math.round(totalSalary));
		
		
		
		
	}

}
