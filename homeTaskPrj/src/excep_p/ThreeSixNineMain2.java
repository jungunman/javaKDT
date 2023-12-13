package excep_p;

import java.util.Arrays;

public class ThreeSixNineMain2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 143234; i++) {
			System.out.println(i+" >>>>>>");
			String ttt = "";
			int cnt = 0;
			
			
			int [] arr = new int[0];
			int buf = i;
			for (int j = 0; buf!=0; j++) {
				int k = buf%10;
				buf /=10;
				System.out.println(k+","+buf);
				int [] bufArr = new int[arr.length+1];
				
				for (int q = 0; q < arr.length; q++) {
					bufArr[q] = arr[q];
				}
				bufArr[arr.length] = k;
				arr = bufArr;
			}
			
			//int [] arr = {i%10/1, i%100/10,i%1000/100,i%10000/1000};
			
			System.out.println(Arrays.toString(arr));
			
			for (int j : arr) {
				try {
					int a = 1234/(j%3);	
					//ttt += i;
				} catch (Exception e) {
					
					try {
						int a = 1234/j;
						ttt += "짝";
						cnt++;
					} catch (Exception e2) {
						//ttt += i;
					}
				}
			}
			
			/*
			//int one = i%10;
			try {
				int a = 1234/(arr[0]%3);	
				//ttt += i;
			} catch (Exception e) {
				
				try {
					int a = 1234/arr[0];
					ttt += "짝";
					cnt++;
				} catch (Exception e2) {
					//ttt += i;
				}
			}
			
			//int ten = i/10;
			try {
				int a = 1234/(arr[1]%3);	
				//ttt += i;
			} catch (Exception e) {
				
				try {
					int a = 1234/arr[1];
					ttt += "짝";
					cnt++;
				} catch (Exception e2) {
					//ttt += i;
				}
			}*/
			
			
			///////////////////////////
			
			try {
				int a = 1234/cnt;	
				
			} catch (Exception e) {
				ttt = ""+i;
			}
			
			
			System.out.println(ttt);
			
			
			///숫자를 입력하고 0->입력숫자의 5의 배수 합과 평균을 구하세요
			/// 조건문, 3항연산자 사용금지
			/// try~catch 활용할 것
		}

	}

}
