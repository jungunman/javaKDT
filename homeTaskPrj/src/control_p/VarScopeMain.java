package control_p;

public class VarScopeMain {

	public static void main(String[] args) {
		int a = 10, b, c, e;	//외부변수
		System.out.println("main1 : "+ a );
		//System.out.println("main1 : "+ a + ", " + b);
		
		boolean bo = true;
		
		if(bo) {
			a = 20;
			b = 2000;
			c = 1234;
			int d = 9988;	//내부 변수 : (제어문)구간 내부에서 선언되어 사용
							// 선언된 구간에서만 접근 가능하고 구간을 벗어나면 변수 소멸
			//int e; 외부변수와 중첩으로 내부변수 선언 불가
			int f;//다른 구간이므로 같은이름으로 다른 구간에서 내부변수 선언 가능
			
			System.out.println("참이지롱 : "+ a+ ", " + b+ ", " + c+ ", " +d);
		}else {
			
			c = 5678;
			int f;	//다른 구간이므로 같은이름으로 다른 구간에서 내부변수 선언 가능
			//System.out.println("거짓부렁 : "+ a+ ", " + b);
			//System.out.println("거짓부렁 : "+ a+ ", " + c+ ", " +d);
			System.out.println("거짓부렁 : "+ a+ ", " + c);
		}
		
		//System.out.println("main2 : "+ a+ ", " + b);
		//System.out.println("main2 : "+ a+ ", " + c+ ", " + d);
		System.out.println("main2 : "+ a+ ", " + c);

	}

}
