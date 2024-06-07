package array;

import java.util.Scanner;

public class array_test {
	
	public static void main(String[] args) {
		
	//wap to store and print age of 5 student 
		
		//create array
		
		int age[] = new int[5];
		
		
		//write data in array
		Scanner sc = new Scanner(System.in);
		
		for( int i=0; i<age.length; i++) {  //for( int i=0; i<=4; i++)
			
			System.out.println("enter your age");
			age[i] = sc.nextInt(); 	
		}
		
		
		//read data from array
		
		for(int x : age) {
			System.out.println(x);
		}
	
	}

}
