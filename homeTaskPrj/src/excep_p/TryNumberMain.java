package excep_p;

public class TryNumberMain {

	public static void main(String[] args) {
		int tot = 0;
		for (int i = 0; i <=100; i++) {
			try {
				int two = i%2;
				int a = 1234/two;
				System.out.println(i+","+two);
			} catch (Exception e) {
				tot+=i;
				System.out.println("짝수:"+i+ " , "+tot);
			}
		}
		
		System.out.println("짝수들의 합 :"+tot);
	}

}
