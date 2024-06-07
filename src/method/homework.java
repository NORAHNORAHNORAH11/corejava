package method;

public class homework {
	
	public static void main(String[] args) {
		
		int area = getarea(111, 222);
		  volume(area, 333);
		
	}
	
	
		static int getarea(int l, int b)  {
			
			int area = l * b;
			return area;
		}
		
		
		static void volume(int area, int h)   {
			
			int volume= area * h;
			
			System.out.println("area="+area);
			System.out.println("volume="+volume);
			
		}

}
