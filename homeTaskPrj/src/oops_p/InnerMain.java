package oops_p;

class ClaOuter{
	int a;
	String b;
	static String sc = "바깥sc";
	int c = 90;
	
	
	
	public ClaOuter(int a, String b) {
		System.out.println("Outer 생성자:"+a+","+b);
		this.a = a;
		this.b = b;
	}
	void meth_1() {
		System.out.println("바깥 meth_1() 실행");
	}
	static void meth_s2() {
		System.out.println("static 바깥 meth_s2() 실행");
	}
	
	//기본 이너클래스 정의
	class Inner_1{
		
		int in1a = 100;
		String in1b = "기본_b";
		static String in1sc = "기본_sc";
		int c = 9999;
		
		
		public Inner_1(int in1a, String in1b) {
			System.out.println("기본 Inner_1 생성자");
			this.in1a = in1a;
			this.in1b = in1b;
		}
		
		void in1_meth_1() {
			System.out.println("기본 meth_1() 실행:"+a+","+b+","+sc+","+in1a+","+in1b+","+in1sc);
			//System.out.println("기본 meth_1() 실행:"+c+","+super.c);//9999
			//System.out.println("기본 meth_1() 실행:"+c+","+ClaOuter.c);//9999
			System.out.println("기본 meth_1() 실행:"+c+","+ClaOuter.this.c);//9999,90
			//outer 와 inner의 멤버변수 이름 중첩가능
			//inner 멤버변수가 접근 우선권 가짐
			//outer 멤버에 명시적 접근시 ::> outer클래스명.this.멤버변수
			meth_1();
			meth_s2();
			System.out.println("기본 meth_1() 끝-----------------------------------");
		}
		static void  in1_meth_s2() {
			
			//System.out.println("static 기본 meth_s2() 실행:"+a+","+b+","+sc+","+in1a+","+in1b+","+in1sc);
			System.out.println("static 기본 meth_s2() 실행:"+","+sc+","+","+in1sc);
			//meth_1();
			meth_s2();
			System.out.println("static 기본 meth_s2() 끝-----------------------------------");
			
			
			
		}
	}
	
	//멤버변수
	Inner_1 inn1_1 = new Inner_1(111,"아기상어");
	Inner_1 inn1_2 = new Inner_1(222,"엄마상어");
	Inner_2 s1 = new Inner_2(333,"아빠상어");
	Inner_2 s2 = new Inner_2(444,"할머니상어");
	
	//static 이너클래스 정의
	static class Inner_2{
		int in2a = 10;
		static int in2sa = 20;
		String in2b = "스태틱b";
		static String in2sb = "스태틱staticSb";
		
		public Inner_2(int in2a, String in2b) {
			System.out.println("static Inner_2 생성자");
			this.in2a = in2a;
			this.in2b = in2b;
		}
		
		void in2_meth_1() {
			//static 이너클래스 인 경우 인스턴스 메소드일지라도
			//outer의 인스턴스 멤버변수,메소드 접근 불가
			//System.out.println("기본 meth_1() 실행:"+a+","+b+","+sc+","+in2a+","+in2b+","+in2sb);
			//meth_1();
			
			//이너클래스 자신 멤버변수는 인스턴스 멤버 접근가능
			System.out.println("스태틱이너 meth_1() 실행:"+sc+","+in2a+","+in2b+","+in2sb);
			meth_s2();
			in2_meth_3();
			System.out.println("스태틱이너 meth_1() 끝-----------------------------------");
		}
		static void  in2_meth_s2() {
			//outer와 자신 둘다 static 만 접근가능
			//자신의 인스턴스 멤버 변수,메소드 접근 불가
			//System.out.println("스태틱 static meth_s2() 실행:"+sc+","+in2a+","+in2b+","+in2sb);
			System.out.println("스태틱이너 static meth_s2() 실행:"+sc+","+","+in2sb);
			meth_s2();
			//in2_meth_3();
			System.out.println("스태틱이너 static meth_s2() 끝-----------------------------------");	
		}
		
		void in2_meth_3() {
			System.out.println("스태틱이너 meth_3() 실행");
		}
	}
	
}

public class InnerMain {

	public static void main(String[] args) {
		ClaOuter oo1 = new ClaOuter(10,"oo1_b");
		System.out.println("---------------------");
		ClaOuter oo2 = new ClaOuter(20,"oo2_b");
		System.out.println("---------------------");
		System.out.println("oo1:"+oo1.a+","+oo1.b);
		System.out.println("oo1.inn1_1:"+oo1.inn1_1.in1a+","+oo1.inn1_1.in1b);
		System.out.println("oo1.inn1_2:"+oo1.inn1_2.in1a+","+oo1.inn1_2.in1b);
		System.out.println("oo1.s1:"+oo1.s1.in2a+","+oo1.s1.in2b);
		System.out.println("oo1.s2:"+oo1.s2.in2a+","+oo1.s2.in2b);
		oo1.meth_1();
		oo1.meth_s2();
		oo1.inn1_1.in1_meth_1();
		oo1.inn1_1.in1_meth_s2();
		oo1.inn1_2.in1_meth_1();
		oo1.inn1_2.in1_meth_s2();
		oo1.s1.in2_meth_1();
		oo1.s1.in2_meth_s2();
		oo1.s2.in2_meth_1();
		oo1.s2.in2_meth_s2();
		System.out.println("oo2:"+oo2.a+","+oo2.b);
		System.out.println("oo2.inn1_1:"+oo2.inn1_1.in1a+","+oo2.inn1_1.in1b);
		oo2.meth_1();
		oo2.meth_s2();
		oo2.inn1_1.in1_meth_1();
		oo2.inn1_1.in1_meth_s2();
		
		System.out.println(" 기본 >>>>>>>>>>>>>>>>>>>>>>>>");
		
		//ClaOuter.Inner_1 oi1 = new ClaOuter.Inner_1(300,"메b");
		//ClaOuter.Inner_1 oi1 = new Inner_1(300,"메b");
		ClaOuter.Inner_1 oi1 = oo1.new Inner_1(300,"메b");
		ClaOuter.Inner_1 oi2 = oo1.new Inner_1(400,"메bb");
		//System.out.println("oi1:"+oi1.a+","+oi1.b);  outer 클래스의 멤버접근 불가
		System.out.println("oi1:"+oi1.in1a+","+oi1.in1b);
		//oi1.meth_1(); outer 클래스의 멤버접근 불가
		//oi1.meth_s2();
		oi1.in1_meth_1();
		oi1.in1_meth_s2();
		System.out.println("oi2:"+oi2.in1a+","+oi2.in1b);
		oi2.in1_meth_1();
		oi2.in1_meth_s2();
		
		System.out.println(" 스태틱 >>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		//ClaOuter.Inner_2 os1 = oo1.new Inner_2(500,"메스b");
		ClaOuter.Inner_2 os1 = new ClaOuter.Inner_2(500,"메스b");
		ClaOuter.Inner_2 os2 = new ClaOuter.Inner_2(600,"메스bb");
		System.out.println("os1:"+os1.in2a+","+os1.in2b);
		os1.in2_meth_1();
		os1.in2_meth_s2();
		System.out.println("os2:"+os2.in2a+","+os2.in2b);
		os2.in2_meth_1();
		os2.in2_meth_s2();
	}

}
