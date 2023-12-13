package oops_p;

class SiAAA{
	int a = 10;
	String b = "아기상어";
	
	@Override
	public String toString() {
		return "SiAAA [a=" + a + ", b=" + b + "]";
	}
}

class SiBBB{
	int a = 10;
	String b = "아기상어";
	
	static private SiBBB me = null;
	
	private SiBBB() {
		System.out.println("SiBBB 기본생성자");
	}
	
	static SiBBB getInstance() {
		System.out.println("SiBBB.getInstance() 실행");
		if(me == null) {
			me = new SiBBB();
		}
		
		return me;
	}
	
	@Override
	public String toString() {
		return "SiBBB [a=" + a + ", b=" + b + "]";
	}
}

public class SingleToneMain {

	public static void main(String[] args) {
		SiAAA sa1 = new SiAAA();
		SiAAA sa2 = new SiAAA();
		sa1.a = 20;
		sa2.b = "엄마상어";
		System.out.println(sa1);
		System.out.println(sa2);
		System.out.println("--------------------");
		//SiBBB sb1 = new SiBBB();
		//SiBBB sb2 = new SiBBB();
		SiBBB sb1 = SiBBB.getInstance();
		SiBBB sb2 = SiBBB.getInstance();
		sb1.a = 20;
		sb2.b = "엄마상어";
		System.out.println(sb1);
		System.out.println(sb2);
	}

}
