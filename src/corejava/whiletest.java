package corejava;

public class whiletest {
	/*
	 * ___________whileloop___________
	 * syntax :
	 * while(condition){
	 *     
	 *     //statements
	 *     
	 *     
	 *     }
	 
	 */
  
	
	
	public static void main(String[] args) {
		
		//5!=5x4x3x2x1=120
		
		
		int n = 5;
		
		int fact = 1;
		
		while(n>1) {
			
			
			fact=fact*n;
			n--;
			}
		System.out.println("results="+fact);
		
		
		
	}
}
