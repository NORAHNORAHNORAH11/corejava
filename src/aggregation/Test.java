package aggregation;

public class Test {

	public static void main(String[] args) {
		
     Car c = new Car();
     
     c.setColor("blue");
     c.setCompany("tesla");
     c.setPrice(23456789);
     
     Employee emp = new Employee();
     
     emp.setId(23456);
     emp.setName("IZZY");
     emp.setSalary(234);
     emp.setCar(c);
     
     System.out.println("id="+emp.getId());
     System.out.println("name="+emp.getName());
     System.out.println("salary="+emp.getSalary());
     System.out.println("----car info------");
     System.out.println("color="+emp.getCar().getColor());
     System.out.println("company="+emp.getCar().getCompany());
     System.out.println("price="+emp.getCar().getPrice());
     
     
     
	}
}
