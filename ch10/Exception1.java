package ch10;

public class Exception1 {
	public static void main(String[] args) {
		int number = 100, result = 0;
		for(int i = 0; i < 10; i++) {
			int ran = (int)(Math.random()*10);
			try {//실해하다가 예외가 발생할 수 있는 실행문
				result = number /  ran;
				System.out.printf("%d / %d = %d\n", number,ran,result);
			}catch (ArithmeticException e) { // 예외가 발생하면 처리하는 곳
				System.out.println("영으로 못나눠");
			}
		}
		
	}

}
