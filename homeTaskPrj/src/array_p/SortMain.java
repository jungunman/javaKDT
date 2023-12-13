package array_p;

import java.util.Arrays;

public class SortMain {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a+","+b);
		int buf = a;
		a = b;
		b = buf;
		System.out.println(a+","+b);
		
		int [] arr = {16,12,11,13};
		System.out.println("arr:"+Arrays.toString(arr));
		for (int me = 0; me < arr.length; me++) {
			
			System.out.println("me:"+me);
			
			for (int you = me+1; you < arr.length; you++) {
			
				System.out.println(you+","+Arrays.toString(arr));
				
				if(arr[me]>arr[you]) {
					buf = arr[me];
					arr[me] =arr[you];
					arr[you] = buf;
				}
				System.out.println(you+","+Arrays.toString(arr));
			}
			System.out.println();
		}
		System.out.println("오름차순:"+Arrays.toString(arr));
		
		//점수 : 87,65,73,82,46,98,88,65,72,34,91,79,45,67
		// 70~80점대 배열을 구현하세요 --> 높은 점수순으로 정렬
		
		
		
	}

}
