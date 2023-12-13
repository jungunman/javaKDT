package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteInputMain {

	public static void main(String[] args) {

		byte [] arr = {3,20,127,3,-128,-2,3,10,-1,50,111};
		
		
		
		//1. stream 생성
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		while(bis.available()>0) {
			int data = bis.read();
			byte bb = (byte)data;
			
			if(bb%2==0) {
				System.out.println(data+":"+bb);
				bos.write(data);
			}
		}
		
		byte [] arr2 = bos.toByteArray();
		
		try {
			//3. stream 닫기
			bos.close();
			bis.close();
			System.out.println("bis 닫기");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(arr2));
		
		/*
		 * {3,20,127,3,-128,-2,3,10,-1,50,111};
		 * stream을 이용하여 원소를 읽으세요
		 * 짝수로 구성된 배열을 stream으로 만드세요

		 * */
		
	}

}
