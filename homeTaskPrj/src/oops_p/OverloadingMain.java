package oops_p;

class Overloading{
	void meth(int a, int b) {
		System.out.println("meth 실행:"+a+","+b);
	}
	
	/*
	void meth(int a, int b) {
		System.out.println("meth 실행:"+a+","+b);
	}*/
	
	void meth(int a, int b, int c) {
		System.out.println("갯수가 다른 경우:"+a+","+b+","+c);
	}
	void meth(int a, String b) {
		System.out.println("자료형이 다른 경우1:"+a+","+b);
	}
	void meth(String b, int a) {
		System.out.println("자료형이 다른 경우2:"+a+","+b);
	}
	
	/* 매개변수 이름이 다른 것으로  overloading 불가
	void meth(int a, int c) {
		System.out.println("meth 실행:"+a+","+b);
	}
	
	리턴형과 overloading 관계없음
	int meth(int a, int b) {
		System.out.println("meth 실행:"+a+","+b);
		return 100;
	}
	*/
	
	void shape(int r) {
		System.out.println("난 원이야");
	}
	void shape(int  h, int w) {
		System.out.println("난 직사각형이야");
	}
	void shape(int  h, int w, int a) {
		System.out.println("난 직각삼각형이야");
	}
	
	void drive(double dist) {
		int fuel = 5;
		System.out.println("스포츠카:"+dist/fuel);
	}
	
	void drive(double dist, int person) {
		int fuel = 10 - person/5;
		System.out.println("버스:"+dist/fuel);
	}
	
	void drive(double dist, String kind) {
		int fuel = 0;
		switch(kind) {
		case "모래":
			fuel = 15;
			break;
		case "물":
			fuel = 13;
			break;
		case "택배":
			fuel = 11;
			break;
		}
		
		System.out.println("트럭:"+dist/fuel);
	}
}


public class OverloadingMain {

	public static void main(String[] args) {
		Overloading old = new Overloading();
		old.meth(10, 20);
		old.meth(10, 20, 30);
		old.meth(10, "아기상어");
		old.meth("엄마상어",40);
		old.shape(5);
		old.shape(5,6);
		old.shape(5,6,8);
		
		/*
		 자동차 연료 소비를 출력하세요
		 같은 메소드 이름으로 구현 하세요
		 스포츠카 : 거리
		 연비 - 리터당 5km
		 버스 : 거리 , 사람수
		 연비 - 리터당 10km :사람 5명당 연비 1km 감소
		 트럭 : 거리, 화물종류
		 연비 - 모래 : 리터당 15km
		        물  : 리터당 13km
		        택배 : 리터당 11km 
		 * */
		
		old.drive(40);
		old.drive(40,13);
		old.drive(40,"모래");
	}

}
