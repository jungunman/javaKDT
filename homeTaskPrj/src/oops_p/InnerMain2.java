package oops_p;

class ClaOuter2{
	int a = 10;
	String b = "바깥b";
	static String sc = "바깥sc";
	int c = 90;   //중첩
	
	void meth_1() {
		double a = 123.456;
		//지역 이너클래스 : 메소드 안에서 정의
		double c = 987.654;  //중첩
		class LoInn{
			
			int aa;
			String bb;
			String c = "지역이너c"; //중첩
			public LoInn(int aa, String bb) {
				System.out.println("지역 이너클래스 생성자");
				this.aa = aa;
				this.bb = bb;
			}
			void meth_1() {
				boolean c = true;  //중첩
				//아웃터 멤버, 지역, 자신멤버 모두 접근 가능
				System.out.println("지역 meth_1() 시작:"+a+","+b+","+sc+","+c+","+aa+","+bb);
				//System.out.println("중첩:"+a+","+this.a+","+c+","+this.c);
				//변수 이름 중첩시
				// 아우터메소드 지역변수가 이너변수와 중첩시 접근 불가
				// 현재메소드지역변수 > 이너멤버변수 > 아우터멤버변수 
				System.out.println("중첩:"+a+","+ClaOuter2.this.a+","+c+","+this.c+","+ClaOuter2.this.c);
				System.out.println("지역 meth_1() 끝");
			}
		}
		
		System.out.println("아웃터 meth_1() 시작-------");
		LoInn inn = new LoInn(11, "나는무너");
		System.out.println("아웃터 멤버 : "+a+","+b+","+sc+","+c);
		System.out.println("inn : "+ inn.aa+","+inn.bb);
		inn.meth_1();
		System.out.println("아웃터 meth_1() 끝-------");
	}
	
	/*
	void meth_2(LoInn1 aa) { //지역 이너클래스- 매개변수로 선언불가
		
		//지역 이너클래스 : 메소드 안에서 정의
		class LoInn1{
			public LoInn1() {
				System.out.println("지역 이너클래스 생성자");
			}
		}
	}
	
	LoInn3 meth_3() { //지역 이너클래스 - 리턴으로 선언불가
		
		//지역 이너클래스 : 메소드 안에서 정의
		class LoInn3{
			public LoInn3() {
				System.out.println("지역 이너클래스 생성자");
			}
		}
	}*/
	
	//LoInn li;  아웃터의 멤버로 선언 정의 불가
}

class ClaOuter3{
	public ClaOuter3() {
		System.out.println("ClaOuter3 생성자------------------");
	}
}

interface InnIn{
	void meth_1();
	void meth_2();
}

public class InnerMain2 {
	
	static void mmm(InnIn nn) {
		
	}

	public static void main(String[] args) {
		ClaOuter2 oo = new ClaOuter2();
		oo.meth_1();
		//ClaOuter2.LoInn ol;  지역 이너클래스 -> 인스턴스에서 선언 불가
		
		ClaOuter3 co3 = new ClaOuter3() {
			class Anno{
				public Anno() {
					System.out.println("익명이너클래스 생성자");
				}
			}
			Anno an = new Anno();
		};
		
		mmm(
				
				
			new InnIn() {//익명클래스
			
				@Override
				public void meth_2() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void meth_1() {
					// TODO Auto-generated method stub
					
				}
			}
		);
		
		class AAA implements InnIn {

			@Override
			public void meth_1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void meth_2() {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		mmm(new AAA());
		
	}

}
