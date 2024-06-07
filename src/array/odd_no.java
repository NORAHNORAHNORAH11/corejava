package array;

import java.util.Scanner;

public class odd_no {
	
	public static void main(String[] args) {
		
		 //3.WAP to store and print odd numbers from 1 to 100.
		
	int odd[] = new int[50];
		
		
		
		//write data in array
				Scanner sc = new Scanner(System.in);
				
				for( int i=0; i<odd.length; i++) {  //for( int i=0; i<=49; i++)
					
					System.out.println("enter odd numbers");
					odd[i] = sc.nextInt(); 	
					
				}
				
				
	//read data from array
				
				for(int x : odd) {
					System.out.println(x);
				}
			
				
		
	}

}
