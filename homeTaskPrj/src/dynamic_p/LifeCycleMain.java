package dynamic_p;
/*
클래스 영역
    >static 영역
      1   static 부모 변수 공간할당 (초기값:0, null)(static 변수는 하이딩이 발생되지 않는다)
      2    static 부모 메소드
      3   static 부모 변수 값 대입
      4   static 자식 변수 공간할당 (초기값:0, null)(static 변수는 하이딩이 발생되지 않는다)
      5   static 자식 메소드      (여기서 오버라이딩이 발생)
      6   static 자식 변수 값 대입
    >method 영역
     9. 인스턴스 부모 메소드 
     10. 인스턴스 자식 메소드 (여기서 오버라이딩이 발생)

Heap 영역

      7. 인스턴스 부모 변수 메모리 공간 확보 (힙)
      8. 인스턴스 자식 변수 메모리 공간 확보 (힙)
----------------------------------------------------------------------------------

     11. 인스턴스 부모 변수 값 할당
         -이때 메소드를 호출 할 경우 오버라이딩의 유무에 따라 메소드를 실행하게 된다.
         - 만일 실행되는 메소드가 오버라이딩 된 자식 클래스의 것인 경우
         - 실행되는 메소드에서 자식 멤버 변수를 호출 할 경우 자식 멤버변수인 경우 값을 할당 받지 않았기에
             메모리 초기값이 들어오게 된다. 숫자 : 0.  문자열 : null

     12. 부모생성자 
     13. 인스턴스 자식 변수 값 할당 
     14. 자식 생성자
 * */
class LifePar{
	int pa = setPA();
	int pf = setFF();
	
	int setPA() {
		System.out.println("부모 인스턴스 setPA() 실행");
		return 10;
	}
	
	int setFF() {
		System.out.println("부모 인스턴스 setFF() 실행");
		return 70;
	}
	
	static int psa = setPSA();
	static int psc = LifeChild.setCSC();
	static int ppp = meth_p();
	
	static int setPSA() {
		System.out.println("부모 스태틱 setPSA() 실행");
		return 1000;
	}
	
	static int meth_p() {
		System.out.println("부모 스태틱 meth_p() 실행");
		return 4000;
	}
	
	
	LifePar(String pname) {
		System.out.println("부모 생성자 : "+pname);
	}
}


class LifeChild extends LifePar{
	int cb = setCB();
	
	int setCB() {
		System.out.println("자식 인스턴스 setCB() 실행");
		return 20;
	}
	
	static int csb = setCSB();
	static int ccc = 3000;
	static int setCSB() {
		System.out.println("자식 스태틱 setCSB() 실행");
		return 2000;
	}
	static int setCSC() {
		System.out.println("자식 스태틱 setCSC() 실행");
		return ccc;
	}
	
	static int meth_p() { //static 오버라이딩
		System.out.println("자식 스태틱 meth_p() 실행");
		return 4567;
	}
	
	int setFF() { //instance 오버라이딩
		System.out.println("자식 인스턴스 setFF() 실행");
		return 987;
	}
	
	LifeChild() {
		super("아기상어");
		System.out.println("자식 생성자");
	}
}


public class LifeCycleMain {

	public static void main(String[] args) {
		//LifePar pp = new LifePar("엄마상어");
		System.out.println("---------------------");
		LifeChild cc = new LifeChild();
		System.out.println("---------------------");
		System.out.println("cc 스태틳:"+cc.psa+","+cc.psc+","+cc.csb+","+cc.ccc+","+cc.ppp);
		System.out.println("cc 인스턴스:"+cc.pa+","+cc.cb+","+cc.pf);
		cc.meth_p();
	}

}
