package util_p;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		System.out.println(no*50);
		String str = sc.next();//엔터값 처리를 안함
		System.out.println("문자열1:"+str);
		str = sc.next();//엔터값 처리를 안함
		System.out.println("문자열2:"+str);
		sc.nextLine();//위의 엔터가 남아 입력처리함
		str = sc.nextLine();//엔터 이후 다시 입력 받음
		System.out.println("문자열2:"+str);
		sc.nextLine();//엔터 이후 다시 입력 받음
		System.out.println("문자열3:"+str);
		double dd = sc.nextDouble();
		System.out.println(dd);
		
		float ff = sc.nextFloat();
		System.out.println(ff);
		byte bb = sc.nextByte();
		System.out.println(bb);
		short sh = sc.nextShort(16);
		System.out.println(sh);
		long ll = sc.nextLong(8);
		System.out.println(ll);
		boolean bo = sc.nextBoolean();
		System.out.println(bo);
		
		sc.close();// stream 기반은 종료가 필요하다
	}

}
