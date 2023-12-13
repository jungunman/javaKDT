package excep_p;

import java.util.Scanner;

public class FiveMain {

	public static void main(String[] args) {
		System.out.print("숫자입력:");
		int tot = 0, cnt = 0;
		int no = new Scanner(System.in).nextInt();
		
		for (int i = 1; i <= no; i++) {
			try {
				int a = 1234/(i%5);
			} catch (Exception e) {
				cnt++;
				tot += i;
			}
		}
		
		System.out.println(tot+","+tot/cnt);
		
		cnt = 0;
		tot = 0;
		for (int i = 5; i <= no; i+=5) {
			cnt++;
			tot += i;
		}
		
		System.out.println(tot+","+tot/cnt);

	}

}
