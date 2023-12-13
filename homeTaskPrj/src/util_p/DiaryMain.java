package util_p;

import java.util.Calendar;

public class DiaryMain {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int nowDD = now.get(Calendar.DATE);
		//System.out.println(nowDD);
		now.set(Calendar.DATE, 1);
		int first = now.get(Calendar.DAY_OF_WEEK);
		//System.out.println(first);
		for (int i = 1; i <first; i++) {
			System.out.print("     ");
		}
		int last = now.getActualMaximum(Calendar.DATE);
		//System.out.println(last);
		for (int i = 1; i <=last; i++) {
			now.set(Calendar.DATE, i);
			
			String pre = "", sur=" ";
			if(i<10) {
				pre+=" ";
			}
			if(nowDD==i) {
				pre+="[";
				sur="]";
			}else {
				pre+=" ";	
			}
			sur+=" ";
			System.out.print(pre+i+sur);
			
			//System.out.println(now.get(Calendar.DAY_OF_WEEK));
			if(now.get(Calendar.DAY_OF_WEEK)==7) {
				System.out.println();
			}
		}
	}
	/*

년도를 입력받아 1년 달력을 출력하세요

국경일과 팀원 생일을 밑에 출력하세요
																							
1월								2월									3월						
        1	2	3	 4	 5				1	2	3	4	5				1	2	3	4	5	
     어린이날							어린이날							어린이날
6	7	8	9	10	11	12		6	7	8	9	10	11	12		6	7	8	9	10	11	12	
13	14	15	16	17	18	19		13	14	15	16	17	18	19		13	14	15	16	17	18	19	
20	21	22	23	24	25	26		20	21	22	23	24	25	26		20	21	22	23	24	25	26	
27	28	29	30					27	28	29	30					27	28	29	30				
추석	추석	추석						추석	추석	추석						추석	추석	추석



4월								5월									6월		



7월								8월									9월	

	
10월								11월									12월			
	 * */

}
