package thread_task_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*레스토랑은 주방장 3명을 고용하고 있다.
 * 음식 배식구는 하나이며, 음식이 있을 경우 손님이 가져갈 수 있다.
 * 음식이 나왔는데 여러명이 하나의 음식을 찢어 갈 수 없다.
 * 운영 시간이 끝나면 결산을 시작한다.*/
class Restaurant extends Thread{
				//이름,조리시간,가격
	List<Foods<String,Integer,Integer>> menu;
	List<Chef<List<Foods<String,Integer,Integer>>>> chefs;
	
	Foods<String,Integer,Integer> distribution;
	boolean thereIsDistribution = true; //배식구 ==> 쉐프가 True로 만들고, 손님이 ==False로 만듬.
	int operTime, limitTime;//운영시간, 식사 제한 시간,
	int totPrice;//총매출
	
	
	public Restaurant(int operTime, int limitTime) {
		this.operTime = operTime;
		this.limitTime = limitTime;
		
		//가게 음식 메뉴 셋팅
		menu = new LinkedList<>();
		menu.add(new Foods<>("스테이크",5*1000 ,11000));
		menu.add(new Foods<>("파스타",3*1000 ,7000));
		menu.add(new Foods<>("피자",7*1000 ,9000));
		
		//주방장 고용
		chefs = new ArrayList<>();
		chefs.add(new Chef<>("루카스", menu));
		chefs.add(new Chef<>("제이슨", menu));
		chefs.add(new Chef<>("포카드", menu));
		
		//주방장 출근
		for (Chef<List<Foods<String, Integer, Integer>>> chef : chefs) {
			chef.start();
		}
	}
	
	
	@Override
	public void run() {
		int limit = limitTime/1000;
		int current = 1;
		
		while(limit >= current) {
			try {
				sleep(1000);
				System.out.println(current + "운영중");
				current++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//가게 끝났을 때 아래/
		
		System.out.println("가게 문 닫았소. 썩 꺼지시오.");
	
	
	
	}
	
	
}


public class RestaurantThreadMain {

	public static void main(String[] args) {

		Restaurant rest = new Restaurant(10*60*1000, 2*60*1000);
		rest.start();
		
		try {
			Thread.sleep(1000);
			Consumer c1 = new Consumer("최철기", rest);
			c1.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/*
페밀리 레스토랑을 구현하세요

음식 (조리시간): 
스테이크(5분) : 11000, 
파스타(3분)  7000, 
피자(7분)   9000,

주방장 - 3명

손님 - 5명 : 
식사 가능 시간 - 2시간
각 식사시간 10~30분 랜덤
최대 식사 갯수 : 4개
식사 후
손님 각각 결재금액 출력

식당 브레이크 타임
주방장 및 식당 결산
배식구는 하나다 , 하나의 배식구에 음식이 있으면 다른 조리된 음식은 올려 둘 수 없고,
손님이 가져가기 전까지는 음식을 올려둘수 없다.
손님이 가져가면 배식구에 올려둘 수 있다.
하나의 음식을 여러 사람들이 동시에 가져갈 수 없으며,

손님은 음식을 먹는 도중에는 다시 음식을 가져갈 수 없다 = > sleep();
그리고 위의 조건을 만족해야한다.

* */