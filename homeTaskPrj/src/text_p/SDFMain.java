package text_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SDFMain {

	public static void main(String[] args) throws Exception {
		/// '89年  nov 28일 (화) 05:07:30  형태로 출력해 주세요
		Date today = new Date();
		String ttt = new SimpleDateFormat("''yy年  MMM dd일 (",new Locale("en")).format(today);
		ttt += new SimpleDateFormat("E) hh:mm:ss").format(today);
		System.out.println(ttt);
		
		///주민번호 -> 생년월일, 한국나이, 만나이, 올해생일, 다가올생일, 생일파티, DDay
		String jumin = "971207-1234567";
		Date birth = new SimpleDateFormat("yyyyMMdd").parse((jumin.charAt(7)-'0'-1)%4/2+19+jumin.substring(0,6));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		System.out.println("생년월일 : "+sdf.format(birth));
		int age = today.getYear()-birth.getYear();
		System.out.println("한국나이 : "+(age+1));
		birth.setYear(today.getYear());
		if(today.before(birth)) {
			age--;
		}
		System.out.println("만나이 : "+age);
		System.out.println("올해 생일 : "+sdf.format(birth));
		if(today.after(birth)) {
			birth.setYear(today.getYear()+1);
		}
		System.out.println("다가올생일 : "+sdf.format(birth));
		String holy = " 토일";
		String dayStr = new SimpleDateFormat("E").format(birth);
		if(holy.contains(dayStr)) {
			birth.setTime(birth.getTime()-holy.indexOf(dayStr)*1000*60*60*24);
		}
		System.out.println("생일파티 : "+sdf.format(birth));
		System.out.println("D-Day : "+(birth.getTime()-today.getTime())/1000/60/60/24);
	}

}
