package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutBufferMain {

	public static void main(String[] args) {
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			bos.write(50);
			bos.write(51);
			bos.write(52);
			
			byte [] arr = bos.toByteArray();
			System.out.println(Arrays.toString(arr));
			
			byte [] buf = {11,22,33,44,55,66,77,88};
			bos.write(buf, 2, 3);
			arr = bos.toByteArray();
			System.out.println(Arrays.toString(arr));
			bos.write(buf, 1,4);
			arr = bos.toByteArray();
			System.out.println(Arrays.toString(arr));
			bos.write(buf);
			arr = bos.toByteArray();
			System.out.println(Arrays.toString(arr));
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
