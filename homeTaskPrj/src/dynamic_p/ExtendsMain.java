package dynamic_p;

class Par1{
	int a = 10;
	String b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
	
	void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}
}

class Uncle{
	
}

//상속
// class 자식클래스명  extends 부모클래스명
class Child1 extends Par1{
//class Child1 extends Par1, Uncle{  다중 상속 불가
	
	String c = "자식1c";
	
	void meth_3() {
		System.out.println("자식1 meth_3() 실행");
	}
}

class Child2 extends Par1{
	String d= "자식2d";
	
	void meth_4() {
		System.out.println("자식2 meth_4() 실행");
	}
}

public class ExtendsMain {

	public static void main(String[] args) {
		Par1 pp1 = new Par1();
		Child1 cc1 = new Child1();
		Child2 cc2 = new Child2();
		
		System.out.println("pp1:"+pp1.a+","+pp1.b);
		//부모 클래스 -> 자식 멤버요소 접근불가
		//System.out.println("pp1:"+pp1.a+","+pp1.b+","+pp1.c);
		pp1.meth_1();
		pp1.meth_2();
		//pp1.meth_3();
		System.out.println("cc1:"+cc1.c);
		//자식 클래스 -> 부모 멤버요소 접근 가능
		System.out.println("cc1:"+cc1.a+","+cc1.b+","+cc1.c);
		//형제 클래스의 멤버 접근 불가
		//System.out.println("cc1:"+cc1.a+","+cc1.b+","+cc1.c+","+cc1.d);
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		//cc1.meth_4();
		
		//System.out.println("cc2:"+cc2.a+","+cc2.b+","+cc2.c+","+cc2.d);
		System.out.println("cc2:"+cc2.a+","+cc2.b+","+cc2.d);
		cc2.meth_1();
		cc2.meth_2();
		//cc2.meth_3();
		cc2.meth_4();
	}

}
