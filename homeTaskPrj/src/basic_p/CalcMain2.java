package basic_p;

public class CalcMain2 {

	public static void main(String[] args) {
		System.out.println("1항 연산자 >>>>>>>>>>>>>>>>>>>>>");
		
		int a = 5;
		System.out.println("-"+a + " : " + -a);
		boolean b = true;
		System.out.println("!"+b + " : " + !b);
		
		a = 5;
		System.out.println("a : " + a);
		//a = a + 1;
		a++;
		System.out.println("a : " + a);
		++a;
		System.out.println("a : " + a);
		a--;
		--a;
		//a**;
		//a//;
		//a%%;
		System.out.println("a : " + a);
		System.out.println("a++ : " + a++);
		System.out.println("a : " + a);
		System.out.println("++a : " + ++a);
		System.out.println("a : " + a);
		
		int aa=5, bb = 6, cc = 10, dd;
		dd = aa++ + ++cc - bb-- * --aa + aa++;
		/*    5   +   11 -  6   *   5  +  5
		 *    5   +   11 - 30  +  5
		 * 
		 aa   6                     5     6
		 bb                 5
		 cc           11
		 * */
		
		
		System.out.println(aa+","+bb+","+cc+","+dd);
		
		dd = (aa++) + ++cc - bb-- * --(aa) + aa++ / cc++;
		/*
		       6    +   12 -  5   *    6   +  6    /  12
		       6    +   12 -     30        +     0
		             
		aa:6   7                       6      7
		bb:5                  4
		cc:11           12                            13
		  
		 * */
		System.out.println(aa+","+bb+","+cc+","+dd);
		
		System.out.println("2.4 shift 연산자 >>>>>>>>>>>>>>>>>>>>>");
		a = 11;
		//  Integer.toBinaryString(a) -- 2진수 형태의 문자열 리턴
		System.out.println(a +" : " +Integer.toBinaryString(a));
		int a1 = a >> 2;
		/*
		 	0000 1011 >> 2
		 
		 00 0000  1011
		 00 0000  10	11
		    00 00 00 10
		 	0000  0010 
		 * */
		
		System.out.println("a >> 2 :" +a1 +" : " +Integer.toBinaryString(a1));
		
		a1 = a << 2;
		/*
		 	0000 1011 << 2
		 
		 0000  1011 00
		 00 0010 1100
		 
		 0   0   1   0   1  1  0  0
		 --------------------------
		 7   6   5   4   3  2  1  0
		 128 64  32  16  8  4  2  1
		 
		 0 + 0 + 32+ 0 + 8+ 4+ 0+ 0
		    
		 * */
		
		System.out.println("a << 2 :" +a1 +" : " +Integer.toBinaryString(a1));
		
		a = -13;
		System.out.println(a +" : " +Integer.toBinaryString(a));
		a1 = a >> 2;
		/*
		 	1111 0011 >> 2
		 
		 11 1111 0011
		 11 1111 00    11
		    1111 1100
		 * */
		
		System.out.println("a >> 2 :" +a1 +" : " +Integer.toBinaryString(a1));
		a1 = a << 2;
		/*
		 	1111 0011 << 2
		 
		    1111 0011  00
		   11 11 00 11  00
		 11 1100 1100
		 * */
		
		System.out.println("a << 2 :" +a1 +" : " +Integer.toBinaryString(a1));
		
		a = 11;
		System.out.println(a +" : " +Integer.toBinaryString(a));
		a1 = a >>> 2;
		System.out.println("a >>> 2 :" +a1 +" : " +Integer.toBinaryString(a1));
		a = -13;
		System.out.println(a +" : " +Integer.toBinaryString(a));
		a1 = a >>> 2;
		System.out.println("a >>> 2 :" +a1 +" : " +Integer.toBinaryString(a1));
		/*
		 * a >> 2
		 * 11  111111111111111111111111111100 : -4
		 * 00  111111111111111111111111111100 :  1073741820
		 * a >>> 2 
		 * */
		
		
		System.out.println("2.5 bit 연산자 >>>>>>>>>>>>>>>>>>>>>");
		
		a = 12;	//1100
		a1 = 5;	//0101
		System.out.println("a:"+ a +","+ Integer.toBinaryString(a));
		System.out.println("a1:"+ a1 +","+ Integer.toBinaryString(a1));
		
		int a2 = a & a1;
		/*
		 * a : 12 	1100
		 * a1:  5   0101
		 ----------------------
		 &   :      0100
		 
		 * */
		System.out.println("a & a1:"+ a2 +","+ Integer.toBinaryString(a2));
		
		a2 = a | a1;
		/*
		 * a : 12 	1100
		 * a1:  5   0101
		 ----------------------
		 |   :      1101
		 
		 * */
		System.out.println("a | a1:"+ a2 +","+ Integer.toBinaryString(a2));
		
		a2 = a ^ a1;
		/*
		 * a : 12 	1100
		 * a1:  5   0101
		 ----------------------
		 ^   :      1001
		 
		 * */
		System.out.println("a ^ a1:"+ a2 +","+ Integer.toBinaryString(a2));
		
		
		System.out.println("2.6 대입 연산자 >>>>>>>>>>>>>>>>>>>>>");
		a = 5;
		System.out.println("a:"+ a);
		//a = 5 + 3;
		a += 3;
		System.out.println("a += 3:"+ a);
		System.out.println("a -= 2:"+ (a -= 2));
		System.out.println("a *= 9:"+ (a *= 9));
		System.out.println("a /= 4:"+ (a /= 4));
		System.out.println("a %= 5:"+ (a %= 5));
		System.out.println("axb :"+ Integer.toBinaryString(a));
		/*
		 a <<= 2
		 0011
		 0011 00
		 
		 1100 
		 * */
		System.out.println("a <<= 2:"+ (a <<= 2));
		System.out.println("axb :"+ Integer.toBinaryString(a));
		System.out.println("9xb :"+ Integer.toBinaryString(9));
		/*
		 
		 1100
		 1001
------------------
       & 1000
        
		 * */
		System.out.println("a  &= 9:"+ (a &= 9));
		System.out.println("axb :"+ Integer.toBinaryString(a));
		
		System.out.println("3. 조건 연산자 >>>>>>>>>>>>>>>>>>>>>");
		
		String r1 = false ? "참이지롱" : "거짓부렁";
		       //   조건   ?  true일때 값  : false일 때 값       
		
		System.out.println(r1);
		
		a = 78;
		
		r1 = a >=80 ? "합격" : "불합격";
		System.out.println(a +" : "+r1);
		
		// 80 > 60 > 40
		r1 = 	a >= 80 ? "우수" : 
				//a >= 40 ? "정상" :
				a >= 60 ? "양호" :
				a >= 40 ? "정상" :
				"미흡";
				
		System.out.println(a +" : "+r1);
		
		//ExamMain 클래스를 생성하고
		//국어, 영어, 수학 점수를 이용하여 총점, 평균을 계산하고
		  // 평균을 이용하여 수, 우, 미, 양, 가 등급을 계산하고
		  // 국어, 영어, 수학, 총점, 평균, 등급 을 출력하세요
		  // 평균은 소수점까지 표현하세요
		
	}

}

