package pac.germany;

public class Engine {

	public String oil, type, name;
	public int size;
	public Engine(String type, String oil, String name, int size) {
		
		this.type = type;
		this.oil = oil;
		this.name = name;
		this.size = size;
	}
	
	public String ppp() {
		return "엔진 : "+oil+","+type+","+name+","+size;
	}
}
