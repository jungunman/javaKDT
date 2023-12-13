package oops_p;


class ClaParam{
	
	int bb = 222; //멤버변수 :: 메소드의 공유
	String cc = "정우성";
	
	void meth_1(String a, int b) {
		int c = 30;
		//지역,매개, 멤버 접근가능
		System.out.println("meth_1 :"+ a+","+b+","+c+","+bb+","+cc);
		bb += 10;
		//System.out.println("meth_1 :"+ aa);
	}
	
	void meth_2(String d) {
		//다른 메소드의 매개, 지역변수 접근 불가
		//System.out.println("meth_2 :"+ a+","+b);
		//int d = 456; 매개변수와 지역변수 중첩불가
		System.out.println("meth_2 :"+d+","+bb+","+cc);
		bb += 100;
		
	}
	
	void meth_3(int aa, String bb) {
		//멤버변수, 매개변수 중첩가능 -자료형을 맞추지 않아도 됨
		//멤버변수, 지역변수 중첩가능 -자료형을 맞추지 않아도 됨
		// 중첩될 경우 매개, 지역변수가 우선권을 가짐
		boolean cc = true;
		//this : 멤버요소 접근자, 클래스 정의부에서만 사용가능
		System.out.println("meth_3 :"+aa+","+bb+","+cc+","+this.bb+","+this.cc);
	}
}

public class ParamMain {

	public static void main(String[] args) {
		int aa = 123;
		ClaParam cp = new ClaParam();
		cp.meth_1("아기상어", 10);
		cp.meth_2("엄마상어");
		//System.out.println(a);
		//System.out.println(cp.a);
		System.out.println("cp.bb : "+cp.bb);
		cp.meth_3(9988,"아빠상어");
		//System.out.println("cp.bb : "+cp.this.bb);
	}

}
