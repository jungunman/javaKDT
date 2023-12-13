package array_p;

import java.util.Arrays;

public class Sort7080Main {

	public static void main(String[] args) {
		//점수 : 87,65,73,82,46,98,88,65,72,34,91,79,45,67
		// 70~80점대 배열을 구현하세요 --> 높은 점수순으로 정렬
		
		int [] arr = {87,65,73,82,46,98,88,65,72,34,91,79,45,67};
		int [] res = new int[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+","+arr[i]+Arrays.toString(res)+res.length);
			
			if(arr[i]>= 70 && arr[i] < 90) {
				int [] buf = new int[res.length+1];
				
				for (int j = 0; j < res.length; j++) {
					buf[j] = res[j];
				}
				buf[res.length] = arr[i];
				res = buf;
				//System.out.println(i+","+arr[i]+Arrays.toString(res));
			}
		}
		
		System.out.println(Arrays.toString(res));
		
		for (int me = 0; me < res.length; me++) {
			for (int you = me+1; you < res.length; you++) {
				if(res[me]<res[you]) {
					int buf = res[me];
					res[me] = res[you];
					res[you] = buf;
				}
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
