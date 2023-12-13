package oops_p;

import java.util.Arrays;

class ClaReturn{
	int meth_1() {
		System.out.println("meth_1() 실행");
		return 100;
	}
	
	/*
	int, int meth_2() {
		System.out.println("meth_2() 실행");
		return 100, 200;
	}
	
	int meth_3() {
		System.out.println("meth_3() 실행");
		return 100, 200;
	}
	
	int meth_4() {
		System.out.println("meth_4() 실행");
		return ;
	}*/
	
	int [] meth_5() {
		System.out.println("meth_5() 실행");
		return new int[] {10,20,30};
	}
	
	void meth_6() {
		System.out.println("meth_6() 실행 1");
		//return;
		System.out.println("meth_6() 실행 2");
		//return;
		System.out.println("meth_6() 실행 3");
		return;  //return 이후 실행구문 불가
	}
	
	void meth_7(int a) {
		System.out.println("meth_7() 실행 1------------");
		if(a>=90) {
			return;
		}
		System.out.println("meth_7() 실행 2");
		if(a>=50) {
			return;
		}
		System.out.println("meth_7() 실행 3");
		return;  //return 이후 실행구문 불가
	}
}
public class ReturnMain {

	public static void main(String[] args) {
		ClaReturn cr = new ClaReturn();
		int r1 = cr.meth_1();
		System.out.println("r1 : "+ r1);
		int [] r5 = cr.meth_5();
		System.out.println("r5 : "+ Arrays.toString(r5));
		
		cr.meth_6();
		cr.meth_7(100);
		cr.meth_7(70);
		cr.meth_7(30);
	}

}

