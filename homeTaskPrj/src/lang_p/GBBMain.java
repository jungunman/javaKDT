package lang_p;

import java.util.Scanner;

public class GBBMain {

	public static void main(String[] args) {

		String [] gbb = "가위,바위,보".split(",");
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임 고고");
			//[user][com]				//user
		String [][] res = {	
						{"비김", "패" , "승"},	//user : 가위
						{"승" , "비김", "패"},	//user : 바위
						{"패",  "승" , "비김"},	//user : 보
			//com        가위    바위    보
		};

		while(true) {
			System.out.print("0.종료, 1.가위,2.바위,3.보 입력:");
			int user = sc.nextInt();
			
			if(user==0) {
				break;
			}
			
			int com = (int)(Math.random()*3);
			System.out.println("게이머:"+gbb[--user]);
			System.out.println("컴퓨터:"+gbb[com]);
			System.out.println("결과:"+res[user][com]);
		}
		System.out.println("가위바위보 종료");
	}

}
