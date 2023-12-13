package pac.korea;

import pac.germany.Engine;
import pac.germany.Sheet;

class MassageChair{
	String name;
	int price;
	Engine eg;
	Sheet sheet;
	public MassageChair(String name, int price, Engine eg, boolean eongtta, String jaelyo) {
		super();
		this.name = name;
		this.price = price;
		this.eg = eg;
		this.sheet = new Sheet(eongtta, jaelyo);
		
	}
	public MassageChair() {
		// TODO Auto-generated constructor stub
	}
	
	void massage(){
		System.out.println(name+" 한국 마사지의자 마사지해요"+eg.ppp()+"=>"+sheet.ppp());
	}
	
	void clothespin() {
		System.out.println(name+" 빨래 널어요 급속건조 : "+sheet.eongtta);
	}
}

public class KoreaMain {

	public static void main(String[] args) {
		Engine en = new Engine("v6", "휘발유", "벤츠엔진", 3000);
		MassageChair bodyf1 = new MassageChair("바디프렌드", 700, en, false, "뱀가죽");
		MassageChair czm = new MassageChair();
		czm.name = "코지마";
		czm.price = 600;
		czm.eg = en;
		czm.sheet = new Sheet(true, "헝겊");
		
		bodyf1.massage();
		bodyf1.clothespin();
		czm.massage();
		czm.clothespin();
	}

}
