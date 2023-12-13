package pac_1;

import pac_2.DDD;

class DDDChild extends DDD{
	void meth_2() {
		//System.out.println("자식 meth_2 실행 : "+t1+","+t2+","+t3+","+t4);
		//다른 패키지 부모클래스 : public, protected 접근 가능
		//                    default, private 접근 불가
		System.out.println("자식 meth_2 실행 : "+t1+","+t2);
	}
}

class Par{
	public String t1 = "Par.t1";
	protected String t2 = "Par.t2";
	String t3 = "Par.t3";
	private String t4 = "Par.t4";
}

class Child extends Par{
	void meth_2() {
		//System.out.println("자식 meth_2 실행 : "+t1+","+t2+","+t3+","+t4);
		//같은 패키지 부모클래스 : public, protected, default 접근 가능
		//                    private 접근 불가
		System.out.println("자식 meth_2 실행 : "+t1+","+t2+","+t3);
	}
}

public class ProtectedMain {

	public static void main(String[] args) {
		DDD p2d = new DDD();
		DDDChild dc = new DDDChild(); 
		Child cc = new Child();
		//다른 패키지 public 클래스 -> public 만 접근가능
		//System.out.println("p2d:"+p2d.t1+","+p2d.t2+","+p2d.t3+","+p2d.t4);
		System.out.println("p2d:"+p2d.t1);
		p2d.meth_1();
		//System.out.println("dc:"+dc.t1+","+dc.t2+","+dc.t3+","+dc.t4);
		System.out.println("dc:"+dc.t1);
		dc.meth_2();
		dc.meth_1();
		//System.out.println("cc:"+cc.t1+","+cc.t2+","+cc.t3+","+cc.t4);
		System.out.println("cc:"+cc.t1+","+cc.t2+","+cc.t3);
		cc.meth_2();
	}

}

