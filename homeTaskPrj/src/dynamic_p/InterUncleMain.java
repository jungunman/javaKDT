package dynamic_p;

interface IeBusiness{
	void working(String job);
	void resting();
}
interface IePar{
	void working(String job);
	void nosleeping();
}
interface IeGuy{
	void game(String title);
}

interface IeUncle extends IeBusiness, IePar, IeGuy{
	
}

class IeSCV implements IeUncle{
	String name;
	int age;
	
	
	
	public IeSCV(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public void working(String job) {
		System.out.println(name + " "+job+" 일해요");
	}
	@Override
	public void resting() {
		System.out.println(name +" "+age/10*10+ "분 휴식요");
		
	}
	@Override
	public void nosleeping() {
		System.out.println(name + " 안잔다");
		
	}
	@Override
	public void game(String title) {
		System.out.println(name + " "+title + " 게임해요");
		
	}	
}

public class InterUncleMain {

	public static void main(String[] args) {
		IeSCV scv = new IeSCV("정우성", 51);
		IeBusiness ib = scv;
		IePar ip = scv;
		IeGuy ig = scv;
		ib.working("프로젝트개발");
		ip.nosleeping();
		ig.game("롤");
		ib.resting();
	}

}
