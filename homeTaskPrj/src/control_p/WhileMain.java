package control_p;

public class WhileMain {

	public static void main(String[] args) {

		int i = 10; 	//초기값
		while(i<30) {	//조건
			System.out.println("while 문 실행:" + i);
			i+= 2;		//증감
		}
		// 100 -> 200 7의 배수 들의 합을 구하세요
		
		i = 100; 	//초기값
		int tot = 0;
		while(i<=200) {	//조건
			if(i%7==0) {
				tot += i;
				System.out.println(i+":" + tot);
			}
			i++;		//증감
		}
		System.out.println(tot);

	}

}
