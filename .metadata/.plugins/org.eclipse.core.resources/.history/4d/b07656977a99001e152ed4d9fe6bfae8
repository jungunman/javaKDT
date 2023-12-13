package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class ObjectStud implements Serializable {
	String name;
	int [] jum;
	int tot, avg;
	String grade;
	
	
	public ObjectStud(String name, int ...jum) {
		this.name = name;
		this.jum = jum;
		for (int i : jum) {
			this.tot += i;
		}
		this.avg = tot/jum.length;
		String [] gd = {"","가","가","가","가","가","양","미","우","수","수"};
		this.grade = gd[avg/10];
	}


	@Override
	public String toString() {
		return name + "\t" + Arrays.toString(jum) + "\t" + tot + "\t" + avg
				+ "\t" + grade;
	}
	
	
	
}



public class ObjectIOResult {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("fff/Result.txt");
			ObjectOutput out = new ObjectOutputStream(fos);
			out.writeObject(new ObjectStud("정만득", 44,55,66));
			out.writeObject(new ObjectStud("장이수", 54,65,76));
			out.writeObject(new ObjectStud("김국진", 64,75,86));
			out.writeObject(new ObjectStud("호에잉", 74,85,96));
			out.writeObject(new ObjectStud("텐조 사토루", 100,100,100));
			
			Thread.sleep(500);
			FileInputStream fis = new FileInputStream("fff/Result.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			
			
			while(fis.available() > 0) {
				System.out.println((ObjectStud)in.readObject());
				
			}
						
			
			in.close();
			fis.close();
			out.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
