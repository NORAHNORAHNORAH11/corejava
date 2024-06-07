package objectwithmethod;

public class test {
	
	public static void main(String[] args) {
		
		
		test t= new test();
		
		Product pd=t.getProductData();
		t.printProduct(pd);
		
	}
	
	//------object as a parameter---------
	
	void printProduct(Product p)  {
		
		System.out.println("id="+p.getId());
		System.out.println("name="+p.getName());
        System.out.println("price="+p.getPrice());
        System.out.println("company="+p.getCompany());

        
	}
	
	
	//-----object as return type-------------
	
	Product getProductData()  {
		
        Product p = new Product();
		
		p.setId(11);
		p.setName("IZZY");
		p.setPrice(67785);
		p.setCompany("NORAH");
		
		return p;
		
		
	}
	
	
	//-----------------array of object as parameter-----------
	
	
	//-----------------array of object as return type----------

}
