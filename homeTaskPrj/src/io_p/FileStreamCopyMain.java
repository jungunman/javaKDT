package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamCopyMain {

	public static void main(String[] args) {
		String fName = "bbb.txt";
		fName = "child_1.jpg";
		try {
			FileInputStream fis = new FileInputStream("fff/"+fName);
			FileOutputStream fos = new FileOutputStream("dst/"+fName);
			
			int data;
			
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
