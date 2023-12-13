package thread_p;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

class Exam extends Thread{
	MultiExamMain mem;
	String name;
	Timer timer;
	boolean timerChk = false,endChk = false;  //시험 종료를 파악할 변수
	
	ArrayList<Question> qqs;
	
	public Exam(MultiExamMain mem,String name, String ...arr) {
		this.mem = mem;
		this.name = name;
		qqs = new ArrayList();
		
		for (String str : arr) {
			qqs.add(new Question(str));
		}
		
		
	}
	
	boolean nowChk() {
		return mem.now == this;
	}
	
	@Override
	public void run() {
		timer = new Timer();
		timer.start();
	
		Iterator<Question>it = qqs.iterator();
		while(it.hasNext()) {
			if(nowChk()) {
				Question quiz = it.next();
				quiz.gogo();
				if(timerChk) {//timer가 끝났다면
					break;
				}
			}
			try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		endChk = true;//문제를 다풀었다--> 시험종료
		mem.goNext();//다음과목 시작
		//ppp();
		
	}
	
	void ppp() {
		System.out.println("["+name+"]");
		int cnt = 0;
		for (Question quiz : qqs) {
			if(quiz.chk) {
				cnt++;
			}
			System.out.println(quiz);
		}
		System.out.println("전체 : "+qqs.size()+", 맞은갯수 : "+cnt+", 틀린갯수 : "+(qqs.size()-cnt));
		System.out.println("합계 : "+100*cnt/qqs.size()+"/100");
	}
	
	
	class Question{
		String qq, ans, wrong;
		boolean chk = false;
		public Question(String str) {
			
			String [] arr = str.split("_");
			this.qq = arr[0];
			this.ans = arr[1];
		}
		
		void gogo() {
			while(true) {
				if(timerChk) {//timer가 끝났다면
					break;
				}
				
				String buf = JOptionPane.showInputDialog(qq);
				
				if(timerChk) {//timer가 끝났다면
					break;
				}
				System.out.println(qq+" => "+buf);
				if(buf.equals(ans)) {
					chk = true;
					break;
				}
				if(buf.equals("p")) {
					break;
				}
				if(buf.equals("nn")) {
					mem.goNext();
					break;
				}
				wrong = buf;
			}
		}

		@Override
		public String toString() {
			/*
			 3+3 => 6
			 10-2 => 8 오답(dde)
			 8/2 => 4
			 3+4*5 => 23 오답(35)
			 
			 * */
			
			String ttt = qq+" => "+ans;
			if(!chk) {
				ttt += " 오답("+wrong +")";
			}
			
			return ttt;
		}
		
		
		
	}
	
	class Timer extends Thread{
			
		@Override
		public void run() {
			//for (int i =30; i >= 0; i--) {
			int i = 10;
			while(i>0) {
				if(endChk) {
					break;
				}
				if(nowChk()) {
					System.out.println(name+" "+i);
					i--;
				}
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			timerChk = true;
			System.out.println(name + "시험종료");
		}
	}
}

public class MultiExamMain {
	Exam now;
	//int no = 0;
	ArrayList<Exam> arr;
	
	void goNext() {
		int no = arr.indexOf(now);
		no++;
		if(no >=arr.size()) {
			no = 0;
		}
		now = arr.get(no);
	}
	
	public MultiExamMain() {
		arr = new ArrayList<Exam>();
		arr.add(new Exam(this,"국어","살어리 살어리랏다_11"
				,"하늘을 우러러 한 점 부끄럼 없기를_22"
				,"빼앗긴 들에도 봄은 오는가_33"
				,"연탄재 함부로 발로 차지 마라_44"
				,"먼 훗날 당신이 찾으시면 그 때에 내 말이 '잊었노라'_55"));
		arr.add(new Exam(this,"영어","Apple_a"
				,"therefore_t",
				"at the price of_a"
				,"festivity_f"
				,"currency_c"));
		arr.add(new Exam(this,"수학","8+4/1_9"
				,"8*9+3_75"
				,"9-3*7/5_8"
				,"6+9/8*4_7"
				,"4/2*7+3_17"));
		
		
		now = arr.get(0);
		
		for (Exam exam : arr) {
			exam.start();
		}
		BIG:while(true) {
			try {
				Thread.sleep(10);
				for (Exam exam : arr) {
					if(!exam.endChk) {
						continue BIG;
					}
				}
				
				break;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("전체 시험 종료>>>>>");
		for (Exam exam : arr) {
			exam.ppp();
		}
	}

	public static void main(String[] args) {
		
		new MultiExamMain();
	}

}
