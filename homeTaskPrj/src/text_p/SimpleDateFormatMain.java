package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) throws Exception {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(today));
		
		String [] ppArr = {
				"y","yy","yyyy",
				"M","MM","MMM","MMMM",
				"d","dd","D","DD","DDD",
				"w","ww","W","WW",
				"E","EE","EEE","EEEE",
				"F","z","Z",
				
				"a","H","HH","h","hh",
				"m","mm",
				"s","ss","S","SSS"
				
		};
		
		Locale loc = new Locale("en");
		loc = new Locale("ko");
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp,loc);
			System.out.println(pp + " : "+sdf.format(today));
		}
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse("1997-03-20");
		System.out.println(birth);
		birth = sdf.parse("1997-23-96");
		System.out.println(birth);
		birth = sdf.parse("1997-3-9");
		System.out.println(birth);
		birth = sdf.parse("1997-3-1239");
		System.out.println(birth);
		//birth = sdf.parse("1997-0312");
		sdf = new SimpleDateFormat("HH:mm:ss");
		birth = sdf.parse("14:25:32"); //날짜를 명시하지 않으면 1970-1-1 기준
		System.out.println(birth);
		birth = sdf.parse("234:567:789"); 
		System.out.println(birth);
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		birth = sdf.parse("2002-06-02 14:25:32");
		System.out.println(birth);
		
		/// '89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
		///주민번호 -> 생년월일, 한국나이, 만나이, 올해생일, 다가올생일, 생일파티, DDay
		/*
		 단어 조사
스레드
프로세스
프로그램
프로시저
프로그래스
프로시드

		 * */
	}

}
