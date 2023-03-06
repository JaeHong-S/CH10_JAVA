package ch10;

public class Throws2 {
	public static void main(String[] args) {
		int[] k  =  {12, 45, 9,0, 32, 22};
		for(int i = 0; i< k.length; i++) {
			m1(k[i]);
		}
	}
	 static void m1(int k ) {
		try {
		m2(k);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	private static void m2(int k) throws ArithmeticException{
		System.out.printf("%d / %d = %d\n", 100, k, 100/k);
		
		
		
	}

}
