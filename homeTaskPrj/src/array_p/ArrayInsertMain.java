package array_p;

import java.util.Arrays;

public class ArrayInsertMain {

	public static void main(String[] args) {
		int [] arr1 = {10,20,30,40};
		
		System.out.println("arr1 : "+ arr1 + Arrays.toString(arr1));
		
		int [] buf = new int[arr1.length+1];
		System.out.println("buf : "+ buf + Arrays.toString(buf));
		buf[0] = arr1[0];
		buf[1] = arr1[1];
		buf[2] = 25;
		buf[3] = arr1[2];
		buf[4] = arr1[3];
		System.out.println("arr1 : "+ arr1 + Arrays.toString(arr1));
		System.out.println("buf : "+ buf + Arrays.toString(buf));
		arr1 = buf;
		buf = null;
		System.out.println("arr1 : "+ arr1 + Arrays.toString(arr1));
		System.out.println("buf : "+ buf + Arrays.toString(buf));
		
		int rNo = 3;
		//[10, 20, 25, 40]
		buf = new int[arr1.length-1];
		System.out.println("buf : "+ buf + Arrays.toString(buf));
		for (int i = 0; i <rNo; i++) {
			buf[i] = arr1[i];	
		}
		for (int i = rNo+1; i <arr1.length; i++) {
			buf[i-1] = arr1[i];	
		}
		arr1 = buf;
		System.out.println("arr1 : "+ arr1 + Arrays.toString(arr1));
		
	}

}
