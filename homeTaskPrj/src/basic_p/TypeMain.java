package basic_p;

public class TypeMain {

	public static void main(String[] args) {
		System.out.println("boolean --------------");
		boolean bo = true;
		System.out.println(bo);
		bo = false;
		System.out.println(bo);
		//bo = 1;
		//bo = "true";
		//bo = 123.456;
		System.out.println("byte --------------");
		//-128 ~ 127
		byte bb = 100;
		bb = 127;
		//bb = 128;
		//bb = 123.456;
		//bb = "123";
		//bb = true;
		System.out.println(bb);
		bb = -128;
		//bb = -129;
		System.out.println(bb);
		bb = 'f';
		System.out.println(bb);
		
		System.out.println("short --------------");
		//-32,768 ~ 32,767
		short sh = 128;
		sh = 32767;
		//sh = 32768;
		System.out.println(sh);
		sh = -32768;
		//sh = -32769;
		System.out.println(sh);
		System.out.println("int --------------");
		//-2,147,483,648 ~ 2,147,483,647
		int i = 2147483647;
		//i = 2147483648;
		System.out.println(i);
		i = -2147483648;
		//i = -2147483649;
		System.out.println(i);
		System.out.println("long --------------");
		//-9,223,372,036,854,775,808∼9,223,372,036,854,775,807
		long lo = 2147483647;
		lo = 2147483648L;
		lo = 9223372036854775807L;
		//lo = 9223372036854775808L;
		System.out.println(lo);
		lo = -9223372036854775808l;
		//lo = -9223372036854775809L;
		System.out.println(lo);
		System.out.println("float --------------");
		float ff = 123.456F;
		System.out.println(ff);
		ff = 123;
		System.out.println(ff);
		ff = -987.654F;
		System.out.println(ff);
		System.out.println("double --------------");
		double dd = 123.456F;
		System.out.println(dd);
		dd = 123.456;
		System.out.println(dd);
		dd = 123;
		System.out.println(dd);
		System.out.println("char --------------");
		//0~65,535
		char ch = 'a';
		System.out.println(ch);
		ch = '가';
		System.out.println(ch);
		ch = '月';
		//ch = '';
		//ch = 'acc';
		System.out.println(ch);
		ch = 100;
		ch = 65432;
		System.out.println(ch);
		System.out.println("String --------------");
		String str = "아기상어";
		System.out.println(str);
		str = "";
		System.out.println(str);
		str = "a";
		System.out.println(str);
		
		//커피숍을 구현해 주세요

		 //CoffeeMain.java

		 //커피이름: ex)아프리카노

		  //포장유무: ex)  true

		 //크기:  ex) L (S, M , L 중 택 1) 

		 //단가 : ex) 2100

		  // 수량 : ex) 3

		 // 금액 : ex) 6300
	}

}
