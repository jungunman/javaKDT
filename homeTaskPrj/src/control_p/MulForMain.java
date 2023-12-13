package control_p;

public class MulForMain {

	public static void main(String[] args) {

		for (int h = 1; h <=12; h++) {
			System.out.println("[[["+h+"시]]]");
			
			for (int m = 0; m < 60; m++) {
				System.out.println(h +" : "+m);
			}
			//System.out.println(h +" : "+m);
		}
		
		System.out.println("1. --------------------------");
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("["+dan+"단]");
			for (int gob = 1; gob <10; gob++) {
				System.out.println(dan+" x "+gob+" = "+dan*gob);
			}
		}
		
		System.out.println("2. --------------------------");
		String title = "", line="";
		for (int dan = 2; dan < 10; dan++) {
			title += "  ["+dan+"단]\t\t";
			line += "================";
		}
		System.out.println(title);
		System.out.println(line);
		for (int gob = 1; gob <10; gob++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.print(dan+" x "+gob+" = "+dan*gob+"\t");
			}
			System.out.println();
		}

	}

}
