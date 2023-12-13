package dynamic_p;

abstract class Swim{
	final String type, name;

	public Swim(String type, String name) {
		this.type = type;
		this.name = name;
	}

	abstract void play(int dist);
	
	void ppp(String msg){
		System.out.println(type+" "+name +" "+msg + " 수영해요");
	}
}

//자유형: 자유형, 이름, 거리, 수영해요
//접영: 접영, 이름, 몇초, 수영해요
//평영: 평영, 이름, 잠영, 몇m, 평형 몇m 수영해요
//배영: 배영, 이름, 거리, 오리발 수영해요
class FreeStyle extends Swim{
	public FreeStyle(String name) {
		super("자유형",name);
	}

	void play(int dist) {
		
		ppp(dist+"m");
	}	
}

class Butterfly extends Swim{
	double speed; //미터당 걸리는 시간
	public Butterfly(String name, double speed) {
		super("접영",name);
		this.speed = speed;
	}

	void play(int dist) {
		
		ppp(dist*speed+"초");
	}	
}

class Breaststroke extends Swim{
	double submarine; //잠영비율
	public Breaststroke(String name, double submarine) {
		super("평형",name);
		this.submarine = submarine;
	}

	void play(int dist) {
		
		double smDist = dist * submarine;
		
		ppp("잠영 "+smDist+"m, 평형 "+(dist-smDist)+"m");
	}	
}

class Backstroke extends Swim{
	String 	flippers; //오리발
	public Backstroke(String name, String flippers) {
		super("배영",name);
		this.flippers = flippers;
	}

	void play(int dist) {
		
		ppp(dist+" 오리발("+flippers+") 신고");
	}	
}


public class SwimMain {

	public static void main(String[] args) {
		Swim [] sss = {
				new FreeStyle("박태환"),
				new Butterfly("박접영", 0.6),
				new Breaststroke("박평평", 0.2),
				new Backstroke("박배배","DMC")
		};
		for (Swim sw : sss) {
			sw.play(200);
		}
		

	}

}
