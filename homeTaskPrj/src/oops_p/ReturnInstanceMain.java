package oops_p;

import java.util.Arrays;

class ReturnInstance{
	
	int [] arr = {101,202,303};
	
	int meth_1() {
		System.out.println("meth_1() 실행");
		return 10;
	}
	
	int [] meth_2() {
		System.out.println("meth_2() 실행");
		return new int[] {11,22,33};
	}
	
	int [] meth_3() {
		System.out.println("meth_3() 실행");
		return arr;
	}
	
	void meth_4(int a, int [] qqq, int [] rrr) {
		System.out.println("meth_4() 시작 :"+a+","+qqq+Arrays.toString(qqq));
		System.out.println("rrr :"+rrr+Arrays.toString(rrr));
		a = 321;
		qqq[1] = 1020; //원소 대입
		int [] buf = new int[] {6655,4433}; //
		rrr = buf; // 주소 대입
		rrr[1] = 90123;
		System.out.println("rrr :"+rrr+Arrays.toString(rrr));
		System.out.println("meth_4() 끝 :"+a+","+qqq+Arrays.toString(qqq));
	}
	
}

public class ReturnInstanceMain {

	public static void main(String[] args) {
		ReturnInstance ri = new ReturnInstance();
		int r1 = ri.meth_1();
		System.out.println("r1:"+r1);
		int [] r2 = ri.meth_2();
		System.out.println("r2:"+r2+" "+Arrays.toString(r2));
		r2[1] = 234;
		System.out.println("r2:"+r2+" "+Arrays.toString(r2));
		System.out.println("meth_1:"+(ri.meth_1()+5));
		ri.meth_2()[1] = 456;
		System.out.println("meth_2(): "+Arrays.toString(ri.meth_2()));
		int [] r3 = ri.meth_3();
		r3[1] = 2123;
		System.out.println("r3:"+r3+" "+Arrays.toString(r3));
		
		System.out.println("ri.arr:"+ri.arr+" "+Arrays.toString(ri.arr));
		ri.meth_3()[2] = 3456;
		System.out.println("r3:"+r3+" "+Arrays.toString(r3));
			
		System.out.println("ri.arr:"+ri.arr+" "+Arrays.toString(ri.arr));
		System.out.println("meth_3(): "+Arrays.toString(ri.meth_3()));
		
		int zz = 432;
		int [] xx = {987,765,543};
		int [] yy = {9988,7766,5544};
		System.out.println("main1 :"+zz+","+xx+Arrays.toString(xx));
		System.out.println("main yy :"+yy+Arrays.toString(yy));
		ri.meth_4(zz, xx, yy);
		System.out.println("main2 :"+zz+","+xx+Arrays.toString(xx));
		System.out.println("main yy :"+yy+Arrays.toString(yy));
	}

}
