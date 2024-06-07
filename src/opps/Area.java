package opps;

public class Area {
	
	int l;
	int b;
	
	
	void setDim(int length , int breadth )  {
	l=length;
	b=breadth;
	getArea(l,b);
	}
			
			public static void getArea(int l, int b)   {
				int area=l*b;
				System.out.println("area="+area);
			}
			
		
			
			
}
