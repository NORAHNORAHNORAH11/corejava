package opps;

import java.util.Scanner;

public class student_test {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		student n = new student();
		
		System.out.println("enter name");
		n.name=s.next();
		
		System.out.println("enter grade");
		n.grade=s.nextInt();
		
		System.out.println("enter roll no");
		n.roll_no=s.nextInt();
		
		
		n.printStudentInfo();
		
	}

}
