package io_p;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		String str = "돌아왔구나 유용준이";

		try {
			FileWriter fw = new FileWriter("fff/ddd.txt");
			fw.write(str.toCharArray());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
