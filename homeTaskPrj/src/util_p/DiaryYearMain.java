package util_p;

import java.util.Calendar;


class DiaryYear{
	
	String [] weeks = {"","","","","",""};//6주
	String [] spec = {"","","","","",""};//6주
	SpecDay [] sDays;
	int month;
	public DiaryYear(int year, int month, SpecDay [] sDays) {
		this.sDays = sDays;
		this.month = month;
		Calendar now = Calendar.getInstance();
		int nowDD = now.get(Calendar.DATE);
		int nowMM = now.get(Calendar.MONTH);
		int nowYY = now.get(Calendar.YEAR);
		
		now.set(year, month, 1);
		int first = now.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1; i <first; i++) {
			weeks[0]+="     ";
			spec[0]+="     ";
		}
		int last = now.getActualMaximum(Calendar.DATE);
		//System.out.println(last);
		int weekNo = 0;
		for (int i = 1; i <=last; i++) {
			now.set(Calendar.DATE, i);
			weekNo = now.get(Calendar.WEEK_OF_MONTH)-1;
			
			
			
			
			String pre = "", sur=" ";
			if(i<10) {
				pre+=" ";
			}
			if(nowDD==i && nowMM==month && nowYY==year) {
				pre+="[";
				sur="]";
			}else {
				pre+=" ";	
			}
			sur+=" ";
			weeks[weekNo]+=pre+i+sur;
			
			spec[weekNo]+=specSch(i);
			//System.out.print(pre+i+sur);
			
			//System.out.println(now.get(Calendar.DAY_OF_WEEK));
//			if(now.get(Calendar.DAY_OF_WEEK)==7) {
//				System.out.println();
//			}
			
		}
		for (int i = now.get(Calendar.DAY_OF_WEEK); i <7; i++) {
			weeks[weekNo]+="     ";
			spec[weekNo]+="     ";
		}
		
		for (int i = weekNo+1; i < weeks.length; i++) {
			weeks[i]="     ".repeat(7);
			spec[i]+="     ".repeat(7);
		}
		
		
		//ppp();
	}
	
	String specSch(int i) {
		String res = "     ";
		for (SpecDay sd : sDays) {
			if( ((month+1)+"_"+i).equals(sd.day)) {
				res = sd.title;
				break;
			}
		}
		
		int padding = 5-res.length();
		int pre = padding/2;
		int sur = padding - pre;
		res=" ".repeat(pre)+res+" ".repeat(sur);
		return res;
	}
	
	void ppp() {
		for (String wk : weeks) {
			System.out.println(wk);
		}
	}
}

class SpecDay{
	int year;
	String day, title;

	public SpecDay(int year,String str) {
		this.year = year;
		
		if(str.contains(":")) {
			int pos = str.lastIndexOf(":");
			if(str.substring(pos+1).equals("생")) {
				
				String [] arr = str.substring(0, pos).split("_");
				int month = Integer.parseInt(arr[0]);
				int date = Integer.parseInt(arr[1]);
				title = arr[2];
				
				Calendar birth = Calendar.getInstance();
				birth.set(year, month-1, date);
				if(birth.get(Calendar.DAY_OF_WEEK)==7) {
					birth.add(Calendar.DATE, -1);
				}
				if(birth.get(Calendar.DAY_OF_WEEK)==1) {
					birth.add(Calendar.DATE, -2);
				}
				
				day = birth.get(Calendar.MONTH)+1+"_"+birth.get(Calendar.DATE);
			}
			
		}else {
			int pos = str.lastIndexOf("_");
			this.day = str.substring(0,pos);
			this.title = str.substring(pos+1);
		}
	}

	@Override
	public String toString() {
		return "SpecDay [day=" + day + ", title=" + title + "]";
	}

}

public class DiaryYearMain {

	public static void main(String[] args) {
		
		
		String [] specStr = {
				"1_1_신",
				"1_3_놀",
				"1_4_고싶다",
				"3_1_삼일절",
				"5_5_어린이날",
				"9_29_-",
				"9_30_석",
				"10_9_한글날",
				"5_8_어버이날",
				"8_15_광복절",
				"9_28_추",
				"12_25_성탄절",
				"9_10_정운만:생",
				"9_23_유용준:생",
				"9_14_전병우:생"
		};
		int year = 2023;
		SpecDay [] sDays = new SpecDay[specStr.length];
		for (int i = 0; i < sDays.length; i++) {
			sDays[i] = new SpecDay(year,specStr[i]);
		}
		
		for (SpecDay sd : sDays) {
			System.out.println(sd);
		}
		
		
		DiaryYear [] dy = new DiaryYear[12];
		for (int i = 0; i < dy.length; i++) {
			dy[i] = new DiaryYear(year, i, sDays);
		}
		
		for (int big = 0; big < dy.length; big+=3) {
			
			
			for (int ww = 0; ww < 6; ww++) {
				//일자 주
				for (int mm = big; mm < big+3; mm++) {
					System.out.print(dy[mm].weeks[ww]+"\t");
				}
				System.out.println();
				//spec 주
				for (int mm = big; mm < big+3; mm++) {
					System.out.print(dy[mm].spec[ww]+"\t");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
		
		
	}
}
