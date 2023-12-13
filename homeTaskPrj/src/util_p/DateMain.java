package util_p;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		Date today = new Date();
		Date dd1 = new Date(1997,3,20);
		Date dd2 = new Date(1997-1900,3-1,20);
		
		System.out.println(today);
		System.out.println(dd1);
		System.out.println(dd2);
		System.out.println(new Date(1997-1900,3-1,20,14,23));
		System.out.println(new Date(1997-1900,3-1,20,14,23,35));
									//년       월  일  시 분  초
		System.out.println(new Date(1997-1900,23-1,-4,135,78,240));
					//  월,일,시,분,초 등 날짜시간값을 벗어나도 연산처리
		//System.out.println(new Date("2023-11-30 16:18:20")); 에러 발생
		//문자열로 생성가능
		System.out.println(new Date("Jun 02 15:17:32 2002"));
		
		//가능한 날짜 형식에 맞는 문자열로 작성
		//System.out.println(new Date("Jun 52 75:237:392 2002"));
		//System.out.println(new Date("Jun 52 75:97:92 2002"));
		System.out.println(new Date("Jun 52 15:27:32 2002"));
		
		System.out.println(new Date(0));
		System.out.println(new Date(75*1000));//1분15초
		
		//getXXX
		System.out.println(today.getYear()+1900);
		System.out.println(today.getMonth()+1);
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		/*일 월 화 수 목 금 토
		  0  1 2  3 4  5 6
		 */
		System.out.println(today.getTimezoneOffset());//분 단위 : -540 :: 9 * 60
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		System.out.println(today.getTime());
		//1970-1-1 0:0:0.000 --> 0
		System.out.println(today.getTime()/1000/60/60/24/365 + 1970);
		
		today.setYear(1988-1900);
		System.out.println(today);
		today.setMonth(3-1);
		System.out.println(today);
		today.setDate(20);
		System.out.println(today);
		today.setHours(16);
		System.out.println(today);
		today.setMinutes(24);
		System.out.println(today);
		today.setSeconds(37);
		System.out.println(today);
		today.setTime(0);
		System.out.println(today);
		System.out.println(dd2);
		System.out.println(today.before(dd2));
		System.out.println(today.after(dd2));
		
		
	}

}
