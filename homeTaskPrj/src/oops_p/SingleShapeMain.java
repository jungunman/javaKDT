package oops_p;

class SingleShapeRes{
	private SingleShapeRes() {}
	private static SingleShapeRes me = null;
	static SingleShapeRes getInstance() {
		if(me == null) {
			me = new SingleShapeRes();
		}
		return me;
	}
	
	SingleShape recArea;
	SingleShape recBorder;
	SingleShape triArea;
	SingleShape triBorder;
	
	void compare(SingleShape you) {
		if(you.name.equals("직사각형")) {
			if(recArea==null) {
				recArea = you;
				recBorder = you;
			}else {
				if(recArea.area < you.area) {
					recArea = you;
				}
				if(recBorder.border < you.border) {
					recBorder = you;
				}
			}
		}
		if(you.name.equals("직각삼각형")) {
			if(triArea==null) {
				triArea = you;
				triBorder = you;
			}else {
				if(triArea.area < you.area) {
					triArea = you;
				}
				if(triBorder.border < you.border) {
					triBorder = you;
				}
			}
		}
	}
	
	void ppp() {
		System.out.println("결과 >>>> ");
		System.out.println("넓이 : "+recArea);
		System.out.println("둘레 : "+recBorder);
		System.out.println("넓이 : "+triArea);
		System.out.println("둘레 : "+triBorder);
	}
}

class SingleShape{
	String name;
	int area, border;
	public SingleShape(int w, int h) {
		
		this.name = "직사각형";
		this.area = w * h;
		this.border = (w + h) * 2;
		SingleShapeRes.getInstance().compare(this);
	}
	
	public SingleShape(int w, int h, int a) {
		
		this.name = "직각삼각형";
		this.area = w * h / 2;
		this.border = w + h + a;
		SingleShapeRes.getInstance().compare(this);
	}

	@Override
	public String toString() {
		return "[" + name + "] " + area + " , " + border;
	}
	
	
	
}
public class SingleShapeMain {

	public static void main(String[] args) {
		System.out.println(new SingleShape(4,5));
		System.out.println(new SingleShape(3,6));
		System.out.println(new SingleShape(7,2));
		System.out.println(new SingleShape(4,5,7));
		System.out.println(new SingleShape(9,2));
		System.out.println(new SingleShape(7,2,100));
		System.out.println(new SingleShape(9,2,7));
		SingleShapeRes.getInstance().ppp();
	}

}
