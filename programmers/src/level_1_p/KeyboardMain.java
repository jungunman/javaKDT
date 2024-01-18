package level_1_p;

import java.util.Arrays;

class Keyboard{
	public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [keymap.length];
        
    
        
        
        for (int target = 0; target < targets.length; target++) {
			char [] ct = targets[target].toCharArray();
			int [] cnt = new int[keymap.length]; 
			int sum = 0;
			int compare = 0;
			for (int i = 0; i < ct.length; i++) {
				
				for (int j = 0; j < keymap.length; j++) {
					if(keymap[j].indexOf(ct[i]) != -1) {
						cnt[j] = keymap[j].indexOf(ct[i])+1;
						System.out.println("target("+target+") == ct("+ct[i]+") :: cnt [ "+j+" ] : "+cnt[j]);
					}
				}
				
				compare = cnt[0] == 0 ? cnt[1] : cnt[0];
				for (int index : cnt) {
					System.out.println("compare : "+compare+" ===> outIndex : " + index);
					if(compare > index && index != 0) {
						compare = index;
						System.out.println("index : " + index);
					}
				}
				
				sum+= compare;
				System.out.println("sum : " + sum);
			}
			
			answer[target] = sum;
			System.out.println("answer [ "+target+" ] ==> " + answer[target]);
		}
        
        if(answer.length == 1 && answer[0] == 0) {
        	answer[0] = -1;
        }
        
        
        return answer;
    }
}

public class KeyboardMain {

	public static void main(String[] args) {
		Keyboard key = new Keyboard();
		
		System.out.println(Arrays.toString(key.solution(new String[] {"AGZ", "BSSS"}, new String[] {"ASA","BGZ"})));
	}

}
