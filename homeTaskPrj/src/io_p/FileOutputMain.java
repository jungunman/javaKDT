package io_p;

import java.io.FileOutputStream;

public class FileOutputMain {

	public static void main(String[] args) {
		try {
			
			String [] lyrics = {
					"아름다운 이 강산을 지키는 우리",
					"사나이 기백으로 오늘을 산다",
					"포탄의 불바다를 무릎 쓰면서",
					"고향땅 부모형제 나라를 위해",
					"전우여 내 나라는 내가 지킨다",
					"멸공의 횃불 아래 목숨을 건다"
			};
			
			byte [] arr;
			FileOutputStream fos = new FileOutputStream("fff/ccc.txt");
			
			//arr = "엄마가 섬그늘에".getBytes();
			//fos.write(arr);
			
			for (String ttt: lyrics) {
				
				fos.write((ttt+"\n").getBytes());
			}
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 exam.txt 파일을 만들고  파일 내용에 구분, 총점, 평균, 등수를 계산하여
		 examRes.txt 파일로 저장하시오
		 
		 1. 입력순서대로 출력
		 2. 구분>평균>이름 순으로 정렬하여 출력
		 3. 반>구분>성별>평균>이름 순으로 정렬하여 출력
		 4. 반>평균>이름, 구분>평균>이름, >성별>평균>이름 각각 파일별로 출력
		 
		 나**, 박정*, 유**, 이상*, 정**
		 
		 일반,aaa,80,94,49,총점,평균,등수
		 예체능,bbb,52,64,60,67,총점,평균,등수
		 ...
		 
		 * */
	}

}
