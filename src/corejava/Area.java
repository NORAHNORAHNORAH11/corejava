package corejava;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r;
		System.out.println("enter r");
		r = s.nextInt();
		double pi= 3.14;
		double a= pi * r*r;
		
		
		System.out.println(a);
	}

}
