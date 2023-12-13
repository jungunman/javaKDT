package pac_1;

import pac_2.DDD;
import pac_2.EEE;
//import pac_2.FFF;
import pac_2.*; //pac_2 패키지 안의 접근 가능한(public) 클래스 가능 
				//하위 패키지 포함 하지 않음
//import pac_2..*;
import pac_2.sub.JJJ;

class AAA{
	String t1 = "pac_1.AAA.t1";
}

public class PacMain {

	public static void main(String[] args) {
		AAA p1a = new AAA();
		BBB p1b = new BBB();
		CCC p1c = new CCC();
		DDD p2d = new DDD();
		EEE p2e = new EEE();
		GGG p2g = new GGG(); // import pac_2.*; 로 선언 가능
		KKK p1k = new KKK();
		pac_1.EEE p1e = new pac_1.EEE();
		JJJ p2sj = new JJJ();
		
		System.out.println("p1a : "+p1a.t1);
		System.out.println("p1b : "+p1b.t1);
		System.out.println("p1c : "+p1c.t1);
		System.out.println("p2d : "+p2d.t1);
		//System.out.println("p2d : "+p2d.t1+","+p2d.t4);
		System.out.println("p2e : "+p2e.t1);
		System.out.println("p2g : "+p2g.t1);
		System.out.println("p1k : "+p1k.t1);
		System.out.println("p1e : "+p1e.t1);
		System.out.println("p2sj : "+p2sj.t1);
	}

}
