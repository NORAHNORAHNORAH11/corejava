package inheritance;

public class programmer extends Employee {
	
	String proglang;
	String project;
	int bonus;
	
	void print() {
		
		super.print();    // parent class's call
		
		System.out.println("prog lang="+proglang);
		System.out.println("projrct="+project);
		System.out.println("bonus="+bonus);
	}
	

}
