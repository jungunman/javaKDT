package pac_1;

import java.util.Arrays;

class PPP{
	public String a = "public_a";
	protected String b = "protected_b";
	String c = "default_c";
	
	private String d = "private_d";
	//private - 클래스 정의부에서만 접근 가능
	//          상속불가 : 자식클래스에서 접근 불가
	
	void meth_1() {
		System.out.println("meth_1 시작 : "+a+","+b+","+c+","+d);
		meth_2();
		System.out.println("meth_1 끝 ------------------ ");
	}
	
	private void meth_2() {
		System.out.println("private meth_2 실행 ");
	}
	
	String getD() {
		return d;
	}
	
	void setD(String d) {
		this.d = d;
	}
	
	private int [] arr = {11,22,33,44};
	
	int [] getArr() {//배열 주소 리턴
		return arr;
	}
	
	int getArr2(int index) {//배열 원소 값 리턴
		return arr[index];
	}
	void setArr(int [] arr) { //배열 주소를 대입
		this.arr = arr;
	}
	void setArr2(int index, int value) { //배열 원소에 대입
		if(arr.length<=index) {
			System.out.println("setArr2 인덱스 에러");
			return;
		}
		arr[index] = value;
	}
}

class PPPChild extends PPP{
	void meth_3() {
		//부모클래스의 private 접근불가
		//System.out.println("자식 meth_3 실행 : "+a+","+b+","+c+","+d);
		System.out.println("자식 meth_3 실행 : "+a+","+b+","+c);
		//meth_2();
		//super.meth_2();
	}
	
	void meth_2() {  //부모메소드를 재정의 한 것 이 아님
		
		System.out.println("자식 meth_2 실행 ");
	}
	
}


public class PFMain {

	public static void main(String[] args) {
		PPP pp = new PPP();
		
		System.out.println("pp_public:"+pp.a);
		System.out.println("pp_protected:"+pp.b);
		System.out.println("pp_default:"+pp.c);
		//System.out.println("pp_private:"+pp.d); 인스턴스변수로 접근불가
		pp.meth_1();
		//pp.meth_2();
		pp.setD("입력받은d");
		System.out.println("pp.getD():"+pp.getD());
		//System.out.println("pp.arr:"+pp.arr);
		//pp.arr[1] = 1111;
		//pp.arr = new int[] {987,654};
		
		System.out.println("pp.getArr():"+Arrays.toString(pp.getArr()));
		pp.getArr()[2] = 3333; 
		System.out.println("pp.getArr():"+Arrays.toString(pp.getArr()));
		System.out.println("pp.getArr2(1):"+pp.getArr2(1));
		
		pp.setArr(new int[] {123,456,789});
		System.out.println("pp.getArr():"+Arrays.toString(pp.getArr()));
		pp.setArr2(1, 753);
		System.out.println("pp.getArr():"+Arrays.toString(pp.getArr()));
		pp.setArr2(10, 112233);
		
		
		PPP pp1 = new PPPChild();
		PPPChild cc = new PPPChild();
		//pp1.meth_2();
		cc.meth_2();
	}

}

