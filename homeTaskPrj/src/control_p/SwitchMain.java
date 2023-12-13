package control_p;

public class SwitchMain {

	public static void main(String[] args) {
		
		switch(30) {
		case 50:
			System.out.println("50이지롱");
		case 20:
			System.out.println("20이지롱");
		case 40:
			System.out.println("40이지롱");
		case 30:	//같은 값의 case로 이동하여 실행
			System.out.println("30이지롱");
		case 60:
			System.out.println("50이지롱");
		}
		System.out.println("switch 종료1 ------------------");
		//switch('a') {    정수, 문자, 문자열 가능 
		//switch("아기상어") {  실수, boolean 불가
		//switch(123.456) {
		//switch(true) {
		
		//}
		System.out.println("switch 종료2 ------------------");
		switch(100) {
		case 50:	//case 값을 순차 처리할 필요 없음
			System.out.println("50이지롱");
			break;
		case 20:
			System.out.println("20이지롱");
			break;
		default:
			System.out.println("기본값 이지롱");
			break;
		case 30:	
			System.out.println("30이지롱");
			break;	//제어문 탈출시 사용
		case 60:
			System.out.println("50이지롱");
			break;
		}
		System.out.println("switch 종료3 ------------------");
		
		//직급별 월급을 계산 하세요
	    //부장 : 50%, 과장 : 30%, 대리 : 20%, 사원:10%
	    //월급 :  기본급 + 기본급*보너스
	    //직급과 기본급은 입력받아 처리

		String grade = "과장";
		int basic = 400;
		double bonus;
		
		switch(grade) {
		case "부장":
			bonus = 0.5;
			break;
		case "과장":
			bonus = 0.3;
			break;
		case "대리":
			bonus = 0.2;
			break;
		case "사원":
			bonus = 0.1;
			break;
		default:
			bonus = 0;
			break;
		}
		int money = basic + (int)(basic * bonus);
		
		System.out.println(money);
		
		/*커피를 종류대로 주문받아 처리하세요

		아메리카노 : 2000
		아시아노  : 3000
		아프리카노 : 4000


	// 커피값이 10000 이상이면 배달가능,  
	           8000 이상이면 포인트추가, 미만이면 기본 이 나오게 해주세요
		   
		*/
		
		String order = "아시아노";
		int cnt = 4;
		
		int price;
		
		switch(order) {
		case "아메리카노":
			price = 2000;
			break;
		case "아시아노":
			price = 3000;
			break;
		case "아프리카노":
			price = 4000;
			break;
		default:
			price = 0;
			break;
		}
		
		money = price * cnt;
		String res = "";
		if(money>=10000) {
			res = "배달가능";
		}else if(money>=8000) {
			res = "포인트 추가";
		}else {
			res = "기본";
		}
		System.out.println(money+res);	
	}

}
