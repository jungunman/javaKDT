package array_p;

import java.util.Arrays;

public class MulVarMain {

	public static void main(String[] args) {

		int a;
		int [] arr1 = {123,456,789,9876};
		int [][] arr2 = {
				{12,34,56},
				{78,89,90}
		};
		int [] arr3;
		
		int [][] arr = {
				{10,20,30,40},
				{111,222,333},
				new int[5],
				arr1,
				//arr2
				arr2[1],
				//arr3
				new int[][]{
					{1010,2020},
					{3030,4040},
					{5050,6060}
				}[1],
				arr3 = new int[] {135,246,369}
		};
		
		//System.out.println(a);
		//System.out.println(arr3);
		System.out.println(arr);
		System.out.println(arr.length);
		
		for (int[] is : arr) {
			System.out.println(is+Arrays.toString(is));
		}
		System.out.println(arr1);
		System.out.println(arr2[1]);
		System.out.println(arr3);
		
		arr1[2]= 77889900;
		
		
		System.out.println("---------------------------");
		for (int[] is : arr) {
			System.out.println(is+Arrays.toString(is));
		}
	}

}
