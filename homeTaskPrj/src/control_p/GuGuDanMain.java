package control_p;

import java.util.Scanner;

public class GuGuDanMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit, gap;
		while(true) {
			System.out.print("단(2단이상):");
			limit = sc.nextInt();
			if(limit<2) {
				System.out.println("2단이상 입력하세요");
				continue;
			}
			break;
		}
		while(true) {
			System.out.print("gap:");
			gap = sc.nextInt();
			if(gap<1) {
				System.out.println("gap : 1이상 입력하세요");
				continue;
			}
			break;
		}
		
		for (int big = 1; big <=limit; big+=gap) {
			
			int end = big+gap;
			if(end>limit) {
				end = limit+1;
			}
			
			String title = "", bar="";
			for (int dan = big; dan < end; dan++) {
				title+="    "+dan+"\t\t";
				bar+="===============";
			}
			System.out.println(title);
			System.out.println(bar);
			
			for (int gob = 1; gob < 10; gob++) {
				for (int dan = big; dan < end; dan++) {
					System.out.print(dan+" x "+ gob+" = "+dan*gob+"\t");
				}
				System.out.println();
			}
			
			
			System.out.println("\n");
		}
		

	}

}
