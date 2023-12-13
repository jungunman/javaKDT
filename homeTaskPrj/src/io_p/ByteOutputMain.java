package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutputMain {

	public static void main(String[] args) {
		//1. stream 생성
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		bos.write(10);
		bos.write(130); //-126
		bos.write(-10);	//-10
		bos.write(9);
		bos.write(257);
		bos.write(20);
		bos.write(10);
		
		byte [] arr = bos.toByteArray();
		System.out.println(Arrays.toString(arr));
		
		try {
			//3. stream 닫기
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
