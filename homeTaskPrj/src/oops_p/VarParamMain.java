package oops_p;

import java.util.Arrays;

class VarParam{
	
	void meth_1(String a, int b) {
		System.out.println("meth_1 : "+a+","+b);
	}
	void meth_2(String a, int [] arr) {
		System.out.println("meth_2 : "+a+","+Arrays.toString(arr));
	}
	
	//int...arr : 배열을 매개변수로 받음
	//            arr 위치의 이후 값을 묶어 배열로 처리
	//            매개변수 맨뒤에 1개만 가능
	void meth_3(String a, int ... arr) {
		System.out.println("meth_3 : "+a+","+Arrays.toString(arr));
	}
	
	void meth_4(String a, int [] arr, int b) {
		System.out.println("meth_4 : "+a+","+Arrays.toString(arr));
	}
	
	/*가변 매개변수는 매개변수의 맨 뒤에만 가능
	void meth_5(String a, int ... arr, String b) {
		System.out.println("meth_5 : "+a+","+Arrays.toString(arr));
	}
	
	가변 매개변수는 1개만 가능
	void meth_6(String a, int ... arr1, int ...arr2) {
		System.out.println("meth_6 : "+a+","+Arrays.toString(arr));
	}
	 */
}
public class VarParamMain {

	public static void main(String[] args) {
		
		int [] aaa = {11,22,33,44};
		
		VarParam vp = new VarParam();
		vp.meth_1("아기상어", 10);
		vp.meth_2("엄마상어", aaa);
		vp.meth_3("아빠상어", aaa);
		//vp.meth_2("할머니상어", 999,888,777,666);
		vp.meth_3("할아버지상어", 999,888,777,666);
		vp.meth_3("할아버지상어", 999);
		vp.meth_3("할아버지상어");
	}

}
