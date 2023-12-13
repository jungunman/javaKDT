package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/qwe.rty");
			DataInputStream dis = new DataInputStream(fis);
			
			
			//System.out.println(dis.read());  받아야 하는 크기를 알 수 없음
			System.out.println(dis.readChar());
			//순서를 바꿈 
			System.out.println(dis.readShort()); //크기에 맞게 자르고 데이터 확인 불가
			System.out.println(dis.readInt());
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
//			System.out.println(dis.readShort());
//			System.out.println(dis.readInt());
			System.out.println(dis.readLong());	//크기가 맞는 이부분 부터 정상적으로 출력
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
			dis.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
