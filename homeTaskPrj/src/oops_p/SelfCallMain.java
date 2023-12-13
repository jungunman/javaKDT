package oops_p;


class SelfCall{
	
	String pre = "";
	
	int meth(int no) {
		
		int res = no;
		
		String myPre = pre;
		pre += "\t";
		
		System.out.println(myPre + "meth 시작 "+no+" , "+res);
		
		if(no > 0) {	// no > 0 : 조건
			res += meth(no-1); // no - 1 : 증감
		}
		System.out.println(myPre + "meth 끝 "+no+" , "+res);
		
		return res;
	}
	
	int odd(int no) {
		int res = 0;
		if(no%2==1) {
			res = no;
		}
		
		if(no>0) {
			res += odd(no-1);
		}
		System.out.println("odd : "+no+","+res);
		return res;
	}
}

public class SelfCallMain {

	public static void main(String[] args) {
		SelfCall sc = new SelfCall();
		
		int rr = sc.meth(3);  //3 - 초기값
		System.out.println("rr : "+ rr);
		rr = sc.odd(10) ;
		System.out.println("rr : "+ rr);
	}

}
