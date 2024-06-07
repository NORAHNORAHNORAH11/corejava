package method;

import java.util.Scanner;

public class si_and_amount {
	
	public static void main(String[] args) {
		
		input();
		
		
		
	}
	
	
	static void input() {
		int p;
		int t;
		int r;
		

		Scanner sc= new Scanner (System.in);
		System.out.println("enter p");
		p=sc.nextInt();
		System.out.println("enter t");
		t=sc.nextInt();
		System.out.println("enter r");
		r=sc.nextInt();
		
		processing(p, t, r);
		
		
	}
	
	
	static void processing(int p, int t, int r) {
		
		int si= (p*t*r)/100;
		int a= p+si; 
		
		output(si, a);
		
	}
	
	
	static void output(int si , int a ) {
		
		System.out.println("simpleinterest="+si);
		System.out.println("amount="+a);
		
	}
	

}
