package control_p;

public class ForMain {

	public static void main(String[] args) {
		for(int i = 1;i <10 ;i+=2) {
			//초기값    조건    증감
			System.out.println("for 실행 "+ i);
		}
		System.out.println("for 문 종료 1 ----------------");
		
		//1 --> 100 합
		int tot = 0;
		for (int i = 1; i <=100; i++) {
			tot += i;
			System.out.println(i+":" + tot);
		}
		System.out.println(tot+" ----------------");

		// 101 -> 300 3의 배수들의 합을 구하세요
		
		tot = 0;
		for (int i = 101; i <=300; i++) {
			if(i%3==0) {
				tot += i;
				System.out.println(i+":" + tot);
			}
		}
		System.out.println(tot+" ----------------");
		
		tot = 0;
		for (int i = 102; i <=300; i+=3) {
			
				tot += i;
				System.out.println(i+":" + tot);
			
		}
		System.out.println(tot+" ----------------");
		
		tot = 0;
		for (int i = 101; i <=300; i+=3) {
			i+=(3-i%3)%3;
				
			tot += i;
			System.out.println(i+":" + tot);
			
		}
		System.out.println(tot+" ----------------");
	}

}
