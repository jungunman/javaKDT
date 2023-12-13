package excep_p;

import java.util.Scanner;

class MyUserExcep extends Exception{

	String [] title = {
			" 빈칸입니다.",
			" 불일치 입니다람쥐"
	};
	
	String msg;
	int no;
	public MyUserExcep(String msg, int no) {
	
		this.msg = msg;
		this.no = no;
	}
	
	@Override
	public String getMessage() {
		
		return msg+title[no];
	}
	
	
}
public class MyUserLoginMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("ID:");
				String id = sc.nextLine();
				
				if(id.equals("")) {
					throw new MyUserExcep("id",0);
				}
				
				if(!id.equals("aaa")) {
					throw new MyUserExcep("id",1);
				}
				
				System.out.print("PW:");
				String pw = sc.nextLine();
				
				if(pw.equals("")) {
					throw new Exception("pw 빈칸입니다.");
				}
				
				if(!pw.equals("1234")) {
					throw new Exception("pw 불일치 입니다람쥐");
				}
				
				System.out.println("로그인 성공:"+id+","+pw);
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		System.out.println("프로그램 종료");
		
		/*
//회원가입 프로그램을 작성하세요
//입력사항 - id, pw, pw확인, 성명, 이메일, 취미, 특기, 전화번호, 핸드폰
//필수 입력사항 - id, pw, pw확인, 성명, 전화번호
//            비밀번호, 비밀번호 확인은 값이 같아야만 가능
//사용자 정의 예외 클래스를 활용하여 작업할 것
 * 
 * 
 *  성별 (값이 없으면 에러 발생)
//유효성 검사 - 생년 : 1980 이전 출생자만 가입 가능
		 * */
	}

}
