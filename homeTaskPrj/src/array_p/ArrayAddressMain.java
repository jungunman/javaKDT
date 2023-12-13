package array_p;

import java.util.Arrays;

public class ArrayAddressMain {

	public static void main(String[] args) {
		int [] arr1 = {11,22,33};
		int [] arr2 = {11,22,33};
		int [] arr3 = new int[5];
		int [] arr4 = new int[] {0,0,0,0,0};
		int [] arr5 = new int[] {11,22,33};
		
		System.out.println("arr1 : "+ arr1 + Arrays.toString(arr1));
		System.out.println("arr2 : "+ arr2 + Arrays.toString(arr2));
		System.out.println("arr3 : "+ arr3 + Arrays.toString(arr3));
		System.out.println("arr4 : "+ arr4 + Arrays.toString(arr4));
		System.out.println("arr5 : "+ arr5 + Arrays.toString(arr5));
		System.out.println("----------------------------");
		//arr1 = {44,55,66,77};
		arr1 = new int[]{44,55,66,77};
		arr2 = arr1;	//shallow copy 얕은복사 (주소복사)
		arr3 = new int[]{44,55,66,77};
		
		//deep copy 시작(공간생성 후 원소 값 복사)
		arr4 = new int[arr1.length];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = arr1[i];
		} //deep copy 끝
		
		arr5 = arr1.clone();	//deep copy 자동처리
		System.out.println("arr1 : "+ arr1 + Arrays.toString(arr1));
		System.out.println("arr2 : "+ arr2 + Arrays.toString(arr2));
		System.out.println("arr3 : "+ arr3 + Arrays.toString(arr3));
		System.out.println("arr4 : "+ arr4 + Arrays.toString(arr4));
		System.out.println("arr5 : "+ arr5 + Arrays.toString(arr5));
		System.out.println("----------------------------");
		arr1[2] = 1357;
		System.out.println("arr1 : "+ arr1 + Arrays.toString(arr1));
		System.out.println("arr2 : "+ arr2 + Arrays.toString(arr2));
		System.out.println("arr3 : "+ arr3 + Arrays.toString(arr3));
		System.out.println("arr4 : "+ arr4 + Arrays.toString(arr4));
		System.out.println("arr5 : "+ arr5 + Arrays.toString(arr5));
	}

}
