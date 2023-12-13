package basic_p;


// enum 정의 
// enum  enum명{}
enum AAA{
	aa,bb,cc,dd  // 열거 상수
}


//BBB [] bbb = {JUNG, KIM, YUN, PARK};
enum BBB{
	
	//열거데이터를 생성--> 생성자 정의에 맞게 생성해야 한다.
	JUNG("정운만",29,"여"), KIM("김명주",27,"남"), YUN("윤용준",27,"남"), PARK("박건우",33,"남"); //열거 상수 - > 변경불가 , 멤버요소가 있을 경우 ; 필수
	
	//각 열거 데이터의 멤버요소
	String name;
	int age;
	final String gender;
	
	BBB(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println(name()+"생성()");
	}
	
	void meth() {
		System.out.println(name()+" : "+name+" meth 실행()");
	}
	
	@Override
	public String toString() {
		
		return name()+" : "+name+","+age+","+gender;
	}
}


public class EnumMain {

	public static void main(String[] args) {
		//System.out.println(AAA);
		System.out.println(AAA.aa); //static 처럼 호출
		System.out.println(AAA.bb);
		System.out.println(AAA.cc);
		System.out.println(AAA.dd);
		
		AAA a1; //enum 변수 선언
		//AAA a2 = new AAA();  동적 할당 하지 않는다.
		
		//System.out.println(a1);
		a1 = AAA.aa;		//enum의 열거값
		System.out.println(a1);
		System.out.println(a1.name());//열거값의 문자열
		System.out.println(a1.ordinal());//열거값의 순서
		
		a1 = AAA.valueOf("bb");	//문자열로 열거값 호출
		System.out.println(a1);
		System.out.println("-----------------");
		AAA [] arr = AAA.values();
		for (AAA a : arr) {
			System.out.println(a);
		}
		System.out.println("-----------------");
		
		//compareTo 열거값의 위치 비교 : 음수 < 0 < 양수
		System.out.println(AAA.bb.compareTo(AAA.aa)); // 1 :: bb가 뒤에
		System.out.println(AAA.bb.compareTo(AAA.bb)); // 0 :: 위치 같음
		System.out.println(AAA.bb.compareTo(AAA.cc)); // -1 :: bb가 앞에
		System.out.println(AAA.bb.compareTo(AAA.dd)); // -2 :: bb가 앞에
		
		System.out.println("BBB >>>> ");
		System.out.println(BBB.JUNG); //toString() 호출
		System.out.println(BBB.KIM); //toString() 호출
		System.out.println(BBB.YUN); //toString() 호출
		System.out.println(BBB.PARK); //toString() 호출
		BBB.JUNG.name = "정대세";
		BBB.JUNG.age = 37;
		//BBB.JUNG.gender = "남"; final
		System.out.println("BBB.JUNG : "+BBB.JUNG.name+","+BBB.JUNG.age+","+BBB.JUNG.gender);
		BBB.JUNG.meth();
		System.out.println(BBB.JUNG.name());
		System.out.println(BBB.JUNG.ordinal());//열거값의 순서
		
		BBB b1 = BBB.valueOf("KIM");	//문자열로 열거값 호출
		System.out.println(b1);
		System.out.println("-----------------");
		BBB [] bArr = BBB.values();
		for (BBB b: bArr) {
			System.out.println(b);
		}
		System.out.println("-----------------");
	}

}
