package oops_p;

import java.util.Arrays;

class ClaArrStud{
	String name;
	int [] jum;
	int tot, avg;
	
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
}

public class ClassArrExamMain {

	public static void main(String[] args) {
		
		
		
//		ClaArrStud [] studs = new ClaArrStud[] {
//			new ClaArrStud(),
//			new ClaArrStud(),
//			new ClaArrStud(),
//			new ClaArrStud(),
//			new ClaArrStud()
//		};
		
		//원시데이터
		String [] names = {
				"현빈","원빈","장희빈","커피빈","미스터빈"
		};
		int [][] arr = {
				{79,71,74,78},	
				{69,61,64,68},
				{89,81,84,88},
				{99,91,94,98},
				{59,51,54,58}
		};
		
		
		//입력부
		ClaArrStud [] studs = new ClaArrStud[names.length];
		
		for (int i = 0; i < studs.length; i++) {
			
			studs[i] = new ClaArrStud();
			//System.out.println(studs[i]);
			studs[i].name = names[i];
			studs[i].jum = arr[i];
		}
		
		System.out.println(studs);
		
//		studs[0].name = "정우성";
//		studs[1].name = "정좌성";
//		studs[2].name = "정남성";
//		studs[3].name = "정중성";
//		studs[4].name = "북두신성";
//		studs[0].jum = new int[] {88,89,81};
//		studs[1].jum = new int[] {58,59,51};
//		studs[2].jum = new int[] {98,99,91};
//		studs[3].jum = new int[] {68,69,61};
//		studs[4].jum = new int[] {78,79,91};
		
		
		//연산부
		//ClaArrStud cas = studs[0];
		for (ClaArrStud cas : studs) {
			cas.tot = 0;
			for (int i: cas.jum) {
				cas.tot += i;
			}
			cas.avg = cas.tot/cas.jum.length;
		}
		
		//출력부
		for (ClaArrStud st : studs) {
			st.ppp();
		}

	}
/*	
///////  반, 성별 , 이름, 점수를 넣고 출력하세요
 * 구분
/// 2과목 : 재직자, 3과목 : 일반, 4과목 : 예체능
////	평점 :
	재직자 : (총점 + 10) / 2
	일반 : 평균
	예체능 : 국: 0.2, 영: 0.15, 수:0.05, 특:0.6
	
////출력 내용
 * 구분, 반, 이름, 성별, 점수, 총점, 평점, 등급, 등수

1. 입력순서 대로 

2. 전체 등수
3. 구분 등수
4. 반 등수

5. 구분,반,성별 등수

6. 각 구분별로 통계 자료 출력 
    통계 :  과목별 : 합계,평균, 최고,최대
    
 일반 >>
 1반
 
 2반
 남
 남
 ..
 남 합계  국어합계 영어합계 수학합계 
    평균  국어평균 영어평균 수학평균
    최대  국어최대 영어최대 수학최대
    최소  국어최소 영어최소 수학최소
 여
 여
 여 합계  국어합계 영어합계 수학합계 
    평균  국어평균 영어평균 수학평균
    최대  국어최대 영어최대 수학최대
    최소  국어최소 영어최소 수학최소
    
 3반
 남
 남
 ..
 남 합계  국어합계 영어합계 수학합계 
    평균  국어평균 영어평균 수학평균
    최대  국어최대 영어최대 수학최대
    최소  국어최소 영어최소 수학최소
 여
 여
 여 합계  국어합계 영어합계 수학합계 
    평균  국어평균 영어평균 수학평균
    최대  국어최대 영어최대 수학최대
    최소  국어최소 영어최소 수학최소
 * 
//
*/
}
