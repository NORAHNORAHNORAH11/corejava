package corejava;

public class dowholetest {
	/* 
	 * --------dowhile loop------------
	 * 
	 * syntax:
	 *   
	 *        do{
	 *        //statements
	 *        }
	 *        while(condition);
	 *           
	 */

	
	public static void main(String[] args) {
		/* 
		 * 9*1=9
		 * 9*2=18
		 * ...
		 * ...
		 * 9*10=90
		 */
	  
		
		int n=9;
		int i=1;
		 
		do {
			
			System.out.println(n+"x"+i+"="+(n*i));
			i++;
			
		}
	
		
		while(i<=10);
			
	}
}
