package dynamic_p;

class ConPar{
	String name;
	int age;
	boolean marriage;
	ConPar(){
//		name = "정우성";
//		age = 51;
//		marriage = false;
		//ConPar("정우성",51,false);
		//System.out.println(); 생성자 호출시 생성자 이전 코드실행 불가
		this("정우성",51,false); //클래스의 다른 생성자를 호출하여 위임한다.
		//this("정우성",age,false); 멤버변수를 위임 생성자의 매개변수로 대입 불가!
		System.out.println("부모 기본 생성자:"+mems());
	}
	
	
	
	ConPar(String name) {
		this.name = name;
		System.out.println("부모 생성자1:"+mems());
	}
	
	



	ConPar(String name, int age, boolean marriage) {
		///  코드 실행 이전에 인스턴스를 생성하고 멤버변수 선언 및 초기화 후 
		//   코드 실행 한다.
		
		this.name = name;
		this.age = age;
		this.marriage = marriage;
		System.out.println("부모 생성자2:"+mems());
	}



	String mems() {
		return name+","+age+","+marriage;
	}
}

public class ConstMain {

	public static void main(String[] args) {
		ConPar pp1 = new ConPar();
		System.out.println("------------------");
		new ConPar("정좌성");
		System.out.println("------------------");
		new ConPar("정남성", 41, true);
		System.out.println("------------------");
	}

}
