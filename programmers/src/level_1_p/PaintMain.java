package level_1_p;
class Paint{
	public int solution(int n, int m, int[] section) {
        int answer = 0;
       
        int area = 0;
        
        for (int i = 0; i < section.length; i++) {
			if (area < section[i]) {
				area = section[i]-1 + m;
				System.out.println("area : " + area);
				answer++;
			}
		}
        
        return answer;
    }
}


public class PaintMain {

	public static void main(String[] args) {
		Paint paint = new Paint();
		
		System.out.println(paint.solution(9,2, new int [] {3, 7, 9}));

	}

}
