package dynamic_p;

class Grand { //extends OvChild{
	String g1 = "할아버지g1",  g2 = "할아버지g2";
	
	void meth_g1() {
		System.out.println("할아버지 meth_g1() 실행");
	}
	void meth_g2() {
		System.out.println("할아버지 meth_g2() 실행");
	}
}


class OvPar extends Grand{
	String a = "부모a", b = "부모b", g2 = "부모g2";
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
	void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}
	void meth_g2() {
		System.out.println("부모 재정의 meth_g2() 실행");
	}
}

class OvChild extends OvPar{
	String c = "자식c";
	
	//hiding - 상속관계에서 부모클래스의 멤버변수와 같은이름으로 멤벼변수를 정의
	String b = "자식b"; 
	
	void meth_2() { 
		//overriding - 상속관계에서 부모 클래스의 메소드와 같은 이름으로 메소드를 정의 
		System.out.println("자식 meth_2() 실행");
	}
	void meth_3() {
		System.out.println("자식 meth_3() 시작:"+this.a+","+this.b+","+this.c);
		//System.out.println(super.a+","+super.b+","+super.c);
		System.out.println(super.a+","+super.b); //super : 부모 접근자 - 클래스 정의부에서만 사용
		this.meth_1();
		this.meth_2();
		super.meth_1();
		super.meth_2();
		System.out.println(super.g1+","+super.g2);
		//System.out.println(super.g1+","+super.super.g2);
		super.meth_g1();
		super.meth_g2();
		//super.super.meth_g2();
		//super.Grand.meth_g2();
		System.out.println("자식 meth_3() 끝---------------");
	}
}
public class OverridingMain {

	public static void main(String[] args) {
		OvPar pp = new OvPar();
		OvChild cc =new OvChild();
		System.out.println("pp:"+pp.a+","+pp.b);
		pp.meth_1();
		pp.meth_2();
		
		System.out.println("cc:"+cc.a+","+cc.b+","+cc.c);
		//System.out.println("cc:"+cc.super.a+","+cc.super.b+","+cc.c);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		System.out.println("cc:"+cc.g1+","+cc.g2);
		cc.meth_g1();
		cc.meth_g2();
	}

}
