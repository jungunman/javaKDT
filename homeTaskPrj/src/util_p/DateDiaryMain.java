package util_p;

import java.util.Date;

public class DateDiaryMain {

	public static void main(String[] args) {
		Date now = new Date();
		int nowDD = now.getDate();
		
		now.setMonth(now.getMonth()+1);
		now.setDate(0);
		//System.out.println(now);
		int last  = now.getDate();
		now.setDate(1);
		for (int i = 0; i <now.getDay(); i++) {
			System.out.print("     ");
		}
		for (int i = 1; i <= last; i++) {
			now.setDate(i);
			
			String pre = " ", sur = " ";
			if(i==nowDD) {
				pre="[";
				sur="]";
			}
			if(i<10) {
				pre += " ";
			}
			sur+=" ";
			System.out.print(pre+i+sur);
			if(now.getDay()==6) {
				System.out.println();
			}
		}
	
	}
}
