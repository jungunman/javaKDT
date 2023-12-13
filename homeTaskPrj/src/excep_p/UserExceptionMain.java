package excep_p;

public class UserExceptionMain {

	public static void main(String[] args) {

		try {
			System.out.println("try 실행 1");
			
			//에러 생성
			//Exception qq = new Exception("여보세요 나야");
			
			System.out.println("try 실행 2");
			
			//throw qq;
			throw new Exception("거기 잘 지내니");
			
			//throw 이후 실행구문 에러
			//System.out.println("try 실행 3");
			
		}catch(Exception e) {
			System.out.println("에러메세지 : "+e.getMessage());
		}
		
		System.out.println("메인 종료");

	}

}
