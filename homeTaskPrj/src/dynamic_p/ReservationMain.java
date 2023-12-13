package dynamic_p;
class Reservation{
	 private String id, name, tel;
	 private int time, seet;
	 
	public Reservation(String id, String name, String tel, int time, int seet) {
		
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.time = time;
		this.seet = seet;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public int getTime() {
		return time;
	}

	public int getSeet() {
		return seet;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	 
	 
}
public class ReservationMain {

	public static void main(String[] args) {
		Reservation rrt = new Reservation(
				"aaa", 
				"한소희", 
				"010-1111-2222", 
				2, 
				34);
		
		rrt.setName("두소희");
		rrt.setTel("010-9999-8888");
		System.out.println("id:"+rrt.getId());
		System.out.println("이름:"+rrt.getName());
		System.out.println("전화:"+rrt.getTel());
		System.out.println("회차:"+rrt.getTime());
		System.out.println("좌석:"+rrt.getSeet());

	}

}
