package array_p;

public class RankMain {

	public static void main(String[] args) {

		String [] name = {"원빈","현빈","골빈","텅빈","커피빈"};
		int [] arr = {14,18,13,14,17};
		
		int [] rank = new int[arr.length];
		
		for (int me = 0; me < rank.length; me++) {
			rank[me] = 1;
			for (int you : arr) {
				//System.out.println(you);
				if(arr[me]> you) {
					rank[me] ++;
				}
			}
			//System.out.println();
		}
		
		for (int i = 0; i < rank.length; i++) {
			String ttt = name[i]+"\t"+arr[i]+"\t"+rank[i];
			System.out.println(ttt);
		}
		
		System.out.println("-------------------------------");
		
		//점수 : 87,65,82,46,98,65,72,34,91,79,45,67
		//점수에 대응하는 수우미양가 등급 배열을 구현하세요

		 

		//87,65,82,46,98,65,72,34,91,79,45,67
		//{우,양,우, 가,수, 양,미, 가,수, 미,가,양 }
		int [] jum = {87,65,82,46,98,65,72,34,91,79,45,67};
		
		String [] grade = new String[jum.length];
		
		String [] title = {"가","가","가","가","가","가","양","미","우","수","수"};
		
		
		
		for (int i = 0; i < jum.length; i++) {
			grade[i] = title[jum[i]/10];
			
//			switch(jum[i]/10) {
//			case 9,10:
//				grade[i] = "수";
//				break;
//			case 8:
//				grade[i] = "우";
//				break;
//			case 7:
//				grade[i] = "미";
//				break;
//			case 6:
//				grade[i] = "양";
//				break;
//			default :
//				grade[i] = "가";
//				break;
//			}
			
		}
		
		
		for (int i = 0; i < jum.length; i++) {
			
			System.out.println(jum[i]+" : "+grade[i]);
		}
		
		
		
		
		/*
5명의 성적으로 각 사람의 총점, 평균, 등급을 정리하여 출력하세요

int [] kor = {87,67,97,77,57}
int [] eng = {86,68,97,77,57}
int [] mat = {86,69,97,77,57}
String [] name = {"장동건","장남건","장서건","장중건","북두신건"}


int [] sum = ?
int [] avg = ?
String [] grade = ?

번호    이름   국어   영어  수학   총점   평균   등급
---------------------------------------------------
0       장동건
1
2
3
4

		 * */

		
	}

}
