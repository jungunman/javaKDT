package coll_p;

// generic : <QQ, RR> -> 타입의 추상화
// 인스턴스 변수 선언과 인스턴스 생성시 generic 명시
class GenAA<QQ, RR>{
	String a;
	QQ b;		//QQ b : generic 타입으로 멤버변수 선언
				
	
	public GenAA() {
		// TODO Auto-generated constructor stub
	}
	
	void meth_1(String aa, RR rr) {
		System.out.println("meth_1 ():"+aa+","+rr);
	}
	
	public GenAA(String a, QQ b) {
		this.a = a;
		this.b = b;
	}



	@Override
	public String toString() {
		return "GenAA [a=" + a + ", b=" + b + "]";
	}
	
	
}

public class GenericsMain {

	public static void main(String[] args) {
		GenAA a1 = new GenAA();// generic 명시하지 않을 경우 Object
		a1.a = "아기상어";
		a1.b = "엄마상어";
		a1.b = new int[2];
		a1.b = 123;
		a1.b = true;
		System.out.println(a1);
		a1.meth_1("장수풍뎅이", true);
		a1.meth_1("사슴벌레", 123);
		System.out.println("-----------------");
		GenAA a2 = new GenAA<String,Integer>();//생성시 generic 지정
		a2.a = "나는무너";
		a2.b = "꿈을꾸는";
		a2.b = 456;		//선언시 generic  지정이 아니므로 Object 대입가능 
		a2.b = false;
		a2.b = new String[2];
		System.out.println(a2);
		a2.meth_1("잠자리", true);//선언시 generic  지정이 아니므로 Object 대입가능
		a2.meth_1("매미", 123);
		System.out.println("-----------------");
		GenAA a3 = new GenAA<String,Integer>("토끼","거북이");//생성시 generic 과 맞춰야 한다. 
		//GenAA a4 = new GenAA<String,Integer>("토끼",123);//QQ : String 이므로 123 에러
		
		//인스턴스 변수 선언시 generic 명시
		GenAA<String,Integer>a5 = new GenAA();
		a5.a = "아기상어";
		a5.b = "엄마상어";	//멤버 변수의 generic : String으로 정상
		//a5.b = 123;		멤버 변수의 generic -> Integer 에러
		//a5.b = true;
		//a5.b = new int[2];
		System.out.println(a5);
		//a5.meth_1("잠자리", true);//generic : Integer -> Boolean 에러
		a5.meth_1("매미", 123);//선언시 generic : Integer 로 정상
		
		System.out.println("-----------------");
		System.out.println(a1.b +","+a5.b);
		//boolean bo = a1.b;  a1.b : Object
		boolean bo = (boolean)a1.b;
		String str = a5.b;	//generic :String 형변환 필요없음
		System.out.println(bo +","+str);
	}

}
