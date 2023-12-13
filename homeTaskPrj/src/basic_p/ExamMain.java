package basic_p;

public class ExamMain {

	public static void main(String[] args) {
				//국어, 영어, 수학 점수를 이용하여 총점, 평균을 계산하고
				  // 평균을 이용하여 수, 우, 미, 양, 가 등급을 계산하고
				  // 국어, 영어, 수학, 총점, 평균, 등급 을 출력하세요
				  // 평균은 소수점까지 표현하세요
		
		int kor = 88, eng = 91, mat = 87;
		int tot = kor + eng + mat;
		int avg = tot / 3;
		String grade = 	avg >= 90 ? "수" :
						avg >= 80 ? "우" :
						avg >= 70 ? "미" :
						avg >= 60 ? "양" :
						"가";
						
		String grade2;
		if(avg>=90) {
			grade2 = "수";
		}else if(avg>=80) {
			grade2 = "우";
			if(kor >=80 && eng >=80 && mat >=80) {
				grade2 += "(균등)";
			}
		}else if(avg>=70) {
			grade2 = "미";
		}else if(avg>=60) {
			grade2 = "양";
		}else {
			grade2 = "가";
		}
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		System.out.println("등급:"+grade);
		System.out.println("등급2:"+grade2);
	}

}
