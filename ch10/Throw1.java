package ch10;

public class Throw1 {
	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		m2();
		
	}

	private static void m2() {
//		 여기사 예외 발생
		try {
//		개발 테스트 할 때 의도적으로 에러를 넣는 용도로 사용
		throw new Exception("에러");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
