package opps;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Maths book

		book b = new book();
		
		System.out.println("enter name");
		b.name ="sc.next";
		
		System.out.println("enter author name");
		b.author="sc.next";
		
		System.out.println("enter author price");
		b.price=sc.nextInt();
		
		System.out.println("enter author PAGES");
		b.pages=sc.nextInt();
		
		
		
		b.printBookInfo();
		
		
		book c = new book();
		
		c.name ="english";
		c.author="izzy";
		c.price=10000;
		c.pages=300;
		
		c.printBookInfo();
		
	}

}




   /*
    * A. CAR
    * B. STUDENT
    * C. RECTANGLE
    * D. DOG
    * E. MOBILE 
    */
