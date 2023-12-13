package array_p;

public class ExamMain {

	public static void main(String[] args) {
		// 원시데이터
		int [] kor = 		{87, 	67, 	97, 	77, 	53};
		int [] eng = 		{86, 	68, 	91, 	77, 	57};
		int [] mat = 		{86, 	69, 	97, 	72, 	57};
		String [] name = {"장동건", "장남건", "장서건", "장중건", "북두신건"};

		// 입력부
		int [] tot = new int [name.length];
		int [] avg = new int [name.length];
		String [] grade = new String [name.length] ;
		int [] rank = new int [name.length];
		String [] gradeTitle = {"가","가","가","가","가","가","양","미","우","수","수"};
		String [] ppp = new String [name.length] ;
		
		// 연산부
		for (int i = 0; i < name.length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3;
			grade[i] = gradeTitle[avg[i]/10];
		}
		
		for (int me = 0; me < avg.length; me++) {
			rank[me] = 1;
			for (int you = 0; you < avg.length; you++) {
				if(avg[me]<avg[you]) {
					rank[me]++;
				}
			}
			ppp[me] = name[me]+"\t"+kor[me] + "\t"+eng[me] + "\t"+mat[me]+"\t"+
			          tot[me]+"\t"+avg[me]+"\t"+grade[me]+"\t"+rank[me];
		}
		
		
		
		//출력부
		for (int r = 1; r <= name.length; r++) {
		//	System.out.println(">>>"+r);
			for (int i = 0; i < name.length; i++) {
				if(r==rank[i]) {
					System.out.println(ppp[i]);
				}
			}
		}
	}

}
