package ch10;

public class Exception3 {
	public static void main(String[] args) {
		int[] x = {12, 45, 25, 0, 17};
		int num = 100, result = 0;

		
		for(int i = 0; i <x.length + 1 ; i++) {
			try {
				result = num / x[i];
				System.out.printf("%d / %d = %d\n",num,x[i], result);
			}catch(ArithmeticException e) {
				System.out.println("0으로 못나눕니다");
			}catch(IndexOutOfBoundsException e) {
				System.out.println("배열의 크기를 넘어갔습니다");
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("finally로 무조건 출력되는 명령어입니다");	
				}
		}
		System.out.println("프로그램 종료");
		
	}

}
