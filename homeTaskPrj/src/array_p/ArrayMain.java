package array_p;

public class ArrayMain {

	public static void main(String[] args) {
		
		int a = 10;
		int [] arr1 = {33,22,66,22,44,11,22,77};
		//             0, 1, 2, 3, 4, 5, 6, 7
		
		System.out.println(a);
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);
		System.out.println(arr1[7]);
		//System.out.println(arr1[8]);Index 8 out of bounds for length 8
		System.out.println(arr1.length);
		arr1[0] = 123;
		arr1[1] = 456;
		arr1[7] = 789;
		//arr1[8] = 987;
		System.out.println("------------");
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] *= 100; //배열 원소 값 변경
			System.out.println(i+":"+arr1[i]);
		}
		System.out.println("------------");
		
		for(int x : arr1) {
			// x = arr1[?];
			
			x /= 1000;  //배열 원소의 값을 변경하지 않는다.
			System.out.println(x);
		}
		System.out.println("------------");
		
		for(int x : arr1) {
			System.out.println(x);
		}
		System.out.println("------------");
		
					   //국,영,수,과
		int [] arr2 = {67,89,76,65,91};
		int tot = 0;
		for (int i : arr2) {
			tot += i;
		}
		System.out.println(tot);
		System.out.println(tot/arr2.length);
		
		//점수 : 87,65,82,46,98,65,72,34,91,79,45,67
		// 70점 이상인 사람들의 합계와 평균을 구하세요
		System.out.println("------------");
		int [] arr3 = { 87,65,82,46,98,65,72,34,91,79,45,67};
		tot = 0;
		int cnt = 0;
		for (int i : arr3) {
			if(i>=70) {
				tot += i;
				cnt++;
				System.out.println(cnt+"=>"+i+" : "+tot);
			}
		}
		System.out.println(tot+" : "+tot/cnt);
	}

}
