package util_p;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		String ttt = "차은우,더운은우,시원은우_바나나은우.뜨거운은우,미지근은우";

		String [] arr = ttt.split("[,._]");
		
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("----------------------");
		
		StringTokenizer stk = new StringTokenizer(ttt, ",._");
		System.out.println(stk.hasMoreElements());
		System.out.println("----------------------");
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
		System.out.println("----------------------");
	}

}
