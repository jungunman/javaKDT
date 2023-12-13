package basic_p;

//클래스 정의
public class PrintMain { //클래스 시작	 

	//시작하는 메소드 :  main 메소드
	public static void main(String[] args) { //main 메소드 시작
		
		
		// 주석 - 코드 진행에 영향을 주지 않음 (한줄 주석 처리)
		
		/*  ==> 주석 구간 시작

		 주석 구간 끝  <== */
		
		//출력 메소드
		//  ;   ==> 실행구문 종결표시
		System.out.println("a"); //문자열
		System.out.println("나는 무너"); //문자열
		System.out.println(""); //문자열
		System.out.println('a'); //문자
		//System.out.println('나는 무너'); //문자는 1글자만 가능
		//System.out.println('');
		System.out.println(123); 
		System.out.println(123.456);
		System.out.println(123+456);
		System.out.println(123.456 - 98.765);	
		
		System.out.println("나폴레옹은 \'어? 이산이 아닌데?\'라고 생각했다."); 
		System.out.println("나폴레옹은 \"불이야!\"라고 외쳤다.");
		System.out.println("여긴 참나무숲\t장수풍뎅이와 사슴벌레가 살지\n 낮엔 숨어있다 \\ 밤엔 살금살금 신나게 놀러다녀");
		System.out.println("123"); 
		System.out.println("123+456");
		System.out.println("★※月火");
		/*
		 printf --> format : 출력내용을 형식에 맞추어 출력
		 포맷형식문자에 맞추어 매개변수를 입력
		 
		 %d : 10진수  - 정수만 입력
		 
		 %o : 8진수
		 %x : 16진수
		 %f : 실수 - 실수형태로 입력  , %.2f : 소숫점 2자리로 표현 (반올림)
		 %s : 문자열 - 정수,실수,문자,문자열,boolean 모두 가능
		 %c : 문자 - 정수, 문자 입력
		 * */
		System.out.printf("%d , %.2f, %s, %c", 123, 456.7864, "안녕하세요", 100);
		System.out.println();
		System.out.printf("%d , %d, %d", 135, 246, 12345678);
		System.out.println();
		//System.out.printf("%d , %d, %d", 135, 135.789, 'c');
		//System.out.printf("%d , %d", 135, 'c');
		//System.out.printf("%.3f, %.2f, %f", 12.3426, 123, 98.765);
		System.out.printf("%.3f, %.2f, %f", 12.3426, 123.0, 98.765);
		System.out.println();
		System.out.printf("%s, %s, %s, %s, %s", 123, "1234", "안녕하세요", 'a', true);
		System.out.println();
		//System.out.printf("%c, %c, %c", 66, '가', "c");
		System.out.printf("%c, %c", 66, '가');
		System.out.println();
		
		/*
		 2진수		8진수	10진수		16진수
		   0		 0		 0			 0
		   1		 1		 1			 1
		  10		 2	 	 2			 2
		  11		 3	 	 3			 3
		 100		 4		 4			 4
		 101		 5		 5			 5
		 110		 6		 6			 6
		 111		 7		 7			 7
		1000		10		 8			 8
		1001		11		 9			 9
		1010		12		10 			 a
		1011		13		11			 b
		1100		14		12			 c
		1101		15		13			 d
		1110		16		14			 e
		1111		17		15			 f
	   10000		20		16			10
		 * */
		System.out.printf("8진수 %o , 10진수 %d, 16진수 %x \n",10,10,10);
		
	} //main 메소드 끝

} //클래스 끝

