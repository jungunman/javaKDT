package control_p;

public class ForSequenceMain {

	public static void main(String[] args) {

		System.out.println("시작 1-----------");
		
		for (int i = 0; i < 5; i+=2) {
		//  int i : 반복변수 - for문 최초 실행시 선언되고 , 
			               //for문 최종 종료시 소멸	
		//   int i = 0					----- 1
		//              i(0)<5 			----- 2
		//                     	i = 2   ----- 5
		//              i(2)<5 			----- 6	
		//                     	i = 4    ----- 9
		//              i(4)<5 			----- 10
		//		        		i = 6   ----- 13
		//              i(6)<5 탈출		----- 14
			
			//내부 변수 : for문 반복될때마다 선언 및 소멸 반복
			int a = 3;					//--- 3,7,11
			
			System.out.println(i+","+a);// -- 4,8,12
		}
		System.out.println("끝 1-----------");
		//System.out.println("끝 1-----------"+i);
		
		int x = 5;
		for (  ; x < 10; x++) {
			//외부변수를 반복변수로 사용가능
			System.out.println(x);
		}
		System.out.println("끝 2-----------"+x);
		
		//for (x  ; x < 10; x++) {
		// 초기식에 변수만 지정 불가
		for (x = 8 ; x < 10; x++) {
		// 초기화 부분에 반복변수 대입 가능	
			System.out.println(x);
		}
		System.out.println("끝 3-----------"+x);
		
		/* 
		 * 여기서  k의 값을 놓쳐서 제대로 진행이 안됩니다.
		 * 
		 * 초기화 되지 않은 반복 변수 사용 불가
		for (int k ; k < 10; k++) {
			
			System.out.println(k);
		}
		
		//외부변수와 같은 이름으로 반복변수 선언 불가
		for (int x = 7 ; x < 10; x++) {
			
			System.out.println(x);
		}
		*/
	}

}
