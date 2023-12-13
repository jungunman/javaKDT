package oops_p;

class ClassStudRank{
	String kind,name, grade, gender;
	int [] jum;
	int ban,tot, avg;
	int [] rank = new int[6]; //전체, 구분, 반 , 성별 , 반성별, 구분반성별
	int [] sort = new int[6];
	
	int [] sortCnt;
	
	void init(int ban,String gender,String name,int [][][] cnt ,int ...jum) {
		String [] kind = {"직장인","일반","예체능"};
		this.ban = ban;
		this.gender = gender;
		this.name = name;
		this.jum = jum;
		
		sortCnt = new int[] {jum.length-2, ban, 0};
		if(gender.equals("여")) {
			sortCnt[2] = 1;
		}
		
		this.kind = kind[sortCnt[0]];
		cnt[sortCnt[0]][ban][sortCnt[2]]++;
		
		calc();
	}
	
	void calc() {
		
		String [] grade = {"가","가","가","가","가","가","양","미","우","수","수"};
		double [] rate = {0.2,0.15,0.05,0.6};
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		switch(kind) {
		case "직장인":
			avg = (tot+10)/jum.length;
			break;
		case "일반":
			avg = tot/jum.length;
			break;
		case "예체능":
			avg = 0;
			for (int i = 0; i < jum.length; i++) {
				avg += rate[i] * jum[i];
			}
			break;
		
		}
		
		this.grade = grade[avg/10];
	}
	
	void rankCalc(ClassStudRank [] studs ) {
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		for (ClassStudRank you : studs) {
			
			if(avg < you.avg) {
				
				rank[0]++;
				//구분
				if(kind.equals(you.kind)) {
					rank[1]++;
				}
				//반
				if(ban == you.ban) {
					rank[2]++;
				}
				//성별
				if(gender.equals(you.gender)) {
					rank[3]++;
				}
				//반성별
				if(gender.equals(you.gender) 
						&& ban == you.ban) {
					rank[4]++;
				}
				//구분반성별
				if(kind.equals(you.kind) 
					&& gender.equals(you.gender) 
						&& ban == you.ban) {
					rank[5]++;
				}
			}
			
			
		}
	}
	
	
	void posCalc(int [][][] cnt) {
		for (int k = 0; k < cnt.length; k++) {
			//System.out.println(k+"------");
			for (int b = 0; b < cnt[k].length; b++) {
				//System.out.println("  "+b+"------");
				for (int g = 0; g < cnt[k][b].length; g++) {
					
					int kbg = cnt[k][b][g];
					
					//구분
					if(k<sortCnt[0]) {
						sort[1]+=kbg;
						sort[5]+=kbg;
					}
					//출력2번:반
					if(b<sortCnt[1]) {
						sort[2]+=kbg;
						sort[4]+=kbg;
						if(k==sortCnt[0]) {
							sort[5]+=kbg;
						}
					}
					//성별
					if(g<sortCnt[2]) {
						sort[3]+=kbg;
						if(b==sortCnt[1]) {
							sort[4]+=kbg;
							if(k==sortCnt[0]) {
								sort[5]+=kbg;
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < rank.length; i++) {
			sort[i]+=rank[i];
		}
	}
	
	void ppp2(int r, int ppNo) {
		
		if(r==sort[ppNo]) {
			String ttt = kind+"\t"+ban+"\t"+gender+"\t"+name+"\t";
			for (int i : jum) {
				ttt+=i+"\t";
			}
			for (int i = jum.length; i < 4; i++) {
				ttt+="\t";
			}
			ttt+=tot+"\t"+avg+"\t"+grade+"\t\t"+rank[ppNo];
		
		System.out.println(ttt);
		}
	}
}

public class ClassExamRankMain {

	public static void main(String[] args) {
		// 원시데이터
		String [] [] info = {
				// 표본 36명 : 남 27명 / 여 9명
				
				//이름
				{
					"유비", "관우", "장비", "두씨",
					"동탁", "여포", "헌제", "초선",
					"조운", "위연", "황충", "손상향",
					"손권", "손견", "주유", "소교",
					"제갈량", "강유", "마속", "황월영",
					"조조", "하후돈", "하후연", "변씨",
					"이각", "곽사", "진궁", "여령기",
					"여몽", "손책", "육손", "대교",
					"조비", "사마의", "순욱", "견희",
					
				},	
				/////
				//성별
				{
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					"남", "남" ,"남", "여",
					
				}
		};
		
		int [] ban = {
			1,2,2,3,3,1,1,3,2,1,
			2,2,3,3,3,1,1,2,3,1,
			3,3,2,3,1,1,2,3,1,3,
			2,2,3,1,1,2
		};
		
		int [][] score = {
				{82,92,76,99},{98,85,92},{99,68,52},{85,78},
				{85,26,85,72},{99,82,64},{15,63,42},{85,78,42},
				{94,86,72},{83,85,78},{85,98},{55,96,76,82},
				{69,78,82,68},{78,62,66},{85,99,82},{75,98},
				{82,97,99},{78,85,62},{85,56,52},{78,67},
				{98,52,99,99},{62,85,72},{75,58,82},{55,78,66,96},
				{54,71,66},{58,65,42},{75,68,82},{54,76},
				{85,78,62},{78,85,72},{64,83},{85,75,55},
				{78,22,62},{78,62,98},{72,78,82},{82,75,95},
		};
		
		
		ClassStudRank [] studs = new ClassStudRank[score.length];
		
		                      //구분반성별
		int [][][] cnt = new int[3][4][2];
		
		for (int i = 0; i < studs.length; i++) {
			
			studs[i] = new ClassStudRank();
			//초기화
			studs[i].init(ban[i],info[1][i],info[0][i],cnt ,score[i]);
		}
		//등수
		for (ClassStudRank me : studs) {
			me.rankCalc(studs );
		
		}
		//위치
		for (ClassStudRank me : studs) {
			
			me.posCalc(cnt);
		}
			
		
		//출력부
		for (int r = 1; r <= studs.length; r++) {
			for (ClassStudRank st : studs) {
				st.ppp2(r,5);
			}
		}
	}

}
