package thread_task_p;

/*
 * 손님은 하나의 음식만 먹을 수 있고,
 * 배식구에 다른 사람이 대기하고 있으면 먹을 수 없습니다.
 * 하나의 음식을 먹는 도중에는 음식이 나왔더라도 다시 음식을 가지러 갈 수 없습니다.
 * 다른 손님이 음식을 낚아 채가면 다시 기다려요!
 * 입장과 동시에 제한시간의 흐름은 흘러갑니다.
 * */
public class Consumer extends Thread{
	Restaurant  visited;
	Foods<String,Integer,Integer> eattingFoodName;
	String name;
	int limitTime;
	int eatTime;//밥먹는 시간;
	int eatCnt;
	
	public Consumer(String name ,Restaurant restaurant) {
		super(name);
		this.visited = restaurant;
		this.name = name;
		this.limitTime = visited.limitTime;
	}
	
	
	void eat() {
									//최대 20분  // 기본 10분
		eatTime = (int)(Math.random()*(20*1000)+(10*1000));
		eattingFoodName = visited.distribution;
	}
	
	
	@Override
	public void run() {
		int joinTime = 1;
		int limitTime = visited.limitTime/1000;
		
		System.out.println(getName() + " 입장했습니다." );
		while(limitTime >= joinTime) {
			try {
				if (!visited.thereIsDistribution) { //배식구에 음식이 없다면
					sleep(1000);
					interrupt();
				}else {
					//식사중
					eat();
					System.out.println(getName()+"이 식사("+eattingFoodName+") 시작 ("+eatTime/1000+"분 후 식사 종료)");
					sleep(eatTime);
					//식사 끝
					eatTime = 0;
					visited.totPrice += eattingFoodName.price;
				}
			}catch(InterruptedException e) {
				System.out.println("음식이 없네요.");
			}
		}
		//식사가 끝나면 아래
		
		
	
	
	}
	/*	손님 - 5명 : 
		식사 가능 시간 - 2시간
		각 식사시간 10~30분 랜덤
		최대 식사 갯수 : 4개
		식사 후
		손님 각각 결재금액 출력
	 * */
	
	
}
