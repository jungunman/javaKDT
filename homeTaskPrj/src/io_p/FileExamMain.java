package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
class FileStud{
	String name, gender, kind;
	Integer ban, tot, avg, rank;
	Comparable [] comArr;
	int [] jum;
	public FileStud(String ttt) {
		String [] arr = ttt.split(",");
		
		this.name = arr[2];
		this.gender = arr[1];
		
		this.ban = Integer.parseInt(arr[0]);
		
		this.jum = new int[arr.length-3];
		for (int i = 0; i < jum.length; i++) {
			jum[i] = Integer.parseInt(arr[i+3]);
		}
		this.kind = "일반,예체능".split(",")[jum.length-3];
		
		calc();
		
		comArr = new Comparable[] {
				ban, kind, gender
		};
	}
	
	void calc() {
		tot = 0;
		double avg = 0;
		double [] rate = {0.2, 0.1, 0.05, 0.65};
		for (int i = 0; i < jum.length; i++) {
			
			tot += jum[i];
			avg += jum[i] * rate[i];
		}
		if(kind.equals("일반")) {
			this.avg = tot/jum.length;
		}else {
			this.avg = (int)avg;
		}
	}
	
	//반>평균>이름, 구분>평균>이름, 성별>평균>이름
	void rankCalc(ArrayList<FileStud>arr, int no) {
		
		rank = 1;
		for (FileStud you : arr) {
			if(avg < you.avg  && comArr[no].equals(you.comArr[no])) {
				rank++;
			}
		}
		
	}
	
	
	
	@Override
	public String toString() {
		String ttt = ban + "\t" + kind + "\t" + name + "\t" + gender + "\t"
		+ Arrays.toString(jum) + "\t";
		if(kind.equals("일반")) {
			ttt+= "\t";
		}
		ttt+= tot + "\t" + avg + "\t" + rank;
		return ttt;
	}
	
	byte [] getByte() {
		String ttt = ban + "\t" + kind + "\t" ;
		if(kind.equals("일반")) {
			ttt+= "\t";
		}
		ttt += name + "\t" + gender + "\t"+ Arrays.toString(jum) + "\t";
		if(kind.equals("일반")) {
			ttt+= "\t";
		}
		ttt+= tot + "\t" + avg + "\t" + rank+"\n";
		
		return ttt.getBytes();
	}
}

class FileStudCom implements Comparator<FileStud>{
	int no;
	
	public FileStudCom(int no) {
		this.no = no;
	}

	@Override
	public int compare(FileStud me, FileStud you) {
		int res = me.comArr[no].compareTo(you.comArr[no]);
		
		if(res==0) {
			res = you.avg - me.avg;
		}
		
		if(res==0) {
			res = me.name.compareTo(you.name);
		}
		return res;
	}
}
public class FileExamMain {

	public static void main(String[] args) throws IOException {
		ArrayList<FileStud>arr = new ArrayList<FileStud>();
		FileInputStream fis = new FileInputStream("fff/exam2.txt");
		for (String str : new String(fis.readAllBytes()).split("\n")) {
			arr.add(new FileStud(str));
		} 
		
		fis.close();
		
		
		//4. 반>평균>이름, 구분>평균>이름, >성별>평균>이름 각각 파일별로 출력
		//등수
		String [] outFileName = "Ban,Kind,Gen".split(",");
		
		for (int i = 0; i <outFileName.length; i++) {
			//System.out.println("===================");
			for (FileStud st : arr) {
				st.rankCalc(arr, i);
			}
			TreeSet<FileStud> set = new TreeSet<FileStud>(new FileStudCom(i));
			set.addAll(arr);
			
			FileOutputStream fos = new FileOutputStream("fff/exam"+outFileName[i]+".txt");
			for (FileStud st : set) {
				//System.out.println(st);
				fos.write(st.getByte());
			}
			
			fos.close();
			
		}
		
		
		
	}

}
