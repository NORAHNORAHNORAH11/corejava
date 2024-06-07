package method;

import java.util.Scanner;

public class triangle {
	
	
	public static void main(String[] args) {
		triangle();
		
		
	}
}
	static void triangle()   {
		
		int a;
		int b;
		int c;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter 1st side ");
		a = sc.nextInt();
		
		System.out.println("enter 2nd side ");
		b = sc.nextInt();
	
		System.out.println("enter 3rd side ");
		c = sc.nextInt();
		
		equilateral(a, b, c);
		
	}
	
	    
	
	   void equilateral(int a, int b, int c); {
	    
	   if(a == b && a == c)   {
		   System.out.println("equilateral triangle");
	   }
	   
	 
	   void isosceles(int a, int b, int c); {
		    
		   if(a == b || a == c || b==c )   
			   System.out.println("equilateral triangle");
		   
	   }
	   
	   void scalene(int a, int b, int c); {
	    if (x != y || y!= z || z != x)
           System.out.println("scalene triangle");
	   }
	   
	   
}
		   
		   
