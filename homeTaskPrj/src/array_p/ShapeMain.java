package array_p;

public class ShapeMain {

	public static void main(String[] args) {
		
		int [][] arr = {
				{5},
				{5,6},
				{5,6,8},
				{20,10},
				{15,12,24},
				{7}
		};
		
		String [] title = {"","원","직사각형","직각삼각형"};
		String [] name = new String[arr.length];
		int [][] res = new int[arr.length][2];
						//0-넓이,1-둘레
		/*
		{5},		->  {넓이, 둘레}
		{5,6},		->  {넓이, 둘레}
		{5,6,8},	->  {넓이, 둘레}
		{20,10},	->  {넓이, 둘레}
		{15,12,24},	->  {넓이, 둘레}
		{7} 		->  {넓이, 둘레}
		 * */
		
		double PI = 3.141592;
		/*
		for (int i = 0; i < arr.length; i++) {
			name[i] = title[arr[i].length];
			switch(arr[i].length) {
				case 1:
					//System.out.println("원 계산");
					res[i][0] = (int)(PI * arr[i][0] * arr[i][0]);
					res[i][1] = (int)(PI * arr[i][0] * 2);
					break;
				case 2:
					//System.out.println("직사각형 계산");
					res[i][0] = arr[i][0] * arr[i][1];
					res[i][1] = (arr[i][0] + arr[i][1])* 2;
					break;
				case 3:
					//System.out.println("직각삼각형 계산");
					res[i][0] = arr[i][0] * arr[i][1] / 2;
					res[i][1] = arr[i][0] + arr[i][1] + arr[i][2];
					break;
				
			}
		}*/
		
		
		for (int i = 0; i < arr.length; i++) {
			
			int [] shape = arr[i];
			int [] rrr = res[i];
			
			name[i] = title[shape.length];
			
			switch(shape.length) {
				case 1:
					
					rrr[0] = (int)(PI * shape[0] * shape[0]);
					rrr[1] = (int)(PI * shape[0] * 2);
					break;
				case 2:
					
					rrr[0] = shape[0] * shape[1];
					rrr[1] = (shape[0] + shape[1])* 2;
					break;
				case 3:
					
					rrr[0] = shape[0] * shape[1] / 2;
					rrr[1] = shape[0] + shape[1] + shape[2];
					break;
				
			}
		}
		
		
		for (int i = 0; i < res.length; i++) {
			String ttt = name[i]+"\t";
			for (int js : res[i]) {
				ttt += js+"\t";
			}
			
			System.out.println(ttt);
		}
		
		
		/*
		 * 1. 
		  과목 갯수를 이용하여 분류하세요  일반, 예체능, 직장인 
		  평점 계산 : 일반 -> 평균
		            직장인 -> 총점 + 10 : 평균 
		            예체능   국어 : 20,  영어 : 15 수:5   특기:60
		    구분   	이름  	국어  영어  수학  특기   총점 평점 등수
			예체능	송가인 	86 	89   81    82  
		    일 반	오가인   78  83   90         
		    직장인 	두가인   56  59
		    
		    2. 평점일 기준 등수
		    3. 등수 : 전체, 구분
		 
		 * */

	}

}
