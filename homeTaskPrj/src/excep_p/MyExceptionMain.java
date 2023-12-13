package excep_p;

class MyExcep extends Exception{
	
	String [] arr = {
			"나는무너",
			"꿈을꾸는무너",
			"나는상어",
			"뚜루루뚜루상어"
	};
	
	int no;
	
	public MyExcep(int no) {
		//no = 3;
		this.no = no;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return "나는 오버라이딩 메세지이지롱";
		return arr[no];
	}
}

public class MyExceptionMain {

	public static void main(String[] args) {
		
		try {
			System.out.println("try 실행");
			
			throw new MyExcep(3);
			//throw new Exception("던진 에러메세지");
			//throw new MyExcep("던진 에러메세지");
			
		} catch (Exception e) {
			System.out.println("예외 처리 : "+e.getMessage());
		}
		System.out.println("main 종료 --------");
	}

}

