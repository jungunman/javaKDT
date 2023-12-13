package control_p;

public class ThreeSixNineMain {

	public static void main(String[] args) {

		for (int i = 1; i <=20; i++) {
			int one = i%10;
			
			if(one%3==0 && one!=0) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			
		}
		System.out.println("-------------------");
		
		for (int i = 1; i <=100; i++) {
			String ttt = "";
			
			int ten = i/10;
			int one = i%10;
			
			if(ten%3==0 && ten!=0) {
				ttt+="짝";
			}
			
			if(one%3==0 && one!=0) {
				ttt+="짝";
			}
			
			if(ttt=="")
			{
				ttt+=i;
			}
			System.out.println(ttt);
		}

	}

}
