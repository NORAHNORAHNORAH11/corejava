package array;

import java.util.Scanner;

public class even_no {
	
	public static void main(String[] args) {
		
		 //4.WAP to store and print even numbers from 1 to 100.
		
int even[] = new int[50];
		
		
		
		//write data in array
				Scanner sc = new Scanner(System.in);
				
				for( int i=0; i<even.length; i++) {  //for( int i=0; i<=49; i++)
					
					System.out.println("enter even numbers");
					even[i] = sc.nextInt(); 	
					
				}
				
				
	//read data from array
				
				for(int x : even) {
					System.out.println(x);
				}
		
		
	}

}
