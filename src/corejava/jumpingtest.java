package corejava;

public class jumpingtest {
	/*
	 * ---------jumping statements-----------
	 * a>break;          -> exit from loop
	 * b>continue;       -> skip value  
	 * c>return;         -> exit from method
	 */

	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==5 || i==9) {
				//break;
				//continue;
				//return;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("end of for loop");
		
		
	}
	
	
}
