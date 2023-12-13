package oops_p;

class ConAAA{

	int b = setB();
	
	int setB(){
		System.out.println("instance setB() 실행");
		return 20;
	}
	
	static int a = setA();
	
	static int setA(){
		System.out.println("static setA() 실행");
		return 10;
	}
	
	//생성자 정의
	ConAAA(String name, int b){
		System.out.println("사용자 정의 생성자 실행:"+a+","+this.b+","+name+","+b);
		a = 1111;
		//this.b = 2222;
		this.b = b;
	}
	
	ConAAA(){
		System.out.println("기본 생성자 실행");
		
		b = 7766;
		a = b + 100;
	}
	
	void meth_1() {
		//ConAAA(); 생성자 호출 불가
		System.out.println("meth_1 실행");
	}
	
}
public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("--------------");
		ConAAA ca = new ConAAA("아기상어",123);
		System.out.println("--------------");
		ConAAA cb = new ConAAA();
		System.out.println("--------------");
		System.out.println(ca.a+" , "+ca.b);
		ca.meth_1();
		//ca.ConAAA();  생성자는 인스턴스 생성시 최초 1회만 실행
		//ca.new ConAAA();
	}

}
