package io_p;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerAppendMain {

	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("[yyyy/MM/dd HH:mm:ss]");
			FileOutputStream fos = new FileOutputStream("fff/sa.txt",true);
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("입력:");
				String msg = sc.nextLine();
				if(msg.equals("x")) {
					break;
				}
				
				fos.write((sdf.format(new Date())+msg+"\n").getBytes());
			}
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
