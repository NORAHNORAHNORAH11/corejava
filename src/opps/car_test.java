package opps;

import java.util.Scanner;

public class car_test {
	

	
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
		
		car n = new car();
		
		System.out.println("enter name");
		n.name=s.next;
		
		System.out.println("enter plate number");
		n.plate_no=s.nextInt();
		
		
		n.printCarInfo();
	}

}
