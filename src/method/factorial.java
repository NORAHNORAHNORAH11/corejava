package method;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {	
		factorial();
		}
	
	static int factorial();
	
	int i=1;
	int n;
	
	Scanner sc= new Scanner (System.in);
	System.out.println("enter number");
	 n =sc.nextInt();

	for( i=1 ; i<=10 ;i++) 
	{
	i=i*n;  
	}
	
	}
