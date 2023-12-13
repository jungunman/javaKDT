package control_p;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력:");
		String ttt = sc.nextLine();
		System.out.println("내용:"+ttt);
		
		System.out.print("숫자 입력:");
		int no = sc.nextInt();
		System.out.println("숫자:"+no);
	}

}
