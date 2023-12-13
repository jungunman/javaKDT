package lang_p;

import java.util.Scanner;

class RanMZB{
	Scanner sc;
	String [][] mzb = {
			"가위,바위,보".split(","),
			"찌,묵,빠".split(",")
	};
	String [][] res = {	
			{"비김", "패" , "승"},	//user : 가위
			{"승" , "비김", "패"},	//user : 바위
			{"패",  "승" , "비김"},	//user : 보
//com        가위    바위    보
	};
	
	String last = null;
	
	public RanMZB() {
		
		sc = new Scanner(System.in);
		System.out.println("묵찌빠 게임 고고");
			//[user][com]				//user

		if(input(0,false)) {//가위바위보
			input(1,true);	//묵찌빠
		}
		
		System.out.println("묵찌빠 종료:"+last);
	}
	
	String [] gongsu = {"공격","수비"};
	
	
	//가위바위보, 묵찌빠의 형태에 따라 계속 진행시킬지 확인 하는 메소드
	boolean input(int no, boolean end) {
		while(true) {
			if(no==1) {
				System.out.println("[게이머] : "+gongsu["승패".indexOf(last)]);
			}
			
			String resTTT = inputScan(no);
			
			if(resTTT.equals("false")) {
				return false; //게임종료로 나간다
			}
			
			//(묵찌빠이면서 게임이 끝날 경우)가 아니라면 현재 결과 상태를 저장한다
			if(!(no==1 && resTTT.equals("비김"))) {
				last = resTTT;
			}
			if(resTTT.equals("비김")==end) {
				break;
			}
		}
		return true; //다음 순서로 진행한다.
	}
	
	
	/// user와 com의 패를 받는 메소드
	String inputScan(int no) {
		String [] gbb = mzb[no]; 
		String ttt = "0.종료, ";
		for (int i = 0; i < gbb.length; i++) {
			ttt += i+1+"." + gbb[i]+", ";
		}
		ttt += " 입력: ";
		System.out.print(ttt);
		int user = sc.nextInt();
		
		if(user==0) {
			return "false"; //게임종료로 나간다
		}
		
		int com = (int)(Math.random()*3);
		System.out.println("게이머:"+gbb[--user]);
		System.out.println("컴퓨터:"+gbb[com]);
		
		return res[user][com];
	}
	
	
}

public class MZBMain {

	public static void main(String[] args) {

		new RanMZB();
		
	}

}
