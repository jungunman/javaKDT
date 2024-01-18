package level_1_p;

import java.util.Arrays;

class Drag{
	
	public int[] solution(String[] wallpaper) {
        int[] answer = new int [4];
        
        int [] start = new int [2];
        int [] end = new int [2];
        boolean first = true;
        for (int y = 0; y < wallpaper.length; y++) {
			char [] word = wallpaper[y].toCharArray();
			for (int x = 0; x < word.length; x++) {
				
				if(word[x] == '#') {
					if(first) {
						start[0] = y;
						start[1] = x;
						end[0] = y;
						end[1] = x;
						first= false;
					}else {
						
						if(end[0] < y) {
							end[0] = y;
						}
						if(start[0] > y) {
							start[0] = y;
						}
						
						if(start[1] > x) {
							start[1] = x;
						}
						if(end[1] < x) {
							end[1] = x;
						}
					}
					
				}
			}
		}
        
        answer[0] = start[0];
        answer[1] = start[1];
        answer[2] = end[0]+1;
        answer[3] = end[1]+1;

        return answer;
    }
	
}
//[0, 1, 3, 4]



public class DragMain {

	public static void main(String[] args) {
		
		String [] wall = {"..", "#."};
		
		Drag drag = new Drag();
		
		System.out.println(Arrays.toString(drag.solution(wall)));
		
		
	}

}
