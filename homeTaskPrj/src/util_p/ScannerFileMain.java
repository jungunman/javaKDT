package util_p;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerFileMain {

	public static void main(String[] args) {
		try {
			InputStream iis = new FileInputStream("fff/aaa.txt");
			Scanner sc = new Scanner(iis);
			
			int i = sc.nextInt();
			System.out.println("i : "+i);
			System.out.println(sc.hasNext());
			double dd = sc.nextDouble();
			System.out.println("dd : "+dd);
			System.out.println(sc.hasNext());
			boolean bo = sc.nextBoolean();
			System.out.println("bo : "+bo);
			System.out.println(sc.hasNext());
			sc.nextLine();
			String str = sc.nextLine();
			System.out.println("str : "+str);
			System.out.println(sc.hasNext());
			sc.close();
			iis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
