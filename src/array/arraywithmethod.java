package array;

public class arraywithmethod {
	
	
		
		
		/*----------------array with method-----------------
		 * 
		 *  a> array as parameter:
		 *     
		 *        void add(int x, int y, int b, int c,......., 50th)  {
		 *        }
		 *        
		 *        void add(int a[])  {
		 *        }
		 *        
		 *  
		 *  
		 *  b> array as return type: 
		 *   
		 *       int[] getIntValue() {
		 *       
		 *       int data[]={400,849,43974,......};
		 *       
		 *       return adata;
		 *       
		 *       }
		 *  
		 *  
		 */
		
		public static void main(String[] args) {
			
			int data[]= {45, 5443, 543,667};
			sum(data);
			
			String datas[]= {"ktm","abc","def","ghi","jkl"};
			cities(datas);
			
			String datass[]= {"nepal","abc","def","ghi","jkl"};
			getCountries(datass);
			
			
		}
		
		//----------------array as parameter-------------
		
		static void sum(int values[]) {
			
			int s=0;
			for(int x: values) {
				s=s+x;
			}
			System.out.println("sum="+s);
	}

		
		//wap to pass and print array of 5 cities using method
		
		static void cities( String cities[])  {
			
			for(String y: cities) {
			    System.out.println(y);
			}
		}
		
		void getCountries() {
				
				 for(String z: getCountries)  {
					 System.out.println(z);
				 }
			
		}
		

		
}
