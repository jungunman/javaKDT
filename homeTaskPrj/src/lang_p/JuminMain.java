package lang_p;

public class JuminMain {
	
	static int strToInt(String ttt) {
		int res = 0;
		for (int i = 0; i < ttt.length(); i++) {
			res*=10;
			res+=ttt.charAt(i)-'0';
		}
		return res;
	}
	static String dateToStr(int [] arr) {
		String dateTitle = "년월일";
		String res = "";
		for (int i = 0; i < dateTitle.length(); i++) {
			res += arr[i]+""+dateTitle.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		String jumin = "950825-1234567";
		//              01234567
		int pos = jumin.charAt(7)-'0';
		System.out.println("여남".charAt(pos%2));
		System.out.println("내외".charAt(pos/5)+"국인");
		
		int [] birth = new int[3];
		for (int i = 0; i < birth.length; i++) {
			//System.out.println(i+","+i*2+","+(i*2+2)+","+jumin.substring(i*2,i*2+2));
			birth[i] = strToInt(jumin.substring(i*2,i*2+2));
			//System.out.println(arr[i]);
		}
		birth[0] += ((pos-1)%4/2+19)*100;
		//System.out.println(Arrays.toString(arr));
		
		System.out.println("생년월일:"+dateToStr(birth));
		
		int [] now = {2023,8,23};
		
		int age = now[0]-birth[0]+1;
		System.out.println("한국나이:"+age);
		birth[0] = now[0];
		String nowBirthStr = dateToStr(birth);
		
		age--;
		int [] monthArr = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		//                 0  1  2  3  4  5  6  7  8  9 10 11 12
		int dday = 0;
		if(birth[1]>now[1] || 
		  (birth[1]==now[1] && birth[2]>now[2])
		) {
			age--;
			for (int i = now[1]+1; i < birth[1]; i++) {
				dday+=monthArr[i];
			}
			if(now[1]!=birth[1]) { //이번달이 아닐때
				dday+= monthArr[now[1]]-now[2]+birth[2];
			}else {  //이번달 일때
				dday+= birth[2]-now[2];
			}
			
		}else {
			birth[0]++;
			
			for (int i = now[1]+1; i < monthArr.length; i++) {
				dday+=monthArr[i];
			}
			
			for (int i = 1; i < birth[1]; i++) {
				dday+=monthArr[i];
			}
			dday+= monthArr[now[1]]-now[2]+birth[2];
		}
		System.out.println("만나이:"+age);
		System.out.println("오늘:"+dateToStr(now));
		System.out.println("올해생일:"+nowBirthStr);
		System.out.println("다가올 생일:"+dateToStr(birth));
		System.out.println("D-Day:"+dday);
		
				/*
성별, 국적(내국인/외국인), 생년월일, 한국나이, 만나이, 올해생일, 다가올 생일, 생일파티 DDay를
 						-1	%4	/2	+19
1. 1900 년대 내국인 남성	0	0	0	19
2. 1900 년대 내국인 여성	1	1	0
3. 2000 년대 내국인 남성	2	2	1	20
4. 2000 년대 내국인 여성	3	3	1
-----------------------------------------------------
5. 1900 년대 외국인 남성	4	0
6. 1900 년대 외국인 여성	5	1
7. 2000 년대 외국인 남성	6	2
8. 2000 년대 외국인 여성	7	3
*/

	}

}
