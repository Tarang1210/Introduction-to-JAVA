package Milestone1;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int a = 10; int b=25;
		
		System.out.println(a++);
		System.out.println(++a);
		
		//This Using AND(&&) operators
		if(a++ > 10 && b++ > 25){
			System.out.println("Inside If");
		}else{
			System.out.println("Inside Else");
		}
		System.out.println("Value of a is:-"+a+" and Value of b is:-"+b);
		
		
		//This Using OR(||) operators
		
		int c = 15; int d=20;
		if(++c > 15 || d++ > 20){
			System.out.println("Inside If");
		}else {
			System.out.println("Inside Else");
		}
		System.out.println("Value of c is:-" + c + " and Value of d is:-"+d);
		
	}

}
