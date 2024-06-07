package encapsulation;

public class test {
public static void main(String[] args) {
	customer c= new customer();
	
	c.setName("IZZY");
	c.setAge(17);
	c.setCity("HELLO");
	c.setPhone(345678);
	
	System.out.println(c);   //System.out.println(c.tostring);
	
     //System.out.println("name="+c.getName());
     //System.out.println("age="+c.getAge());
     //System.out.println("phone="+c.getPhone());
     //System.out.println("city="+c.getCity());
	
}
}
