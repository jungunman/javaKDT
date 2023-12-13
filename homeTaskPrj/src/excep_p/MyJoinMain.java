package excep_p;

import java.util.Scanner;

/*
회원가입 프로그램 
	입력사항 - id, pw, pw확인, 성명, 이메일, 취미, 특기, 전화번호, 핸드폰
	필수 입력사항 - id, pw, pw확인 , 성명, 전화번호 , 성별(값이 없으면 에러)
					(pw, pw확인은 값이 같아야함)
	사용자 정의 예외 클래스를 활용하여 작업
*/
class MyJoinExcep extends Exception{
	String msg;
	String [] arr = {
			"빈칸 에러입니다.",
			"불일치 에러입니다.",
			"형식 에러입니다."
	};
	int no;

	public MyJoinExcep(String msg, int no) {
		
		this.msg = msg;
		this.no = no;
	}
	
	public String getMessage() {
		return msg+" "+arr[no];
	};
	
}

class MyJoinDataModule{
	String title = null, value = null;
	boolean chk = false;
	Scanner sc;

	public MyJoinDataModule(String title) {
		
		this(title, false);
	}
	
	public MyJoinDataModule(String title, boolean chk) {
		
		this.title = title;
		this.chk = chk;
		sc = new Scanner(System.in);
	}
	
	void input() throws MyJoinExcep {
		
		if(value==null) {
			System.out.print(title+":");
			String buf = sc.nextLine();
			if(buf.equals("") && chk) {
				throw new MyJoinExcep(title,0);
			}
			value = buf;
		}
	}
	
	void ppp() {
		System.out.println(title+":"+value);
	}
}


class MyPassChk extends  MyJoinDataModule{
	
	MyJoinDataModule pw;
	public MyPassChk(MyJoinDataModule pw) {
		super("암호확인");
		this.pw = pw;
	}
	
	void input() throws MyJoinExcep {
		
		if(value==null) {
			System.out.print(title+":");
			String buf = sc.nextLine();
			if(!pw.value.equals(buf)) {
				throw new MyJoinExcep(title,1);
			}
			value = buf;
		}
	}
	
	void ppp() {
	
	}
}

class MyGenderChk extends  MyJoinDataModule{
	
	
	public MyGenderChk() {
		super("성별");
		
	}
	
	void input() throws MyJoinExcep {
		
		if(value==null) {
			System.out.print(title+":");
			String buf = sc.nextLine();
			if(!buf.equals("남") && !buf.equals("여") ) {
				throw new MyJoinExcep(title,2);
			}
			value = buf;
		}
	}
}

class BirthChk extends  MyJoinDataModule{
	
	int year, month, date;
	boolean chk = true;
	public BirthChk() {
		super("생년월일");
		
	}
	
	int [] monthArr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	void input() throws MyJoinExcep {
		
		if(chk) {
			System.out.print(title+":");
			int buf = sc.nextInt();
			if(buf>19801231 || buf <10000) {
				throw new MyJoinExcep(title,2);
			}
			date = buf%100;
			buf/=100;
			month = buf%100;
			if(month==0 || month>12 ||
				date==0 || date>monthArr[month]	) {
				throw new MyJoinExcep(title,2);
			}
			year = buf/100;
			
			chk = false;
		}
	}
	
	void ppp() {
		System.out.println(title+":"+year+"-"+month+"-"+date);
	}
}

class MyJoinData{
	
	MyJoinDataModule [] arr;
	
	public MyJoinData() {
		
		MyJoinDataModule pw;
		
		arr = new MyJoinDataModule[] {
				
			new MyJoinDataModule("id", true),
			pw = new MyJoinDataModule("암호", true),
			new MyPassChk(pw),
			new MyJoinDataModule("이름", true),
			new MyGenderChk(),
			new MyJoinDataModule("email"),
			new MyJoinDataModule("취미"),
			new BirthChk(),
			new MyJoinDataModule("특기"),
			new MyJoinDataModule("전화번호", true),
			new MyJoinDataModule("핸드폰")	
		};
	}
	
	void joinExec() {
		
		while(true) {
			try {
				for (MyJoinDataModule mjdm : arr) {
						mjdm.input();
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		ppp();
	}
	
	
	void ppp() {
		
		for (MyJoinDataModule mjdm : arr) {
			mjdm.ppp();
		}
		
	}
}
public class MyJoinMain {

	public static void main(String[] args) {
		MyJoinData md = new MyJoinData();
		md.joinExec();
		
	}

}
