package util_p;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexJoinMain {

	public static void main(String[] args) {
		/*
		 //// 회원 가입 유효성 검사를 실시하세요
1. 아이디 : 영문 숫자 만 가능(4자이상)
2. 비번 , 비번확인(5자이상, 대소문자,특수문자조합 ) 
3. 이메일  -  아이디:영문,숫자(3글자이상)   @  도메인 : 영문 점
//  도메인.기관종류.국가코드  :: hrd(2,).go(2).kr(2)
//  도메인.기관종류         :: naver(2,).com(3)
 * 
 * 아이디:  영문,숫자(3글자이상)@도메인(2,)( ([.]영문(2)[.]영문(2))  |([.]영문(3))  )
4. 전화번호 - 숫자 :  ###-####-####,   ##(#)-###-####
5. 이름 (한글만 가능) 2~5자
6. 주민번호 
7. 사진 첨부-->영문,숫자(3글자 이상).이미지 확장자
이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음
8. 우편번호 검색 - 구단위 (초성검색)
예외처리로 처리할 것
		 * */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("ID:");
				String id = sc.nextLine();
				if(!Pattern.matches("[0-9a-zA-Z]{4,}", id)) {
					throw new Exception("id 에러");
				}
			
				
				System.out.print("PW:");
				String pw = sc.nextLine();
				if(!
					(Pattern.matches("[!@#$%^&*()_+a-zA-Z]{5,}", pw) && 
					 Pattern.matches(".*[!@#$%^&*()_+]{1,}.*", pw) &&
					 Pattern.matches(".*[a-z]+.*", pw) &&
					 Pattern.matches(".*[A-Z]{1,}.*", pw)) ) {
					throw new Exception("pw 에러");
				}
				System.out.print("PW확인:");
				String pw2 = sc.nextLine();
				if(!pw.equals(pw2) ) {
					throw new Exception("pw확인 에러");
				}
				
				System.out.print("이메일:");
				String email = sc.nextLine();
				if(!Pattern.matches("[a-zA-Z0-9]{3,}@[a-zA-Z0-9]{2,}[.](([a-z]{2}[.][a-z]{2})|[a-z]{3})", email)) {
					throw new Exception("email 에러");
				}
				
				
				System.out.print("전화번호:");
				String tel = sc.nextLine();
				if(!Pattern.matches("((\\d{3}-\\d{4})|(\\d{2,3}-\\d{3}))-\\d{4}", tel)) {
					throw new Exception("전화번호 에러");
				}
				
				System.out.print("이름:");
				String name = sc.nextLine();
				if(!Pattern.matches("[가-힣]{2,5}", name)) {
					throw new Exception("이름 에러");
				}
				
				
				System.out.print("주민번호:");
				String jumin = sc.nextLine();
				if(!Pattern.matches("\\d{6}-\\d{7}", jumin)) {
					throw new Exception("주민번호 에러");
				}else {
					int pos = jumin.charAt(7)-'0';
					int pre = (pos-1)%4/2+19;
					Calendar birth = Calendar.getInstance();
					int yy = Integer.parseInt(pre+jumin.substring(0,2));
					int mm = Integer.parseInt(jumin.substring(2, 4));
					int dd = Integer.parseInt(jumin.substring(4,6));
					birth.set(yy, mm-1, dd);
					
				
					if(!(birth.get(Calendar.YEAR) == yy && 
							birth.get(Calendar.MONTH)+1 == mm &&
							birth.get(Calendar.DATE) == dd)) {
						throw new Exception("주민번호 에러");
					}
				}
				
				System.out.print("사진 첨부:");
				String img = sc.nextLine();
				if(!Pattern.matches("[0-9a-zA-Z]{3,}[.](jpg|jpeg|png|bmp|gif)", img.toLowerCase())) {
					throw new Exception("사진 첨부 에러");
				}
				System.out.print("구검색:");
				String gu = sc.nextLine();
				if(!Pattern.matches("[가-힣ㄱ-ㅎ]+", gu)) {
					throw new Exception("구검색 에러");
				}
				
				String [] gus = {
						"강동구","강남구","송파구","광진구","동대문구","서초구","송포구","사평구",
						"용산구","관악구","성동구","중구","기흥구","처인구","종로구",
						"분당구","도봉구","수지구","덕양구","팔달구","미추홀구"
				}; 
				
				String [] chosung = {
						"ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㄲㄸㅉㅃㅆ",
						"가나다라마바사아자차카타파하까따짜빠싸",
						"깋닣딯맇밓빟싷잏짛칳킿팋핗힣낗띻찧삫앃"
				};
				
				String guSch = ".*";
				for (char ch : gu.toCharArray()) {
					String cc = ch+"";
					if(Pattern.matches("[ㄱ-ㅎ]", cc)) {
						int pos = chosung[0].indexOf(cc);
						guSch+="["+chosung[1].charAt(pos)+"-"+chosung[2].charAt(pos)+"]";
					}else {
						guSch += cc;
					}	
				}
				 guSch += ".*";
				 
				 System.out.print(guSch+"검색결과 :");
				 for (String gg : gus) {
					if(Pattern.matches(guSch, gg)) {
						System.out.print(gg+",");
					}
					
				}
				System.out.println();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("로그인 성공");

	}

}
