package basic_p;

public class CalcMain {

	public static void main(String[] args) {
		System.out.println("2.1 산술연산자");
		// param : 숫자(문자)  , 문자열(+):문자열 결합
		// ret : 숫자		 , 문자열
		
		int a = 15, b = 7;
		double a2 = 12.34, b2 = 5.6;
		boolean a3 = true, b3 = false;
		char a4 = 'd', b4 = 'a';
		String a5 = "정우성", b5 = "차은우";
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println(a2 + b2);
		System.out.println(a2 - b2);
		System.out.println(a2 * b2);
		System.out.println(a2 / b2);
		System.out.println(a2 % b2);
		
//		System.out.println(a3 + b3);
//		System.out.println(a3 - b3);
//		System.out.println(a3 * b3);
//		System.out.println(a3 / b3);
//		System.out.println(a3 % b3);
		
		System.out.println(a4 + b4);
		System.out.println(a4 - b4);
		System.out.println(a4 * b4);
		System.out.println(a4 / b4);
		System.out.println(a4 % b4);
		
		System.out.println(a5 + b5);
		System.out.println(a5 + a + a2 + a3 + a4);
		//System.out.println(a + a2 + a3 + a4 + a5);
		System.out.println(a + a2 + a5 +  a3 + a4);
//		System.out.println(a5 - b);
//		System.out.println(a5 * b);
//		System.out.println(a5 / b);
//		System.out.println(a5 % b);
		
		System.out.println(a + " + " + b + " = " +( a + b) );
		System.out.println(a + " - " + b + " = " +( a - b) );
		System.out.println(a + " * " + b + " = " + a * b );
		System.out.println(a + " / " + b + " = " + a / b );
		System.out.println(a + " % " + b + " = " + a % b );
		System.out.println(3 + 4 * 5);
		System.out.println((3 + 4) * 5);
		
		System.out.println("2.2 비교 연산자");
		// param : 숫자	,    숫자 이외 ( ==, != )
		// ret : boolean
		
		a = 30; b = 20;
		System.out.println(a + " > " + b + " : " + (a > b));
		System.out.println(a + " >= " + b + " : " + (a >= b));
		//System.out.println(a => b);
		//System.out.println(a > = b);
		System.out.println(a + " <= " + b + " : " + (a <= b));
		System.out.println(a + " < " + b + " : " + (a < b));
		System.out.println(a + " == " + b + " : " + (a == b));
		System.out.println(a + " != " + b + " : " + (a != b));
		
		a2 = 123.45; b2 = 432.14;
		System.out.println(a2 > b2);
		System.out.println(a2 >= b2);
		System.out.println(a2 <= b2);
		System.out.println(a2 < b2);
		System.out.println(a2 == b2);
		System.out.println(a2 != b2);
		System.out.println("--------------");
		System.out.println(a2 > b);
		System.out.println(a2 >= b);
		System.out.println(a2 <= b);
		System.out.println(a2 < b);
		System.out.println(a2 == b);
		System.out.println(a2 != b);
		System.out.println("--------------");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		a3 = true; b3 = false;
//		System.out.println(a3 > b3);
//		System.out.println(a3 >= b3);
//		System.out.println(a3 <= b3);
//		System.out.println(a3 < b3);
		System.out.println(a3 == b3);
		System.out.println(a3 != b3);
//		System.out.println(a == b3);
//		System.out.println(a != b3);
		System.out.println("--------------");
		a4 = 'a'; b4 = 'z';
		System.out.println(a4 > b4);
		System.out.println(a4 >= b4);
		System.out.println(a4 <= b4);
		System.out.println(a4 < b4);
		System.out.println(a4 == b4);
		System.out.println(a4 != b4);
		System.out.println("--------------");
		a5 = "정우성"; b5 = "정좌성";
//		System.out.println(a5 > b5);
//		System.out.println(a5 >= b5);
//		System.out.println(a5 <= b5);
//		System.out.println(a5 < b5);
		System.out.println(a5 == b5);
		System.out.println(a5 != b5);
//		System.out.println(a == b5);
//		System.out.println(a != b5);
		System.out.println(a5.compareTo("정남성"));
		System.out.println(a5.compareTo("정우성"));
		System.out.println(a5.compareTo("정좌성"));
		
		
		System.out.println("2.3 논리 연산자");
		// param : boolean
		// ret : boolean
		
		a3 = false; b3 = false;
		System.out.println(a3 && b3);
		System.out.println(a3 || b3);
		System.out.println(a3 ^ b3);
		
		a = 11; b = 15;
		//System.out.println(a && b);
		//System.out.println(a || b);
		//System.out.println(a ^ b);
		a2 = 123.45; b2 = 67.89;
//		System.out.println(a2 && b2);
//		System.out.println(a2 || b2);
		a4 = 'a'; b4 = 'b';
//		System.out.println(a4 && b4);
//		System.out.println(a4 || b4);
		a5 = "true"; b5 = "false";
//		System.out.println(a5 && b5);
//		System.out.println(a5 || b5);
		
		int age = 49;
		String color = "빨강";
//		boolean ageChk = age <= 55;
//		boolean colorChk = color == "빨강";
		
//		System.out.println("And : "+ (ageChk && colorChk));
//		System.out.println("Or : "+ (ageChk || colorChk));
//		System.out.println("Xor : "+ (ageChk ^ colorChk));
		
		System.out.println("And : "+ (age <= 25 + 30 && color == "빨강"));
		System.out.println("Or : "+ (age <= 25 || color == "빨강"));
		System.out.println("Xor : "+ (age <= 25 ^ color == "빨강"));
	}

}

