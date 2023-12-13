package excep_p;

class ReThrow{

	void meth_1() throws Exception {
		System.out.println("meth_1 시작");
		try {
			meth_2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("> m1 예외처리 : "+e.getMessage());
			throw e;
		}
		System.out.println("meth_1 끝");
	}
	void meth_2() throws Exception {
		System.out.println("\t meth_2 시작");
		
		meth_3();
		
		System.out.println("\t meth_2 끝");
	}
	
	void meth_3() throws Exception{  //declaration --> 예외 처리가 필요함을 선언
		System.out.println("\t\t meth_3 시작");
		try {
			throw new Exception("m3 에러발생");
		} catch (Exception e) {
			System.out.println(">>> m3 예외처리 : "+e.getMessage());
			throw e;   //rethrowing --> 다시 에러 던지기
		}
		
		
		//System.out.println("\t\t meth_3 끝");
	}
}
public class ReThrowingMain {

	public static void main(String[] args) throws Exception {
		
		System.out.println("main 시작");
		ReThrow rt = new ReThrow();
		
		try {
			rt.meth_1();
		} catch (Exception e) {
			System.out.println("main 예외처리 : "+e.getMessage());
			throw e;
		}
	}
}
