package io_p;

import java.io.FileReader;
import java.io.FileWriter;

public class File2CopyMain {

	public static void main(String[] args) {
		String fName = "aaa.txt";
		fName = "child_2.jpg";
		try {
			FileReader fr = new FileReader("fff/"+fName);
			FileWriter fw = new FileWriter("dst/"+fName);
			
			int data;
			
			while((data=fr.read())!=-1) {
				fw.write(data);
			}
			
			fw.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
