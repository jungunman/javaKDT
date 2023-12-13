package text_p;

import java.text.DecimalFormat;


public class DecimalFormatMain {

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat();
		double dd = (double)df.parse("12,345.678");
		
		System.out.println(dd);
		String str = df.format(9876.54);
		System.out.println(str);
		
		df = new DecimalFormat("#,##0");
		dd = (double)df.parse("12,345.678");
		System.out.println(dd);
		str = df.format(9876.54);
		System.out.println(str);
		
		double [] ddArr = {
				123456, -123456,
				123.45678, -123.45678,
				.9876, -.9876,
				.4321, -.4321, 0 
		};
		
		String [] ppArr = {
			"0"	,"#","00000000","########",
			"####0000",//"#0#0#0#0#0#0"//"0000####"
			".##",".00",".########",".00000000",
			"#.##","0.00","#,##0.00",
			"#,##","#@##","#?##", // @ ?  -> 소숫점자리에 사용
			"#,##0원","#,##0$","원#,##0","$#,##0","\\#,##0",
			"-#,##0","#,##0-", // - 음수와 상관없음
			"#,##0.00%",
			"양수#,##0.00;음수00000000", 
			//  양수일때;음수일때 --> 숫자패턴은 음수는 무시하고 양수의 것으로 처리
			//                    숫자패턴 앞의 내용이 양수 음수에 맞게 표시
			"▲0.00;▼"
		};
		
		for (String pp : ppArr) {
			System.out.println(pp+" >>>");
			df = new DecimalFormat(pp);
			for (double d: ddArr ) {
				System.out.println("  "+d+" : "+df.format(d));
			}
		}
		
	/*
 0 : 자릿수 표현, 값이 없으면 0으로 처리
  # : 자릿수 표현, 값이 없으면 생략
  - : 모양으로만 사용, 음수와는 상관 없음

  일반글자, 일반 특수기호 :  모양으로만 사용
  , : 단위구분자
  % : 백분율
  ; : 양수, 음수 구분
	 * */	
	//	int [] jum = {67,78,89,98,76,54,78,77,90,56};

	////점수가 70점 이상이면 ▲, 미만이면 ▼ 로 표시해 주세요

	///if, switch, 3항연산자등 조건문 사용하지 말것
		int [] jum = {67,78,89,98,76,54,78,77,90,56};
		
		df = new DecimalFormat("▲0;▼");
		
		for (int i : jum) {
			int jj = i-70;
			System.out.println(i+":"+df.format(jj).charAt(0)+i);
		}

	}

}
