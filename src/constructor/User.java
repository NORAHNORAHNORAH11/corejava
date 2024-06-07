package constructor;

public class User {
	
	//USERNAME AND PASSWORD ARE INSTANCE VARIABLE
	
	  String userName;     
	  String password;
	  
	  //------default constructor-------
	//  User() {
	//	  userName="root";
	//	  password="123";
	//  }
	  
	  
	  //----------parameterized constructor------
	  
	  User(String userName, String password) {    // (UN IS LOCAL VARIABLE)
		   
	/*	  
		  this();               //default constructor
		  this(4739, 78374);    //parameterized constructor
 */ 
		
		   this.userName= userName;
		   this.password= password;
		 
	   
		   /*
		    * -> "this" keyword represents current object
		    * -> we can call following using "this":
		    *   a>instance variables
		    *   b>instance methods 
		    *   c>constructors
		    * 
		    */
	  }
	  
	  
	  void printUser() {
		  System.out.println("username="+userName);
		  System.out.println("password="+password);
	  }
	  
	  
	  
	  public static void main(String[] args) {
		  User u = new User("norah", "898989");
		  u.printUser();
		  
	  }

}
