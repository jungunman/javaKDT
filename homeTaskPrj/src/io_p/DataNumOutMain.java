package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DataNumOutMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("fff/even.zzz");
			DataOutputStream dos = new DataOutputStream(fos);
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("입력(0 .종료):");
				int no = sc.nextInt();
				if(no==0) {
					break;
				}
				if(no%2==0) {
					dos.writeInt(no);
				}
			}
			
			sc.close();
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
