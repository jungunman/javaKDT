package util_p;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;


class ScanStud{
	String name;
	int [] jum;
	int tot, avg;
	public ScanStud(String str) {
		String [] arr = str.split(",");
		name = arr[0];
		jum = new int[arr.length-1];
		for (int i = 0; i < jum.length; i++) {
			jum[i] = Integer.parseInt(arr[i+1]);
		}
		calc();
	}
	
	private void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}

	@Override
	public String toString() {
		return name + "\t" + Arrays.toString(jum) + "\t" + tot + "\t" + avg;
	}
	
	
}

public class ScannerExamMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fff/exam.csv");
		Scanner sc = new Scanner(fis);
		while(sc.hasNext()) {
			
			System.out.println(new ScanStud( sc.nextLine()));
			
			//System.out.println(str);
		}
		sc.close();
		fis.close();
	}

}
