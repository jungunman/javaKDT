package oops_p;

class ClaJVM{
	int a = 10000;
	void meth_1() {
		int b = 10;
		System.out.println("meth_1 시작:"+a+" , "+ b);
		meth_2();
		a++;
		b++;
		
		/* 메소드 내부에서 메소드 정의 불가
		void inner_1() {
			
		}*/
		
		//메소드 내부에서 클래스 정의 가능 -->inner 클래스에서 강의할 예정
		class QWER{
			void asdf() {
				
			}
		}
		
		QWER qqq = new QWER();
		
		System.out.println("meth_1 끝:"+a+" , "+ b);
	}
	
	void meth_2() {
		int c = 100;
		System.out.println("\t meth_2 시작:"+a+" , "+ c);
		meth_3();
		a++;
		c++;
		System.out.println("\t meth_2 끝:"+a+" , "+ c);
	}
	
	void meth_3() {
		int d = 1000;
		System.out.println("\t\t meth_3 시작:"+a+" , "+ d);
		//System.out.println("\t\t meth_3 시작:"+a+" , "+ c);
		//meth_1();
		a++;
		d++;
		
		System.out.println("\t\t meth_3 끝:"+a+" , "+ d);
	}
}
public class JVMMain {

	public static void main(String[] args) {
		ClaJVM cj = new ClaJVM();
		System.out.println(cj.a);
		
		cj.meth_1();
		
		System.out.println(cj.a);

	}

}
