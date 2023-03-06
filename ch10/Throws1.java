package ch10;

public class Throws1 {
	public static void main(String[] args) throws Exception{
		try {		
			m1();
		}catch(Exception e) {
//			에러가 발생하느 흔적을 추적하여 출력
			e.printStackTrace();
		}
	}

	private static void m1() throws Exception{
//		try {
			m2();
//		}catch(Exception e) {
//			System.out.println("여기서 처리할께 : " + e.getMessage());
//		}
	}

	private static void m2() throws Exception {	
		throw new Exception("쪽박");
		
	}

}
