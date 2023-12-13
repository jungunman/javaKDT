package pac.germany;

public class Sheet {

	public boolean eongtta;
	public String jaelyo;
	
	
	
	
	public Sheet(boolean eongtta, String jaelyo) {
		super();
		this.eongtta = eongtta;
		this.jaelyo = jaelyo;
	}




	public String ppp() {
		return "의자 : "+jaelyo+","+eongtta;
	}
}
