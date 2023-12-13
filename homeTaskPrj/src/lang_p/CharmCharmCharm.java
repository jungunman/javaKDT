package lang_p;

import java.util.Scanner;

public class CharmCharmCharm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] arr = "왼쪽,오른쪽".split(",");
		while(true) {
			System.out.print("0:왼쪽, 1:오른쪽 9:종료 입력:");
			int user = sc.nextInt();
			
			if(user==9) {
				break;
			}
			int com = (int)(Math.random()*2);
			
			String res = "패";
			if(user==com) {
				res = "승";
			}
			System.out.println("게이머:"+arr[user]);
			System.out.println("컴퓨터:"+arr[com]);
			System.out.println("결과:"+res);
		}
		
		System.out.println("참참참 종료");
	}

}
