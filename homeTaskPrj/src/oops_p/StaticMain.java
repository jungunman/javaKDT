package oops_p;


class ClaStatic{
	
	int a = 10;
	
	
	int b = setB();
	int c = setC();
	int d = 40;
	
	int setB() {
		System.out.println("setB() 실행");
		return a;
	}
	
	int setC() {
		System.out.println("setC() 실행");
		return d;
	}
	
	void meth_1() {
		System.out.println("인스턴스 메소드 1");
	}
	
	static void meth_s1() {
		System.out.println("스태틱 메소드 s1");
	}
	static int sa = 1000;
	//static int sb = setB();
	static int sb = setSB();
	
	static int setSB() {
		System.out.println("setSB() 실행");
		//return a;
		return 2000;
	}
	
	
	void meth_2() {
		//인스턴스 메소드 : 인스턴스, 스태틱 모두 접근 가능
		System.out.println("인스턴스 메소드 2 시작 "+a+","+sa+"------------");
		meth_3();
		meth_s3();
		System.out.println("인스턴스 메소드 2 끝------------");
	}
	
	void meth_3() {
		System.out.println("인스턴스 메소드 3");
	}
	
	static void meth_s2() {
		//스태틱 메소드 : 스태틱 만 접근가능,  인스턴스 접근 불가
		//System.out.println("스태틱 메소드 s2 시작 "+a+","+sa+"------------");
		System.out.println("스태틱 메소드 s2 시작 "+sa+"------------");
		//meth_3();
		meth_s3();
		System.out.println("스태틱 메소드 s2 끝 --------------");
	}
	
	static void meth_s3() {
		System.out.println("스태틱 메소드 s3");
	}
	
	
}

public class StaticMain {
	static int aa = 1234;
	
	void meth_main() {
		System.out.println("인스턴스 메소드 main");
	}
	
	static void meth_smain() {
		System.out.println("스태틱 메소드 smain");
	}
	
	public static void main(String[] ytvyutgfhjyugygb) {
		System.out.println(Math.PI);
		//System.out.println("ClaStatic : "+ ClaStatic.sa);
		//ClaStatic.meth_1();
		//ClaStatic.meth_s1();
		System.out.println(aa);
		//meth_main();
		meth_smain();
		System.out.println("----------------1");
		ClaStatic cs1 = new ClaStatic();
		System.out.println("----------------2");
		ClaStatic cs2 = new ClaStatic();
		System.out.println("----------------3");
		
		System.out.println("ClaStatic : "+ ClaStatic.sa);
		//System.out.println("ClaStatic : "+ClaStatic.a +" , "+ ClaStatic.sa);
		System.out.println("cs1 : "+cs1.a +" , "+cs1.b +" , "+cs1.c +" , "+cs1.d +" , "+ cs1.sa);
		System.out.println("cs2 : "+cs2.a +" , "+cs2.b +" , "+cs2.c +" , "+cs2.d +" , "+ cs2.sa);
		
		cs1.a = 20;
		cs1.sa = 2000;
		System.out.println("cs1 : "+cs1.a +" , "+ cs1.sa);
		System.out.println("cs2 : "+cs2.a +" , "+ cs2.sa);
		
		cs1.meth_1();
		cs1.meth_s1();
		cs2.meth_1();
		cs2.meth_s1();
		
		//return 1234;
		/*
		 //솟수 를 재귀메소드를 이용하여 입력한 숫자까지
         //2~입력한 숫자의 솟수들의 합을 구하세요		 
		 * */
		
		cs1.meth_2();
		cs1.meth_s2();
	}

}
