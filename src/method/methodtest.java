package method;

public class methodtest {

	public static void main(String[] args) {

		// add();
		// printtable(665);

		int s = getsumof1to100();
		System.out.println("total sum = " + s);
		
		
		
		int sv=findsmallest(456, 678);
		System.out.println("smallest="+sv);

	}

	// 1. no return type with no arguments

	static void add() {
		int x = 34;
		int y = 67;

		int s = x + y;
		System.out.println("sum=" + s);
	}

// 2. no return type with arguments

	// add

	static void printtable(int n) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "x" + i + "=" + (n * i));

		}

	}

	// 3, return type with no arguments

	static int getsumof1to100() {
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			s = s + i;
		}

		return s;
	}

	// 4. return type with argument
	 
	static int findsmallest(int a, int b) {
		 
		if(a<b)
			return a;
		else 
			return b;
	}
	
	
	
	
}
