package excep_p;

public class TryCatchMain {

	public static void main(String[] args) {

		try {
			System.out.println("메인 시작 ------ ");
			int a = 100/1;
			System.out.println("정상실행 1 : "+ a);
			
			int [] arr = {10,20,30,40};
			System.out.println("정상실행 2 : "+ arr[1]);
			
			String tt = "awsQWE";
			System.out.println("정상실행 3 : "+ tt.toLowerCase());
		
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열 인덱스 예외처리 ------ "+e.getMessage());
			//e.printStackTrace();
			
//		}finally {
//			System.out.println("메인 종료 ------ ");
		}catch(Exception e) {
			
			System.out.println("일반 예외처리 ------ "+e.getMessage());
			return;
			
		}finally { //try ~ catch ~ finally 순으로 작성
			System.out.println("메인 종료 ------ ");
		}
		
		System.out.println("--------------");
		try {
			
		}catch(Exception e) {
			
		}
		System.out.println("--------------");
		try {
			
		}finally {
			
		} 
			
		System.out.println("--------------");
		
//		catch(Exception e) {
//		
//		}finally {	
//		}
	}

}
