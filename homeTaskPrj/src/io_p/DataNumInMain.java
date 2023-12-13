package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataNumInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/even.zzz");
			DataInputStream dis = new DataInputStream(fis);
			int cnt = 0;
			while(dis.available()>0) {
				System.out.println(cnt +" : "+dis.readInt());
				cnt++;
			}
			
			dis.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*
회원가입 정보를 입력하여 출력하세요

id
이름
학년
키
군필여부

저장위치 : fff/eee.abc
 * */
	}

}
