package programmers_p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Lv1_Running {

	public static void main(String[] args) {
		String [] player = {"mumu", "soe", "poe", "kai", "mine"};
		String [] calling = {"kai", "kai", "mine", "mine"};
		
		ArrayList<String> lst = new ArrayList<String>();
		Stack<String> stk = new Stack<String>();
		Map<Integer, String> map = new HashMap<>();
		
		for (int i = 0; i < player.length; i++) {
			lst.add(""+i);
			stk.push(""+i);
		}
		
		while(lst.size() > 0) {
			System.out.println("size = "+lst.size());
			System.out.println(lst.remove(0));
		}
		
		
		
		
	}

}
