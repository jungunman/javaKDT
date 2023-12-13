package control_p;

import java.util.Scanner;

public class WhileScannerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tot = 0, cnt = 0;
		while(true) {
			System.out.print("0입력시 종료, 숫자입력:");
			int no = sc.nextInt();
			
			if(no==0) {
				break;
			}
			
			tot += no;
			cnt++;
		}
		
		System.out.println("종료:"+cnt+","+tot+","+tot/cnt);
		/*
		 * 
		 * WhileNumberMain 클래스를 생성하고
		 숫자를 입력받아 짝수들의 합과
		 3의 배수중 가장 큰값
		 5의 배수중 가장 작은 값을 출력하세요. 0입력시 종료
		 
		 짝수, 3의 배수, 5의배수가 없다면 각각 0을 출력하세요
		 * 
		 * */
		

	}

}
