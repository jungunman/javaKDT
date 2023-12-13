package io_p;

import java.io.FileInputStream;

public class FileInputMain {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("fff/bbb.txt");
			byte [] buf = new byte[500];
			while(fis.available()>0) {
//				int data = fis.read();
//				System.out.print((char)data);
				int len = fis.read(buf);
				System.out.print(new String(buf,0,len));
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
