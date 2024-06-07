package constructor;



public class Employee {

	int salary;
	int hours;

	
		void getInfo(int salary, int hours) {

		this.salary=salary;
		this.hours=hours;

	}
	
	
	
	void Addsal() {
	     if (salary<500)  {
	    	 salary= salary+10;    //salary + = 10;
	     }
	     
	     
	
	}
	
	
	
	void AddWork() {

		if (hours>6) {
			salary=salary+5;    // salary + = 5;
		}
	
			
		
		
	}

	public static void main(String[] args) {
		
		Employee o= new Employee();
		o.getInfo(490, 7);
		o.Addsal();
		o.AddWork();
		System.out.println("salary="+o.salary);
		
		
	}
	
}
