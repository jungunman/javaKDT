package control_p;

public class SwitchSampleMain {

	public static void main(String[] args) {

		double avg = 100.54;
		System.out.println((int)avg/10);
		
		switch((int)avg/10) {
		case 9,10:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}
		
		avg = 3.8;
		String res;
		switch((int)(avg*2)) {
		case 9:
			res = "A+";
			break;
		case 8:
			res = "A";
			break;
		case 7:
			res = "B+";
			break;
		case 6:
			res = "B";
			break;
		case 5:
			res = "C+";
			break;
		case 4:
			res = "C";
			break;
		case 3:
			res = "D+";
			break;
		case 2:
			res = "D";
			break;
		default :
			res = "F";
			break;	
		}
		System.out.println(avg+" : "+res);
		
		res = (int)(avg%1+0.5) == 1 ? "+" : "";
		//System.out.println(res);
		
		switch((int)avg) {
		
		case 4:
			res = "A"+res;
			break;
		
		case 3:
			res = "B"+res;
			break;
		
		case 2:
			res = "C"+res;
			break;
		
		case 1:
			res = "D"+res;
			break;
		default :
			res = "F";
			break;	
		}
		System.out.println(avg+" : "+res);
		
		avg = 0.5;
		
		System.out.println(avg<1 ? 'F' : (char)('E'-(int)avg)+((int)(avg%1+0.5) == 1 ? "+" : ""));
	}

}
