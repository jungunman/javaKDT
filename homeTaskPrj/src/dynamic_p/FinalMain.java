package dynamic_p;


//final 클래스 - 상속불가
final class FinalAAA{
	int a = 10;
	
	void meth_1() {
		System.out.println("FinalAAA.meth_1() 실행");
	}
}

/*
class FinalBBB extends FinalAAA{
	
}*/


abstract class FinalPar{
	final int a = 10;  
	final int b;
	//final int c;  초기화 하지 않은 멤버변수 final 불가
	
	final static int sa = 1122;  
	//final static int sb;  final static 멤버변수는 선언시 초기화 필수
	
	FinalPar() {
		//a = 1234; 초기화 된 final 변수 대입불가
		b = 20; //생성시 초기화
		//sb = 3344; final static 멤버변수 생성자에서 초기화 불가
	}
	int d = 40;
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
	
	final void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}
	
	final static void meth_s1() {
		System.out.println("부모 static meth_s1() 실행");
	}
	
	abstract void meth_3();
	
	//final abstract void meth_4();  abstract final 불가
}

class FinalChild extends FinalPar{
	int a = 1000;  //final 멤버변수는 hiding 이기 때문에 중복선언 가능   
	String b = "아기상어";
	static int sa = 9988; //final static 멤버변수는 hiding 이기 때문에 중복선언 가능
	
	void meth_1() {
		System.out.println("자식 재정의 meth_1() 실행");
	}
	
	/* final 메소드 재정의 불가
	void meth_2() {
		System.out.println("자식 재정의 meth_2() 실행");
	}*/
	
	void meth_3() {
		System.out.println("자식 재정의 meth_3() 실행");
	}
	
	/* final static 메소드 재정의 불가
	static void meth_s1() {
		System.out.println("자식 재정의 static meth_s1() 실행");
	}*/
}



public class FinalMain {

	public static void main(String[] args) {
		FinalAAA aa = new FinalAAA();
		aa.a = 20;
		aa.meth_1();
		//new FinalAAA() {};  final클래스 - 생성시 재정의 불가
		
		FinalPar pp = new FinalPar() {
			/*
			final 메소드 재정의 불가
			void meth_2() {
				System.out.println("생성시 재정의 meth_2() 실행");
			}*/
			
			void meth_3() {
				System.out.println("생성시 재정의 meth_3() 실행");
			}
		};
//		pp.a = 11;  final 변수 대입불가
//		pp.b = 22;
		pp.d = 44;
		System.out.println("pp:"+pp.a+","+pp.b+","+pp.d);
		int e = 55;
		final int f = 66;
		e = 5050;
		//f = 6060; final 변수 대입불가
		System.out.println(e+","+f);
		pp.meth_1();
		pp.meth_2();
		pp.meth_3();

	}

}
