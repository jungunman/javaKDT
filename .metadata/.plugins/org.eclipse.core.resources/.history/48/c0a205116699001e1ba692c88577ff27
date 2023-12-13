package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutMain {

	public static void main(String[] args) {
		try {
			int [] arr = {11,22,33};
			FileOutputStream fos = new FileOutputStream("fff/ddd.cvb");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(123);
			dos.writeUTF("난 몇개");
			//dos.writeObject(arr);
			dos.close();
			fos.close();
			
			////////////////////
			
			fos = new FileOutputStream("fff/ooo.cvb");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			ArrayList arr2 = new ArrayList();
			arr2.add("아기상어");
			arr2.add(123);
			arr2.add(true);
			arr2.add(987.654);
			
			oos.writeInt(456);
			oos.writeUTF("아이 너무 아파");
			oos.writeObject(arr);
			oos.writeObject(arr2);
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
