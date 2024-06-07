package opps;

import java.util.Scanner;

public class Area_test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		Area r= new Area();
		
		System.out.println("l=");
		r.l=sc.nextInt();
		
		System.out.println("b=");
		r.b=sc.nextInt();
		
		r.setDim(r.l, r.b);
		
		
		
		
		
	}

}
