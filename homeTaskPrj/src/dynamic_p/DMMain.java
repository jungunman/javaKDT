package dynamic_p;

class DMPar{
	String a = "부모a", b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1()  실행");
	}
	void meth_2() {
		System.out.println("부모 meth_2()  실행");
	}
}

class UncleA{
	String a = "부모a", b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1()  실행");
	}
	void meth_2() {
		System.out.println("부모 meth_2()  실행");
	}
}


class DMChild extends DMPar{
	String c = "자식c", b = "자식b";
	
	void meth_3() {
		System.out.println("자식 meth_3()  실행");
	}
	void meth_2() {
		System.out.println("자식 재정의 meth_2()  실행:"+a+","+b+","+c);
	}
}

public class DMMain {

	public static void main(String[] args) {
		
		 
		DMPar pp = new DMPar();
		
		DMPar pc = new DMChild();
		//  1    3     2    
		//1. pc 변수는 DMPar로 인식할꺼야
		//2. DMChild를 생성했어
		//3. pc에 객체주소를 대입 --> 자식인스턴스의 멤버를 부모의 멤버로 인식하여 사용
		
		
		//DMChild cp = new DMPar();
		DMChild cc = new DMChild();
		
		System.out.println("pp:"+pp.a+","+pp.b);
		//System.out.println("pp:"+pp.a+","+pp.b+","+pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		System.out.println("pc:"+pc.a+","+pc.b);
		//System.out.println("pc:"+pc.a+","+pc.b+","+pc.c);
		pc.meth_1();
		pc.meth_2();
		//pc.meth_3();
		
		cc.c = "아들씨";
		System.out.println("cc:"+cc.a+","+cc.b+","+cc.c);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		DMPar pcc = cc;  //upcasting , 자동형변환 
		//System.out.println("pcc:"+pcc.a+","+pcc.b+","+pcc.c);
		System.out.println("pcc:"+pcc.a+","+pcc.b);
		pcc.meth_1();
		pcc.meth_2();
		//pcc.meth_3();
		
		DMChild cpcc = (DMChild)pcc;  //downcasting , 강제형변환
		System.out.println("cpcc:"+cpcc.a+","+cpcc.b+","+cpcc.c);
		cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
		
		System.out.println("pp - "+pp + ": "+ pp.getClass().getName());
		System.out.println("pc - "+pc + ": "+ pc.getClass().getName());
		System.out.println("cc - "+cc + ": "+ cc.getClass().getName());
		System.out.println("pcc - "+pcc + ": "+ cc.getClass().getName());
		System.out.println("cpcc - "+cpcc + ": "+ cc.getClass().getName());
		
		//DMChild cpp = (DMChild)pp;
		//UncleA uu = (UncleA)pp; //상속관계만 형변환 가능
		
		//인스턴스변수 instanceof 클래스명 : 변수가 클래스로의 대입유무
		//                               상속관계의 클래스만 가능
		System.out.println(pp instanceof DMChild);  
		System.out.println(pc instanceof DMChild);
		System.out.println(cc instanceof DMChild);
		System.out.println(pp instanceof DMPar);
		System.out.println(pc instanceof DMPar);
		System.out.println(cc instanceof DMPar);
		//System.out.println(pp instanceof UncleA);
		
	}

}
