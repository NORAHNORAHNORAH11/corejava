package array;

import java.util.Scanner;

public class cities {
	public static void main(String[] args) {
		
		
		 //2.WAP to store and  print name of 6 cities.
		
		
		String cities[]= new String[6];
		
				
				//write data in array
				Scanner sc = new Scanner(System.in);
				
				for( int i=0; i<cities.length; i++) {  //for( int i=0; i<=;5 i++)
					
					System.out.println("enter cities name");
					cities[i] = sc.nextLine(); 	
					
				}
		
				
				
				//read data from array
				
				for(String x : cities) {
					System.out.println(x);
				}
			
				
				
	}

}
