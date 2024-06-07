package objectwitharray;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		 
		// Q. store and print data of 5 students
		
		
		
		// create array
		
		Student students[] =new Student[5];
		
		
		// write data in array
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<students.length; i++) {
		
		Student s= new Student();
		
		System.out.println("id=");
		s.setId(sc.nextInt());
		
		System.out.println("first name=");
		s.setFname(sc.next());
		
		System.out.println("last name=");
		s.setLname(sc.next());
		
		System.out.println("age=");
		s.setAge(sc.nextInt());
		
		System.out.println("college=");
		s.setCollege(sc.next());
		
		System.out.println("city=");
		s.setCity(sc.next());
		
		students[i] = s;
		}
		
		// read data from array
		
		for(Student s: students) {
			
			//if(s.getCollege().equals("NCCS")) {
			
			System.out.println(s);
			//}
		}
		
		
	}

}
