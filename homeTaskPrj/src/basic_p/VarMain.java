package basic_p;

public class VarMain {

	public static void main(String[] args) {

		//5 + 3 = x   수학 표기
		
		int x;
		//5 + 3 = x;
		x = 5 + 3;		//java 표기
		
		System.out.println(x);
		
		//변수 선언
		//자료형 변수명;
		//자료형 : int
		//변수명 : a
		int a;	
		
		//System.out.println(a);  초기화 하지 않은 변수는 호출불가
		
		//변수에 값을 대입
		// 변수명 = 값;
		// =  : 대입연산자
		a = 5;	//변수 a에 값 5를 대입(변수공간에 값을 복사하여 넣는다)
		
		//변수호출
		System.out.println(a); //a에 들어있는 값 5를 복사하여 가져와 사용한다
		System.out.println(a);
		a = 7;	//변수 대입시 기존의 값이 없어지고 대입되는 새로운 값으로 변경
		System.out.println(a);	//호출시 현재 변수의 값을 가져와 사용
		a = 3;
		System.out.println(a);
		
		//변수 초기화 : 변수 선언과 대입을 동시에 함
		int b = 10;
		System.out.println(b);
		
		//int a = 123; 동일한 이름으로 변수 중복 선언 불가
		int c = 30, d , e = 50;		//다중으로 변수 선언 가능
		System.out.println(c);
		//System.out.println(d);
		System.out.println(e);
		
		// 이름 규칙
		//int 8 = 7;	//숫자로 시작 불가
		int aa8bb = 7;
		//int + = 6; 특수기호 불가 , 예외 : _ $
		int __ = 8;
		int $$ = 9;
		//int a b = 4; 띄어쓰기 불가
		int 나이 = 49;	//한글 사용금지
		
		/*
bit												byte
							BCD		ASCII		EBCDIC
1		2	3	4		5	6		7			8
2		4	8	16		32	64		128			256
--------------------------------------------------------------
0(off)	00	000	0~9 10		a~z	26	+특수기호		+부호(0:양수/1:음수)
1(on)	01	001				A~Z	26
		10	010				0~9	10
		11	011				-------	
			100					62
			101
			110
			111

		 * */
		
		int aa = 33, bb = 45, cc = 98;
		int dd = (aa + bb) * cc;
		
		System.out.println(dd);
		
		
		String studentname = "차은우";
		int studentnumber = 16;
		
		String studname = "차금우";
		int stnum = 27;
		
		String studName = "차동우";  //카멜 표기법
		int st_num = 35;			//언더스코어 표기법
		
		//int f = g = h = 100;
		//int i, j = k , k = 200;
		int m = 100, n = m;
		System.out.println(m);
		System.out.println(n);
		
		m = 200;
		System.out.println("-------------------------");
		
		System.out.println(m);
		System.out.println(n);
		
		/*
		 VarOrderMain 클래스를 구현하세요
		 커피이름 : 아프리카노
		 가격 : 2400
		 수량 : 3
		 금액 : ?
		 
		 커피이름,가격,수량,금액  변수로 처리하고 출력하세요
		  
		 */
		
		
		
		
	}

}
