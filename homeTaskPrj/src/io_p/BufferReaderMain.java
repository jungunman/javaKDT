package io_p;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderMain {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("fff/bbb.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			line = br.readLine();
			System.out.println(line);
			
			while((line = br.readLine())!=null) {
				System.out.println(line);	
			}
			
			
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
