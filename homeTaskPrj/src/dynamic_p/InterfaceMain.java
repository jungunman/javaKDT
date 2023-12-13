package dynamic_p;

//인터페이스 정의
//interface 인터페이스명
interface InA{
	
	//멤버상수 : public static final 형태
	int a = 10;
	//int b;
	//private int c = 30;
	//protected int d = 40;
	public int e = 50;
	static int f = 60;
	
	//메소드 : public abstract 형태
	void meth_1();
	abstract void meth_2();
	//void meth_3() {}
}

//class InCla extends InA{
//인터페이스 구현 클래스
class InCla implements InA, InB{ //다중구현 가능
	String  g = "클래스g";
	//메소드 재정의시 public 필수
	double f = 123.456;
	public void meth_1() {
		//a = 1111;
		System.out.println("InCla meth_1() 실행:"+a+","+e+","+f+","+g+","+h);
		//System.out.println("InCla meth_1() 실행:"+a+","+e+","+g+","+h);
	}
	public void meth_2() {
		System.out.println("InCla meth_2() 실행");
	}
	
	public void meth_3() {
		System.out.println("InCla meth_3() 실행");
	}
	public void meth_4() {
		System.out.println("InCla meth_4() 실행");
	}
}


public class InterfaceMain {

	public static void main(String[] args) {
		
		System.out.println("InA : "+InA.a+","+InA.e+","+InA.f);
		InCla cc = new InCla();
		//cc.a = 1234;
		System.out.println("cc : "+cc.a+","+cc.e+","+cc.f+","+cc.g+","+cc.h);
		//System.out.println("cc : "+cc.a+","+cc.e+","+cc.g+","+cc.h);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		cc.meth_4();
		
		InA ia = cc;	//자동형변환
		//System.out.println("ia : "+ia.a+","+ia.e+","+ia.f+","+ia.g);
		//System.out.println("ia : "+ia.a+","+ia.e+","+ia.f+","+ia.h);
		System.out.println("ia : "+ia.a+","+ia.e+","+ia.f);
		ia.meth_1();
		ia.meth_2();
		//ia.meth_3();
		//ia.meth_4();
		
		InB ib = cc;
		System.out.println("ib : "+ib.h+","+ib.f);
		ib.meth_1();
		//ib.meth_3();
		ib.meth_4();
	}

}

