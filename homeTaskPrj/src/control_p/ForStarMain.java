package control_p;

public class ForStarMain {

	public static void main(String[] args) {
		int cnt = 7;
		System.out.println("1---------------------");
		for (int line = 0; line < cnt; line++) {
			
			for (int star = 0; star <= line; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("2---------------------");
		for (int line = 0; line < cnt; line++) {
			
			for (int star = line; star <cnt; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("3---------------------");
		for (int line = 0; line < cnt; line++) {
			
			for (int star = line+1; star <cnt; star++) {
				System.out.print(" ");
			}
			for (int star = 0; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("4---------------------");
		for (int line = 0; line < cnt; line++) {
			for (int star = 0; star < line; star++) {
				System.out.print(" ");
			}
			for (int star = line; star <cnt; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("5---------------------");
		for (int line = 0; line < cnt; line++) {
			
			for (int star = line+1; star <cnt; star++) {
				System.out.print(" ");
			}
			for (int star = 0; star <= line*2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("6---------------------");
		for (int line = 0; line < cnt; line++) {
			for (int star = 0; star < line; star++) {
				System.out.print(" ");
			}
			for (int star = 1; star <(cnt-line)*2; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
/*	
		
 &&&&*
 &&&**
 &&***
 &****
 *****
 

2번

 *****
 ****
 ***
 **
 *





 3번

     *
    **
   ***
  ****
 *****





 4번

 *****
  ****
   ***
    **
     *





 5번

     *
    ***
   *****
  *******
 *********






 6번

 *********
  *******
   *****
    ***
     * 



    *
   +++
  *****
 +++++++
*********

    *
   ?*?
  *?*?*
 ?*?*?*?
*?*?*?*?*
 
    *
   *?*
  *?*?*
 *?*?*?*
*?*?*?*?*
 
 		
 */
		

	}

}
