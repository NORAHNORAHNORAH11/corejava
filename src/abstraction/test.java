package abstraction;

public class test {
	
	public static void main(String[] args) {
		
	     CentralBank cb = new NabilBank(); 
	     
	     cb.getBankName();
	     cb.getInterestRate();
	     
	     UserService us = new UserServiceImpl();
	     
	     us.addUser();
	     us.deleteUser();
	     
	     CommonService cs = new CommonServiceImpl(); 
	     cs.print();
	     
	     
	     
	     
		
	}

}
