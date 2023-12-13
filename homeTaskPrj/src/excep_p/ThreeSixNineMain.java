package excep_p;

public class ThreeSixNineMain {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
			int one = i%10;
			int three = one%3; 
			try {
				int a = 1234/three;
				//System.out.println(i+ ":" +one +" , "+three);
				System.out.println(i);
			} catch (Exception e) {
				
				try {
					int a = 1234/one;
					//System.out.println(i+ "짝:" +one +" , "+three);
					System.out.println("짝");
				} catch (Exception e2) {
					//System.out.println(i+ "에러에러:" +one +" , "+three);
					System.out.println(i);
				}
				
				
			}
		}

	}

}
