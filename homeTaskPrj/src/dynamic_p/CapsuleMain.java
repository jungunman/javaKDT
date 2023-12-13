package dynamic_p;

class CapMember{
	private String name, email;
	private int no;
	private double weight = 78.5;
	private boolean marriage;
	
	public CapMember(int no) {
		
		this(no, "정우성", "aaa@aaa.com", 63, true);
	}
	
	private CapMember(int no, String name, String email, double weight, boolean marriage) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.weight = weight;
		this.marriage = marriage;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	public int getNo() {
		return no;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void ppp() {
		System.out.println(no+","+name+","+email+","+weight+","+marriage);
	}
}


public class CapsuleMain {

	public static void main(String[] args) {
		CapMember mem1 = new CapMember(17);
		
		System.out.println(mem1.getName());
		System.out.println(mem1.getNo());
		System.out.println(mem1.getWeight());
		System.out.println(mem1.isMarriage());
		mem1.ppp();
		mem1.setName("정좌성");
		mem1.setEmail("bbb@ccc.com");
		mem1.setMarriage(false);
		mem1.ppp();
		
		//영화예약 클래스를 생성하여 출력해보세요

		//예약시 필수 입력 사항 : id, 성명, 전화번호, 상영시간, 좌석번호

		//예약후 변경 가능사항 : 성명, 전화번호

		//출력시 모든 항목이 다 있어야 함
	}

}
