package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
		int i = new Integer(123);
		
		System.out.println(i);
		
		Integer i2 = 456;
		System.out.println(i2);
		
		//i = null;
		i2 = null;
		System.out.println(i2);
		
		i = new Integer("789");
		System.out.println(i);
		
		i = Integer.parseInt("135");
		//i = Integer.parseInt("백삼십오");
		System.out.println(i);
		
		byte bb = Byte.parseByte("120");
		System.out.println(bb);
		//bb = Byte.parseByte("246");
		
		short sh = Short.parseShort("246");
		System.out.println(sh);
		
		long lo = Long.parseLong("123456567788989");
		System.out.println(lo);
		
		float ff = Float.parseFloat("123.456");
		System.out.println(ff);
		
		double dd = Double.parseDouble("987.654");
		System.out.println(dd);
		
		boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		i = Integer.parseInt("11",16); //16진수
		System.out.println(i);
		i = Integer.parseInt("11",8); 	//8진수
		System.out.println(i);
		i = Integer.parseInt("11",2); 	//2진수
		System.out.println(i);
		i = Integer.parseInt("11",5); 	//5진수
		System.out.println(i);
		
		System.out.println("11(2진수) : "+Integer.toBinaryString(11));
		System.out.println("11(8진수) : "+Integer.toOctalString(11));
		System.out.println("11(16진수) : "+Integer.toHexString(11));
		System.out.println("11(10진수) : "+Integer.toString(11));
		System.out.println("11(5진수) : "+Integer.toString(11, 5));
		
		//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
        //부서명, 이름 출력, 입사일
		
		String fName = "영업_홍길동_20110823.jpg";
		
		//System.out.println(fName.substring(0,fName.lastIndexOf(".")));
		String [] arr = fName.substring(0,fName.lastIndexOf(".")).split("_");
		/*for (String str : arr) {
			System.out.println(str);
		}*/
		System.out.println("부서명:"+arr[0]);
		System.out.println("이름:"+arr[1]);
		int year = Integer.parseInt(arr[2].substring(0,4));
		int month = Integer.parseInt(arr[2].substring(4,6));
		int date = Integer.parseInt(arr[2].substring(6));
		System.out.println("연도:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+date);
		
		//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
		//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
		//파일명이 부서명, 회원 이름, 입사일이 될 것
		//부서명은 영업, 총무, 인사, 기획, 생산 만 가능함
		//입사년도는 숫자만 입력토록 함(8자리만 가능)
		//호봉수를 계산할 것 (년도단위에서 절삭)
		//성명은 2-4자만 기록 가능 
		
	}

}
