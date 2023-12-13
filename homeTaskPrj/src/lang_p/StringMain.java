package lang_p;

import java.util.Arrays;

/*
 String
   toString() : 값이 나옴
    대입    : 값의 대입
    equals(값) : 값의 비교
    length()  : 글자 길이


    charAt(22) : //글자번호 char 추출

    substring(22) : //일부 문자열 추출 글자번호->끝
    substring(4,10) : //일부 문자열  시작번호 -> 끝나는 다음번호  4->9
    


    indexOf("a");  //찾는 문자열의 처음 등장번호    없으면 : -1

    indexOf("a", 7);  //찾는 문자열의 처음 시작번호로부터 처음 등장번호

    indexOf("a", 7, 10);  //에러
    indexOf("avz", 7) ;//찾는 문자열의 시작번호에서부터 처음 등장하는번호
    lastIndexOf("a"); //찾는 문자열의 마지막 등장번호

    lastIndexOf("a", 20); //찾는 문자열의 시작번에서부터 앞쪽으로 마지막 등장번호    20번앞으로 a 찾기 : 19번

    contains("ab");   //"ab" 존재여부



    startsWith(String prefix)  //prefix 로시작

     endsWith(String suffix);//suffix로 끝





    split("@");    //문자열을 구분기호로 나누어 문자열배열

    split("@", 3);    //문자열을 구분기호로 나누어 문자열배열  배열 원소을 3개까지만으로 나누기(앞에서 부터 나눔)
    split("[.]");    //점만 [] 사용

    split("[ ,.()=\"*¹²³]"   []안에 있는 것들로 나누기 





    toUpperCase();  //대문자
    toLowerCase();  //소문자



선생님 귀여워요 Abcd Ef Java 만세 12a3a4

  replace('이전문자','바뀔문자');  //문자 치환 (한글자만)



  replace("이전문자열","바뀔 문자열");  //문자열 치환 전부
  replaceAll("이전문자열","바뀔 문자열");  //문자열 치환 전부

  "qwer".repeat(3)  :   qwerqwerqwer


  toCharArray();  //문자열을 글자배열
  trim()      //문자열 앞뒤 공백제거

concat("Java")  //문자열 뒤에 붙이기



join



String. join() 사용하면

Array나 List를 구분자를 지정해서 String으로 얻을 수 있다. 
 * */
public class StringMain {

