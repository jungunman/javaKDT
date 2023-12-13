package dynamic_p;

//추상클래스 : 1개 이상의 추상 메소드가 포함된 경우 추상클래스로 명시해야 한다.
//abstract class 클래스명{
abstract class AbsPar{
	
	String a = "부모a";
	//abstract String b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
	
	//추상메소드 : 메소드 선언만 명시 - 정의부(함수내용)은 명시하지 않는다
	//          추상메소드 선언시 클래스를 추상클래스로 명시해야 한다.
	//abstract 리턴형 메소드이름(...);
	abstract void meth_2();
	
	/* 일반메소드는 추상화 할 수 없다 - 메소드 정의부 재거 필요
	abstract void meth_3() {
		System.out.println("부모 meth_3() 실행");
	}
	
	static 메소드는 추상화 불가 - 클래스영역에서 실행 - 재정의하지 않고 직접호출가능해야 함
	abstract static void meth_4() {
		System.out.println("부모 static meth_4() 실행");
	}
	*/
}

//추상클래스를 상속받은 자식클래스 - 추상메소드 재정의 강제화
class AbsChild extends AbsPar{
	void meth_2() {
		System.out.println("자식 재정의 meth_2() 실행");
	}
}


public class AbstractMain {

	public static void main(String[] args) {

		AbsChild cc = new AbsChild();
		System.out.println("cc:"+cc.a);
		cc.meth_1();
		cc.meth_2();

		//AbsPar pp = new AbsPar();
		AbsPar pp1 = new AbsPar() { //클래스 정의부의 확장영역
									//클래스 생성시 지정한다.
			void meth_2() {
				System.out.println("부모1 생성시 재정의 meth_2() 실행");
			}
		};
		
		System.out.println("pp1:"+pp1.a);
		pp1.meth_1();
		pp1.meth_2();
		
		AbsPar pp2 = new AbsPar() { 
			//클래스 정의부의 확장영역
			//클래스 생성시 지정한다.
			
			String b = "생성시b";
			void meth_1() {
				System.out.println("부모2 생성시 재정의 meth_1() 실행");
			}
			
			void meth_2() {
				System.out.println("부모2 생성시 재정의 meth_2() 실행:"+a+","+b);
			}
			
			void meth_3() {
				System.out.println("부모2 생성시 meth_3() 실행");
			}
		};
		
		System.out.println("pp2:"+pp2.a);
		//System.out.println("pp2:"+pp2.a+","+pp2.b);
		pp2.meth_1();
		pp2.meth_2();
		//pp2.meth_3();
		
		System.out.println("--------------");
		System.out.println(new AbsChild().a);
		new AbsChild().meth_1();
		new AbsChild().meth_2();
		System.out.println("--------------");
		new AbsChild() {
			void meth_1() {
				System.out.println("자식 생성시 재정의 meth_1()");
			}
		}.meth_1();
		
		new AbsChild() {
			void meth_3() {
				System.out.println("자식 생성시 재정의 meth_3()");
			}
		}.meth_3();
		
		
		System.out.println(new AbsChild() {
			String xx = "생성시xx";
			void meth_3() {
				System.out.println("자식 생성시 재정의 meth_3()");
			}
		}.xx);
	}

}
