package basic_p;

public class CastingMain {

	public static void main(String[] args) {

		System.out.println("정수 <--> 정수");
		
		//short(2)> byte(1)
		byte bb = 100;
		short sh = bb;	//자동 형변환, 묵시적 형변환, up casting
		
		System.out.println(bb);
		System.out.println(sh);
		System.out.println("-------------------");
		//강제 형변환시 변환하고자 하는 값(변수) 앞에  (자료형) 으로 기재한다.
		bb = (byte)sh;	//강제 형변환, 명시적 형변환, dawn casting
		System.out.println(bb);
		System.out.println(sh);
		System.out.println("-------------------");
		sh = 128;
		sh = 129;
		sh = 130;
		sh = 254;
		sh = 255;
		sh = 256;
		sh = 257;
		bb = (byte)sh;
		System.out.println(bb);
		System.out.println(sh);
		
		/*
	byte					short
	0000 0000	0		0		0000 0000  0000 0000	
	0000 0001	1		1		0000 0000  0000 0001
	0000 0010	2		2		0000 0000  0000 0010
	....
	0111 1101	125		125		0000 0000  0111 1101
	0111 1110	126		126		0000 0000  0111 1110
	0111 1111	127		127		0000 0000  0111 1111
	1000 0000	-128	128		0000 0000  1000 0000
	1000 0001	-127	129		0000 0000  1000 0001
	1000 0010	-126	130		0000 0000  1000 0010
	1111 1110	-2		254		0000 0000  1111 1110
	1111 1111	-1		255		0000 0000  1111 1111
  1	0000 0000	0		256		0000 0001  0000 0000
		 * */
		System.out.println("정수 <--> 실수");
		
		sh = 123;
		double dd = sh;
		System.out.println(sh);
		System.out.println(dd);
		dd = 987.654;
		sh = (short)dd;
		System.out.println(sh);
		System.out.println(dd);
		dd = -987.654;
		sh = (short)dd;
		System.out.println(sh);
		System.out.println(dd);
		
		System.out.println("정수 <--> 문자");
		char ch = 'a';
		int i = ch;
		sh = (short)ch;
		
		System.out.println(ch);
		System.out.println(i);
		System.out.println(sh);
		
		ch = '가';
		i = ch;
		sh = (short)ch;
		System.out.println(ch);
		System.out.println(i);
		System.out.println(sh);
		
		i = 44033;
		ch = (char)i;
		System.out.println(i);
		System.out.println(ch);
		
		//boolean은 다른 자료형과 형변환 불가
		boolean bo = true;
		//i = (boolean)bo;
		//ch = (char)bo;
		//dd = (double)bo;
		
	}

}

