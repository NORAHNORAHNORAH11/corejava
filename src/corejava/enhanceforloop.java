package corejava;

public class enhanceforloop {
	/*
	-------for each loop------
	#used to read dara for collection(array,list,setmap etc).
	
	#syntx:
		
		for(data_type  var:constant)
		{
			//statements
			
		}
*/
	
	
	public static void main(String[] args) {
		int[] values = {7, 96, 67, 89};
		int s = 0;

		for(int x : values) {
		 System.out.println(x);
			s = s + x;
		}
			System.out.println("sum="+s);
		
	}
}

