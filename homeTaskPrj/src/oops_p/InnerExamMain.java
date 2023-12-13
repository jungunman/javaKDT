package oops_p;

import java.util.Arrays;

/*
학생 성적을 구현하세요
Outer - 반    별다방과 커피빈같은 느낌같은느낌
합격 인원, 불합격 인원
cutline : 일반 - 70, 특기생 - 65
Inner - 학생 시험
구분 , 이름, 국,영,수, 총점, 평균        
*/
class OutBan{
	int ban, pass, fail;

	public OutBan(int ban) {
		super();
		this.ban = ban;
	}

	@Override
	public String toString() {
		return ban + "반 >> 합격 : " + pass + ", 불합격 : " + fail;
	}
	
	class Stud{
		String name, kind, res;
		int [] jum;
		int tot, avg;
		
		public Stud(String kind, String name) {
			
			this.kind = kind;
			this.name = name;
			
			jum = new int["일반예체능".indexOf(kind)/2+3];
			
			for (int i = 0; i < jum.length; i++) {
				jum[i] = (int)(Math.random()*61+40);
			}
			calc();
			passChk();
		}
		void calc() {
			tot = 0;
			for (int i : jum) {
				tot += i;
			}
			avg = tot/jum.length;
		}
		
		void passChk() {
			
			if(	(avg >= 70 && kind.equals("일반")) ||
				(avg >= 65 && kind.equals("예체능")) ) {
				res = "합격";
				pass++;
			}else {
				res = "불합격";
				fail++;
			}
		}
		@Override
		public String toString() {
			String ttt = ban+"\t" + kind+"\t"+ name + "\t" + Arrays.toString(jum) + "\t";
			if(kind.equals("일반")) {
				ttt += "\t";
			}
			
			ttt += tot + "\t" + avg+"\t" + res;
			return ttt;
		}
		
		
	}
}

public class InnerExamMain {

	public static void main(String[] args) {
		OutBan ob1 = new OutBan(1);
		OutBan ob2 = new OutBan(2);
		
		OutBan.Stud [] studs = {
				ob1.new Stud("일반", "피카추"),
				ob1.new Stud("예체능", "라이추"),
				ob2.new Stud("일반", "파이리"),
				ob2.new Stud("예체능", "꼬부기"),
				ob2.new Stud("일반", "버터풀"),
				ob2.new Stud("예체능", "야도란"),
				ob1.new Stud("일반", "피존투"),
				ob1.new Stud("예체능", "또가스"),
				ob2.new Stud("일반", "서로"),
				ob2.new Stud("예체능", "생긴"),
				ob2.new Stud("일반", "모습은"),
				ob1.new Stud("예체능", "달라도")
		};
		
		for (OutBan.Stud st : studs) {
			System.out.println(st);
		}

		System.out.println(ob1);
		System.out.println(ob2);
	}

}
