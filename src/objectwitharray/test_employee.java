package objectwitharray;

import java.util.Scanner;

public class test_employee {
	
	public static void main(String[] args) {
		
		Employee employees[] = new 	Employee[10];
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<employees.length; i++) {
			
			Employee e = new Employee();
			
			System.out.println("id");
			e.setId(sc.nextInt());
			
			System.out.println("name");
			e.setName(sc.next());
			
			System.out.println("company");
			e.setCompany(sc.next());
			
			System.out.println("salary");
			e.setSalary(sc.nextInt());
			
			System.out.println("department");
			e.setDepartment(sc.next());
			
			System.out.println("post");
			e.setPost(sc.next());
			
			System.out.println("city");
			e.setCity(sc.next());
			
			employees[i] = e;
		}
		
		
		
		
		
	}

}
