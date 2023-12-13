package control_p;

public class IfMain {

	public static void main(String[] args) {
		if(false) {
			System.out.println("참이지롱");
		}
		System.out.println("if문 종료 1 -------------");
		if(false) {
			System.out.println("참이지롱2-1");
			System.out.println("참이지롱2-2");
			System.out.println("참이지롱2-3");
		}
		System.out.println("if문 종료 2 -------------");
		if(false) //중괄호가 없을 경우 바로 다음 1개의 실행구문만 종속한다.
			System.out.println("참이지롱3-1");
		
		
		System.out.println("참이지롱3-2");
		System.out.println("참이지롱3-3");
		
		System.out.println("if문 종료 3 -------------");
		
		if(false) {
			System.out.println("if~else 참이지롱");
		}else {
			System.out.println("if~else 거짓부렁");
		}
		System.out.println("if~else문 종료 1 -------------");
//		else {  else 단독으로 사용하거나 if 문 이전에 사용 불가
//			System.out.println("if~else 거짓부렁");
//		}
		
//		else {
//			System.out.println("if~else 거짓부렁");
//		}
//		if(false) {
//			System.out.println("if~else 참이지롱");
//		}
		
		int a = 75;
		if(a>=80) {
			System.out.println("우수");
		}else {
			System.out.println("미달");
		}
		System.out.println("if~else문 종료 2 -------------");
		if(a>=80) {
			System.out.println("우수3");
		}
		
		
		if(a>=60) {
			System.out.println("양호3");
		}
		else {
			System.out.println("미달3");
		}
		System.out.println("if~else문 종료 3 -------------");
		
		// 80 > 60 >40  단계별로 필터링
		if(a>=80) {
			System.out.println("우수4");
		}
//		else if(a>=40) {
//			System.out.println("정상4");
//		}
		else if(a>=60) {
			System.out.println("양호4");
			if(a%2==0) {	//중첩 if문 가능
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}
		else if(a>=40) {
			System.out.println("정상4");
		}
		else {
			System.out.println("미달4");
		}
		System.out.println("if~else if~else문 종료 1-------------");
		
		if(a>=80) {
			System.out.println("우수5");
		}
		else if(a>=60) {
			System.out.println("양호5");
		}
		else if(a>=40) {
			System.out.println("정상5");
		}
		System.out.println("if~else if~else문 종료 2-------------");
		
//		else if(a>=40) {   else if 단독으로 사용하거나 
						 //if 문 이전 혹은 else 다음에 사용 불가
//			System.out.println("정상5");
//		}
		if(a>=80) {
			System.out.println("우수5");
		}
//		else {
//			System.out.println("미달4");
//		}
		else if(a>=60) {
			System.out.println("양호5");
		}
	}

}

/* if 문을 이용하여 평균등급을 수우미양가 로 출력하세요
단 등급이 '우' 일 경우 모든 과목 점수가 80 이상이라면 '균등'을 추가로 출력해 주세요
90 이상 : 수
80 이상 : 우
70 이상 : 미
60 이상 : 양
60 미만 : 가
   ex) 국어-89, 영어-88, 수학 -87 : 우(균등)
   ex) 국어-79, 영어-88, 수학 -87 : 우
*/

