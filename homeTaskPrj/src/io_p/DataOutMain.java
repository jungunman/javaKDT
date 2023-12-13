package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("fff/qwe.rty");
			DataOutputStream dos = new DataOutputStream(fos);
			
			//dos.write(new byte[] {11,22,33,44}); -- 보내는 크기를 알 수 없음
			dos.writeChar('a');
			dos.writeBoolean(true);
			dos.writeByte(55);
			dos.writeShort(456);
			dos.writeInt(123);
			dos.writeLong(123456789012L);
			dos.writeFloat(135.79f);
			dos.writeDouble(964.21);
			dos.writeUTF("나는무너");
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
