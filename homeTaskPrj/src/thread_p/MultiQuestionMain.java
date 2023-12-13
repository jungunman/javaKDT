package thread_p;

import java.util.ArrayList;


import javax.swing.JOptionPane;


class MQExamModule{
	String qq, ans, wrong;
	boolean chk = false;
	public MQExamModule(String qq, String ans) {
		
		this.qq = qq;
		this.ans = ans;
	}
	
	void gogo(MQTimer mt) {
		while(true) {
			if(mt.endChk) {//timer가 끝났다면
				break;
			}
			
			String buf = JOptionPane.showInputDialog(qq);
			
			if(mt.endChk) {//timer가 끝났다면
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

class MQExam extends Thread{
	MQTimer mt;
	
	ArrayList<MQExamModule> qqs;
	
	public MQExam(MQTimer mt) {
		this.mt = mt;
		qqs = new ArrayList();
		
		qqs.add(new MQExamModule("3+3","6"));
		qqs.add(new MQExamModule("10-2","8"));
		qqs.add(new MQExamModule("8/2","4"));
		qqs.add(new MQExamModule("3+4*5","23"));
	}
	
	@Override
	public void run() {
		
		for (MQExamModule quiz : qqs) {
			quiz.gogo(mt);
			if(mt.endChk) {//timer가 끝났다면
				break;
			}
		}
		ppp();
		
	}
	
	void ppp() {
		mt.endChk = true;//문제를 다풀었다--> 시험종료
		int cnt = 0;
		for (MQExamModule quiz : qqs) {
			if(quiz.chk) {
				cnt++;
			}
			System.out.println(quiz);
		}
		System.out.println("전체 : "+qqs.size()+", 맞은갯수 : "+cnt+", 틀린갯수 : "+(qqs.size()-cnt));
		System.out.println("합계 : "+100*cnt/qqs.size()+"/100");
	}
}

class MQTimer extends Thread{
	boolean endChk = false;  //시험 종료를 파악할 변수	
	@Override
	public void run() {
		for (int i =30; i >= 0; i--) {
			if(endChk) {
				break;
			}
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		endChk = true;
		System.out.println("시험종료");
	}
}

public class MultiQuestionMain {

	public static void main(String[] args) {
		//String buf = JOptionPane.showInputDialog("운만안녕?");
		//System.out.println(buf);

		
		MQTimer timer = new MQTimer();
		MQExam exam = new MQExam(timer);
		exam.start();
		timer.start();
		
		
		//1번
		//국어,영어,수학 시험문제를 구현하세요
		//답이 틀리면 다시 풀게 하세요
		//p를쓰면 오답처리하고 다음문제로 진행시키세요
		//총점, 평균을 구하세요
		
		//2번 
		//5명이 시험을 보세요
		//등수까지 하세요
		
		//3번 
		//타이머를 제어하세요
		//nn을 누르면 다음과목으로 넘어가세요
		// 과목마다 타이머 다르게 작동
		// 과목 시험이 끝나면 다음 과목으로 자동으로 연결
	}

}

