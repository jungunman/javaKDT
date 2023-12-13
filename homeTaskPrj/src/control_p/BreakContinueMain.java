package control_p;

public class BreakContinueMain {

	public static void main(String[] args) {
		for (int i = 0; ; i++) {
			System.out.println("break 시작 "+ i);
			if(i==2) {
				break;
			}
			System.out.println("break 끝 "+ i);
		}
		System.out.println("break 종료 ----------------");
		
		for (int i = 0;i<5 ; i++) {
			System.out.println("continue 시작 "+ i);
			if(i==2) {
				continue;
			}
			System.out.println("continue 끝 "+ i);
		}
		System.out.println("continue 종료 ----------------");
		
		for (int i = 0;i<5 ; i++) {
			System.out.println("if 시작 "+ i);
			if(i!=2) {
				System.out.println("if 끝 "+ i);
			}
			
		}
		System.out.println("if 종료 ----------------");
		
		for (int big = 100; big < 500; big+=100) {
			System.out.println("big 시작 : "+ big);
			for (int small = 10; small <= 50; small+=10) {
				System.out.println("\t small 시작 : "+ small);
				 if(small == 30) {
					 break;
				 }
				System.out.println("\t small 끝 : "+ small);
			}
			System.out.println("big 끝 : "+ big);
		}
		System.out.println("break 종료 2----------------");
		for (int big = 100; big < 500; big+=100) {
			System.out.println("big 시작 : "+ big);
			for (int small = 10; small <= 50; small+=10) {
				System.out.println("\t small 시작 : "+ small);
				 if(big == 300) {
					 break;
				 }
				System.out.println("\t small 끝 : "+ small);
			}
			System.out.println("big 끝 : "+ big);
		}
		System.out.println("break 종료 3----------------");
		QQQ:for (int big = 100; big < 500; big+=100) {
			System.out.println("big 시작 : "+ big);
			AAA:for (int small = 10; small <= 50; small+=10) {
				System.out.println("\t small 시작 : "+ small);
				 if(small == 30) {
					 break QQQ;
				 }
				System.out.println("\t small 끝 : "+ small);
			}
			System.out.println("big 끝 : "+ big);
		}
		System.out.println("break 종료 4----------------");
		
		QQQ:for (int big = 100; big < 500; big+=100) {
			System.out.println("big 시작 : "+ big);
			AAA:for (int small = 10; small <= 50; small+=10) {
				System.out.println("\t small 시작 : "+ small);
				 if(big == 200 && small == 30) {
					 break QQQ;
				 }
				System.out.println("\t small 끝 : "+ small);
			}
			System.out.println("big 끝 : "+ big);
		}
		System.out.println("break 종료 5----------------");
		/*
big 시작 : 100
	 small 시작 : 10
	 small 끝 : 10
	 small 시작 : 20
	 small 끝 : 20
	 small 시작 : 30
	 small 끝 : 30
	 small 시작 : 40
	 small 끝 : 40
	 small 시작 : 50
	 small 끝 : 50
big 끝 : 100
big 시작 : 200
	 small 시작 : 10
	 small 끝 : 10
	 small 시작 : 20
	 small 끝 : 20
	 small 시작 : 30
break 종료 5----------------
		 * */
		
		
	}

}
