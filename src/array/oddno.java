package array;

import java.util.Arrays;

public class oddno {
	
	public static void main(String[] args) {
		
		int[] oddnums= getOddnums();
		System.out.println(Arrays.toString(oddnums));
		
	}
	
	
	static int[] getOddnums() {
		int[] oddnums = new int[50];
		
		int j=0;

		for( int i=1; i<=100; i++) {
			
		if(i%2 != 0) {
			
			oddnums[j]= i; 
			j++;
			
		}	
		}
		
		return oddnums;
		
	    }
	
}
