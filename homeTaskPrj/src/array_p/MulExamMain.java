package array_p;

public class MulExamMain {

	public static void main(String[] args) {
		//원시데이터
		int [][] score = {
				{86, 82, 74},
				{76, 92, 64},
				{72, 79, 54, 98},
				{76, 92, 64, 82},
				{96, 82, 78},
				{77, 85, 91},
				{76, 62},
				{82, 74},
				{62, 89, 34, 88},
				{72, 62, 44, 76},
				{92, 82, 89},
				{96, 62},
				{72, 74},
				{82, 88},
				{91, 82, 78},
				{88, 78, 69},
				{67, 72, 52, 99},
				{82, 67},
				{99, 88},
				{67, 72, 99, 52}
		};
		String [] name = {
				"김일반", "이일반", "김체능", "이체능", 
				"박일반", "최일반", "김재직", "이재직", 
				"박체능", "최체능", "정일반", "박재직", 
				"최재직", "정재직", "강일반", "주일반",
				"강체능", "강재직", "주재직", "주체능"
				};
		
		//입력부
		String [][] kindTitle = {
				{"재직자","일 반","예체능"},
				{"가","가","가","가","가","가","양","미","우","수","수"}
				};
		double [] specRate = {0.2,0.15, 0.05, 0.6};
		
		
		String [][] resStr = new String[name.length][2];//0:구분, 1:등급
		
		int [][] resJum = new int[name.length][2];//0:총점, 1:평점
		
		int [][] rank = new int [name.length][2];
		
		String [] ttt = new String[name.length];
		
		
		//연산부
		for (int i = 0; i < name.length; i++) {
			int [] nowScore = score[i];
			int [] nowJum = resJum[i];
			String [] nowStr = resStr[i];
			
			//구분
			nowStr[0] = kindTitle[0][nowScore.length-2];
			
			//총점
			nowJum[0] = 0;
			for (int j = 0; j < nowScore.length; j++) {
				nowJum[0]+=nowScore[j];
			}
			
			//평점
			switch(nowStr[0]) {
			case "재직자":
				//System.out.println("재직자 평점 계산");
				nowJum[1] = (nowJum[0]+10)/nowScore.length;
				break;
			case "일 반":
				//System.out.println("일 반 평점 계산");
				nowJum[1] = nowJum[0]/nowScore.length;
				break;
			case "예체능":
				nowJum[1] = 0;
				for (int j = 0; j < nowScore.length; j++) {
					nowJum[1] += nowScore[j] * specRate[j];
				}
				break;
			}
			//등급
			nowStr[1] = kindTitle[1][nowJum[1]/10];
			
		}
		//연산부 2 - 등수
		for (int me = 0; me < rank.length; me++) {
			int [] nowRank = rank[me]; //0 - 전체 , 1- 구분
			nowRank[0] = 1;
			nowRank[1] = 1;
			int meJum = resJum[me][1];
			//System.out.println(">>>>"+meJum);
			
			for (int you = 0; you < resJum.length; you++) {
				
				if(meJum < resJum[you][1]) {
					nowRank[0]++;
					
					//if(resStr[me][0] == resStr[you][0]) {
					if(resStr[me][0].equals(resStr[you][0])) {
						nowRank[1]++;
					}
					
				}
			}
			
			
			
		}
		
		
		
		
		//연산부 3 - 출력정보
		for (int i = 0; i < name.length; i++) {
			ttt[i] = resStr[i][0]+"\t"+name[i] +"\t";
			for (int s : score[i]) {
				ttt[i] += s +"\t";
			}
			
			for (int j = score[i].length; j < 4; j++) {
				ttt[i] += "\t";
			}
			
			
			for (int s : resJum[i]) {
				ttt[i] += s +"\t";
			}
			ttt[i] += resStr[i][1]+"\t";
			
			for (int s : rank[i]) {
				ttt[i] += s +"\t";
			}
			
			//System.out.println(ttt[i]);
		}
		
		///출력부 
		System.out.println("전체 등수 ------------");
		for (int r = 1; r <= ttt.length; r++) {
			for (int i = 0; i < ttt.length; i++) {
				if(r==rank[i][0]) {
					System.out.println(ttt[i]);
				}
			}
		}
		System.out.println("구분 등수 ------------");
		for (String kind : kindTitle[0]) {
			System.out.println(kind+">>>");
		
			for (int r = 1; r <= ttt.length; r++) {
				for (int i = 0; i < ttt.length; i++) {
					if(r==rank[i][0] && kind.equals(resStr[i][0])) {
						System.out.println(ttt[i]);
					}
				}
			}
		}
		
		
	}

}
