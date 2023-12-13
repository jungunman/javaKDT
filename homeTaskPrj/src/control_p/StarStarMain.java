package control_p;

public class StarStarMain {

	public static void main(String[] args) {
		
		int lineCnt = 5;
		int half = lineCnt/2+1;

		for (int line = 0; line < lineCnt; line++) {
			
			int offset = line;
			if(line>=half) {
				offset= lineCnt-line-1;
			}
			
			for (int star = 0; star < lineCnt+2; star++) {
				String ttt = "*";
				
				if(star >= half-offset && star <=half+offset) {
					ttt = " ";
				}
				
				System.out.print(ttt);
				
			}
			System.out.println(line);
		}

	}

}
