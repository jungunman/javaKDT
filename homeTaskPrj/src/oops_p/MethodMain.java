package oops_p;

class ClaMethod{
	
	// 메소드 정의
	// 메소드 이름 : meth_1
	// 매개변수 : int a, String b
	// 리턴형 : int
	// 리턴값 : 1234
	int meth_1(int a, String b) {
		
		System.out.println("ClaMethod.meth_1 실행 : "+a+","+b);
		return 1234;
	}
	
	void meth_2() {
		System.out.println("ClaMethod.meth_2 실행 : param X, ret X");
		return;
	}
	
	void meth_3(int a, int b, boolean c) {
		
		System.out.println("ClaMethod.meth_3 실행 : "+a+","+b+","+c+" , ret X");
	}
	
	String meth_4() {
		System.out.println("ClaMethod.meth_4 실행 : param X");
		return "나는무너";
	}
	
	void exam(String name, int kor, int eng, int mat) {
		
		int tot = kor + eng + mat;
		int avg = tot/3;
		System.out.println(name+":"+tot+","+avg);
	}
	
	void triAngle(int a, int b, int c) {
		int area = a * b / 2;
		int border = a + b + c;
		System.out.println("직각삼각형 : "+area + ", "+ border);
	}
	
	void circle(int r) {
		double PI = 3.141592;
		double area = r * r * PI;
		double border = r * PI * 2;
		System.out.println("원 : "+area + ", "+ border);
	}
	
	
}


/*  클래스 정의부에서 메소드 정의 가능
int meth_2(int a, String b) {
	
	
	return 1234;
}
*/

public class MethodMain {

	public static void main(String[] args) {
		
		ClaMethod cm = new ClaMethod();
		// 메소드 호출
		// 인수(매개변수)에 대입 : 10, "아기상어"
		// int a = 10, String b = "아기상어" ::> 매개변수에 대입
		// 리턴값 변수에 대입
		// int r1 = 1234;
		int r1 = cm.meth_1(10, "아기상어");
		System.out.println("r1:"+r1);
		//r1 = cm.meth_1();
		cm.meth_1(20, "엄마상어");
		
		cm.meth_2();
		//cm.meth_2(10, "아기상어");
		//void r2 = cm.meth_2();
		
		cm.meth_3(111,222,true);
		
		String r4 = cm.meth_4();
		System.out.println("r4:"+r4);
		
		cm.exam("정우성", 78,71,79);
		cm.exam("정좌성", 88,81,89);
		
		
		//직각삼각형 메소드를 완성하세요

		   /// 매개변수 - 높이, 너비, 빗변

		 ///  출력내용 - 도형 이름, 넓이, 둘레

		//원 메소드를 완성하세요

		   /// 매개변수 - 반지름

		 ///  출력내용 - 도형 이름, 넓이, 둘레
		cm.triAngle(5,6,8);
		cm.circle(5);
	}

}

