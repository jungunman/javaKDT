package control_p;

import java.util.Scanner;

public class WhileNumberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		 * WhileNumberMain 클래스를 생성하고
		 숫자를 입력받아 짝수들의 합과
		 3의 배수중 가장 큰값
		 5의 배수중 가장 작은 값을 출력하세요. 0입력시 종료
		 
		 짝수, 3의 배수, 5의배수가 없다면 각각 0을 출력하세요
		 * 
		 * */
		int even = 0;
		int three = 0, five = 0;
		boolean firstThree = true, firstFive = true;
		while(true) {
			System.out.print("0입력시 종료, 숫자입력:");
			int no = sc.nextInt();
			
			if(no==0) {
				break;
			}
			
			if(no%2==0) {
				even += no;
			}
			if(no%3==0) {
				if(three < no || firstThree) {
					firstThree = false;
					three = no;
				}	
			}
			if(no%5==0) {
				if(five > no || firstFive) {
					firstFive = false;
					five = no;
				}	
			}
		}
		
		System.out.println("짝수의 합:"+even);
		System.out.println("3의배수 중 큰값:"+three);
		System.out.println("5의배수 중 작은값:"+five);
	}

}
