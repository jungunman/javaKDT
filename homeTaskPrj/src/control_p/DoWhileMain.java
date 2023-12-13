package control_p;

public class DoWhileMain {

	public static void main(String[] args) {
		int i = 0;
		while(i<5) {
			System.out.println("while : "+i);
			i++;
		}
		System.out.println("while 종료 ------------"+i);
		
		
		i = 0;
		do{
			//do~while : 조건에 맞지 않아도 최초 1회 실행
			System.out.println("do~while : "+i);
			i++;
		}while(i<5);
		
		System.out.println("do~while 종료 ------------"+i);
	}

}
