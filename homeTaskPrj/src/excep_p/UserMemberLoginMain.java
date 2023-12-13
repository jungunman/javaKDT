package excep_p;

import java.util.Scanner;


class UserMember{
	String id, pw, name;

	public UserMember(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
}

public class UserMemberLoginMain {

	public static void main(String[] args) {
		
		UserMember [] mems = {
				new UserMember("aa","1111","이효리"),
				new UserMember("bb","2222","삼효리"),
				new UserMember("cc","3333","사효리"),
				new UserMember("dd","4444","오효리"),
				new UserMember("ee","5555","육효리")
		};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("ID:");
				String id = sc.nextLine();
				
				UserMember nowMem = null;
				
				for (UserMember mem : mems) {
					if(mem.id.equals(id)) {
						nowMem = mem;
						break;
					}
				}
				
				if(nowMem == null) {
					throw new Exception("id 에러");
				}
				
				System.out.print("PW:");
				String pw = sc.nextLine();
				
				if(!pw.equals(nowMem.pw)) {
					throw new Exception("pw 에러");
				}
				
				System.out.println(nowMem.name + "님 로그인 성공");
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		System.out.println("프로그램 종료");
		
		/*
		 5명의 정보로 로그인을 구현하세요
		로그인 성공시 이름으로 출력하세요
		
		 * */
	}

}
