package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufferMain {

	public static void main(String[] args) {
		
		
		try {
			byte [] arr1 = {23,45,55,66,77,88,12,98,76,54,32,25,57,68,23,12,66,54,43};

			ByteArrayInputStream bis = new ByteArrayInputStream(arr1);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			/*
			int data = bis.read();
			System.out.println(data);
			
			byte [] buf = new byte[7];
			
			//bis.read(buf);
			int cnt = bis.read(buf,2,3); 	//buf, 2부터, 가져올갯수
			//cnt : stream 에서 읽어온 갯수
			System.out.println(cnt +" : "+Arrays.toString(buf));
			cnt = bis.read(buf);
			System.out.println(cnt +" : "+Arrays.toString(buf));
			//bis.read(buf,4,6);	//위치 혹은 갯수가 맞지 않을 경우 에러발생
			//System.out.println(Arrays.toString(buf));
			cnt = bis.read(buf);
			System.out.println(cnt +" : "+Arrays.toString(buf));
			cnt = bis.read(buf);
			System.out.println(cnt +" : "+Arrays.toString(buf)); */
			
			byte [] buf = new byte[7];
			
			while(bis.available()>0) {
				int len = bis.read(buf);
				bos.write(buf,0,len);
				System.out.println(len+":"+Arrays.toString(buf));
			}
			
			
			byte [] arr2 = bos.toByteArray();
			bos.close();
			bis.close();
			
			System.out.println("----------------------");
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
