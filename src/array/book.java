package array;

import java.util.Scanner;

public class book {
	public static void main(String[] args) {
		//1.WAP to store and print total,avg price of 10 books. 
		
		// create array
		
		int book[] = new int[10];
		
		
		
		//write data in array
				Scanner sc = new Scanner(System.in);
				
				for( int i=0; i<book.length; i++) {  //for( int i=0; i<=9; i++)
					
					System.out.println("enter book price");
					book[i] = sc.nextInt(); 	
					
				}
		//read data from array			
				int sum = 0; 
					for(int x : book) {
						System.out.println(x);	
						sum = sum+x;
					}
					
					
				 System.out.println("total="+ sum);
				
				 System.out.println("average="+sum/10);
				
				 
					
		}	
		
	}

}
