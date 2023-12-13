package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/ddd.cvb");
			DataInputStream dis = new DataInputStream(fis);
			
			int i = dis.readInt();
			String str = dis.readUTF();
			
			dis.close();
			fis.close();
			
			System.out.println("data:"+i+","+str);
			
			////////////////////
			
			fis = new FileInputStream("fff/ooo.cvb");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			i = ois.readInt();
			str = ois.readUTF();
			int [] arr = (int [])ois.readObject();
			ArrayList arr2 = (ArrayList)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("obj:"+i+","+str+","+Arrays.toString(arr));
			System.out.println("obj:"+arr2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
