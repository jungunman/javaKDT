package pac_2;

public class DDD {
	public String t1 = "pac_2.DDD.t1";
	protected String t2 = "pac_2.DDD.t2";
	String t3 = "pac_2.DDD.t3";
	private String t4 = "pac_2.DDD.t4";
	
	public void meth_1() {
		System.out.println("DDD meth_1 실행 : "+t1+","+t2+","+t3+","+t4);
	}
}

/*
 public 클래스 : java 대표 클래스만 가능 --> 대표클래스 java 파일명과 동일한 클래스
 
public class FFF{
	public String t1 = "pac_2.FFF.t1";
}
*/

class FFF{ //다른 패키지에서 호출 불가
	public String t1 = "pac_2.FFF.t1";
}