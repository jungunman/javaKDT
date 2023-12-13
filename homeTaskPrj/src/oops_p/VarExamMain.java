package oops_p;

import java.util.Arrays;

class VarStud{
	String kind,name;
	int [] jum;
	int tot;
	double avg;
	
	void init(String name, int ...jum) {
		this.name = name;
		this.jum = jum;
		kind = new String[] {"직장인","일반","예체능"}[jum.length-2];
		calc();
		ppp();
	}
	
	void calc() {
		tot = 0;
		double [] rate = {0.2,0.15,0.05,0.6};
		avg = 0;
		
		for (int i = 0; i < jum.length; i++) {
			
			tot += jum[i];
			if(kind.equals("예체능")) {
				avg += rate[i] * jum[i];
			}
		}
		
		switch (kind) {
			case "일반":
				avg = tot/jum.length;
				break;
			case "직장인":
				avg = (tot+10)/jum.length;
				break;
		}
		
		
		//System.out.println("calc"+name);
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t"+
					Arrays.toString(jum)+"\t"+
					tot+"\t"+avg;
		
		System.out.println(ttt);
	}
}

public class VarExamMain {

	public static void main(String[] args) {
		VarStud vs = new VarStud();
		vs.init("현빈", 77,78,71);
		//vs.ppp();
		vs.init("원빈", 97,98);
		//vs.ppp();
		vs.init("투빈", 67,68,61,64);
		//vs.ppp();
		vs.init("골빈", 87,88,81);
		//vs.ppp();

	}

}