	public static void main(String[] args) {

		String s1 = "나는무너";
		String s2 = "나는무너";
		String s3 = s1;
		String s4 = new String("나는무너");
		String s5 = "나는상어";
		String s6 = new String(new char[] {'나','는','무','너'});
		
		System.out.println(s1+","+s1.toString()+","+s1.hashCode());
		System.out.println(s2+","+s2.toString()+","+s2.hashCode());
		System.out.println(s3+","+s3.toString()+","+s3.hashCode());
		System.out.println(s4+","+s4.toString()+","+s4.hashCode());
		System.out.println(s5+","+s5.toString()+","+s5.hashCode());
		System.out.println(s6+","+s6.toString()+","+s6.hashCode());
		
		System.out.println("== >>>>>>>>>>>>>>>>");
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		System.out.println("s1==s4 : "+(s1==s4));
		System.out.println("s1==s5 : "+(s1==s5));
		System.out.println("s1==s6 : "+(s1==s6));
		System.out.println("equals( ) >>>>>>>>>>>>>>>>");
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));
		System.out.println("s1.equals(s4) : "+s1.equals(s4));
		System.out.println("s1.equals(s5) : "+s1.equals(s5));
		System.out.println("s1.equals(s6) : "+s1.equals(s6));
		
		String a = "선생님은 귀여워요 aBcD eF JavA 만세 12a3a4";
		//          0 123 45 67 8901234567890123 45678901
		System.out.println(a);
		System.out.println(a.length());
		char ch = a.charAt(13);
		System.out.println(ch+","+(int)ch);
		String b = "87321";
		int nos = 0;
		for (int i = 0; i < b.length(); i++) {
			char cc = b.charAt(i);
			int no = cc-'0';
			nos*=10;
			nos+=no;
			System.out.println(i+":"+cc+" , "+(int)cc+" , "+no+" , "+nos);
			
		}
		
		//String a = "선생님은 귀여워요 aBcD eF Java 만세 12a3a4";
		//            0 123 45 67 8901234567890123 45678901
		
		String c = a.substring(11);
		System.out.println("a.substring(11) : "+c);
		System.out.println("a.substring(11,16) : "+a.substring(11,16));
		int pos = a.indexOf("c");
		System.out.println("a.indexOf(\"c\") : "+pos);
		System.out.println("a.indexOf(\"av\") : "+a.indexOf("av"));
		System.out.println("a.indexOf(\"아기상어\") : "+a.indexOf("아기상어"));
		System.out.println("a.indexOf(\"a\") : "+a.indexOf("a"));
		System.out.println("a.indexOf(\"a\",11) : "+a.indexOf("a",11));
		System.out.println("a.indexOf(\"a\",20) : "+a.indexOf("a",20));
		System.out.println("a.indexOf(\"a\",22) : "+a.indexOf("a",22));
		System.out.println("a.indexOf(\"a\",31) : "+a.indexOf("a",31));
		System.out.println("a.lastIndexOf(\"a\") : "+a.lastIndexOf("a"));
		System.out.println("a.lastIndexOf(\"a\",27) : "+a.lastIndexOf("a",27));
		/*
		 
		 내사진.jpg
		 숙제.java
		 aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt
		 * */
		String fname = "aaaa.bbb.cccccc.dd.eee.txt";
		int fpos = fname.lastIndexOf(".");
		System.out.println(fpos);
		String ext = fname.substring(fpos+1);
		System.out.println(ext);
		System.out.println(fname.substring(fname.lastIndexOf(".")+1));
		
		//String a = "선생님은 귀여워요 aBcD eF Java 만세 12a3a4";
		//            0 123 45 67 8901234567890123 45678901
		
		System.out.println("contains(\"Bc\") : "+a.contains("Bc"));
		System.out.println("contains(\"아기상어\") : "+a.contains("아기상어"));
		System.out.println("startsWith(\"선생님\") : "+a.startsWith("선생님"));
		System.out.println("startsWith(\"귀여워요\") : "+a.startsWith("귀여워요"));
		System.out.println("endsWith(\"a3a4\") : "+a.endsWith("a3a4"));
		System.out.println("endsWith(\"귀여워요\") : "+a.endsWith("귀여워요"));
		
		c = "아메리카노,아시아노.유럽노-아프리카노,오세아니아노,카노";
		String [] arr = c.split(",");
		//System.out.println(Arrays.toString(arr));
		for (String tt : arr) {
			System.out.println(tt);
			/*
			아메리카노
			아시아노.유럽노-아프리카노
			오세아니아노
			카노
			 * */
		}
		System.out.println("-----------------");
		for (String tt : c.split(",.")) { // . ==> 글자1개(아무글자나가능)를 의미함
			System.out.println(tt);
			/*
			아메리카노
			시아노.유럽노-아프리카노
			세아니아노
			노
			 * */
		}
		System.out.println("-----------------");
		
		for (String tt : c.split("[,.-]")) { //[] 안의 글자로 나눔 (OR 처럼 인지)
			System.out.println(tt);
			/*
			아메리카노
			아시아노
			유럽노
			아프리카노
			오세아니아노
			카노
			 * */
		}
		System.out.println("-----------------");
		arr = new String[]{"차은우","자전거은우","비행기은우","오토바이은우"};
		String d = String.join("<==>", arr);
		System.out.println("String.join(\"<==>\", arr) : "+d);
		c = "여긴ab 참123숲 %^&수";
		char [] chArr = c.toCharArray();
		for (char e : chArr) {
			System.out.println(e);
		}
		System.out.println("-----------------");
		//String a = "선생님은 귀여워요 aBcD eF Java 만세 12a3a4";
		//            0 123 45 67 8901234567890123 45678901
		
		c = a.replaceAll("a", "에이");
		System.out.println("replaceAll(\"a\", \"에이\") : "+c);
		c = "zxcv";
		d = c.repeat(5);
		System.out.println("c.repeat(5) : "+d);
		
		d = c.concat("장수풍뎅이");
		System.out.println("c.concat(\"장수풍뎅이\") : "+d);
		
		System.out.println("a.toUpperCase() : "+a.toUpperCase());
		System.out.println("a.toLowerCase() : "+a.toLowerCase());
		c = "     그린 IT 아카데미     ";
		System.out.println(c+":"+c.length());
		System.out.println(c.trim()+":"+c.trim().length());
		/*
		 
950320-1234567

주민번호를 이용하여
성별, 국적(내국인/외국인), 생년월일, 한국나이, 만나이, 올해생일, 다가올 생일, 생일파티 DDay를
 출력하세요
 
1. 1900 년대 내국인 남성
2. 1900 년대 내국인 여성

########################

3. 2000 년대 내국인 남성
4. 2000 년대 내국인 여성

########################

-----------------------------------------------------

5. 1900 년대 외국인 남성
6. 1900 년대 외국인 여성

########################

7. 2000 년대 외국인 남성
8. 2000 년대 외국인 여성



"aBcd Efg HIJk lMn opQR" -> Abcd Efg Hijk Lmn Opqr  로 변경해 주세요


"lMn aBcd HIJk opQR  Efg" -> GFe rqPO Kjih DCbA NmL  로 변경해 주세요

		 * */
		String qq = "aBcd Efg HIJk lMn opQR";
		System.out.println(qq);
		arr = qq.toLowerCase().split(" ");
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			arr[i] = arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
			System.out.println(arr[i]);
		}
		
		qq = String.join(" ", arr);
		System.out.println(qq);
		
		qq = "lMn aBcd HIJk opQR  Efg";
		chArr = qq.toCharArray();
		System.out.println(Arrays.toString(chArr));
		int gap = 'a'-'A';
		qq = "";
		for (int i = chArr.length-1; i >= 0; i--) {
			char cc = chArr[i];
			
			System.out.println(cc);
			if(cc==' ') {
				qq += " ";
			}else if(cc<'a') {
				qq += (char)(cc+gap);
			}else {
				qq += (char)(cc-gap);
			}
			
		}
		System.out.println(qq);
	}

}
