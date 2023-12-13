package lang_p;

public class MathMain {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println("ceil -----------------");
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(987.654));
		System.out.println(Math.ceil(-987.654));
		System.out.println("floor -----------------");
		System.out.println(Math.floor(123.456));
		System.out.println(Math.floor(-123.456));
		System.out.println(Math.floor(987.654));
		System.out.println(Math.floor(-987.654));
		System.out.println("round -----------------");
		System.out.println(Math.round(123.456));
		System.out.println(Math.round(-123.456));
		System.out.println(Math.round(987.654));
		System.out.println(Math.round(-987.654));
		System.out.println("abs -----------------");
		System.out.println(Math.abs(123.456));
		System.out.println(Math.abs(-123.456));
		System.out.println("max , min-----------------");
		System.out.println(Math.max(10,30));
		System.out.println(Math.min(10,30));
		System.out.println("sin , cos , tan-----------------");
		System.out.println(Math.sin(30));
		System.out.println(Math.sin(30*Math.PI/180));
		System.out.println(Math.cos(30*Math.PI/180));
		System.out.println(Math.tan(30*Math.PI/180));
		System.out.println("exp , log, pow , sqrt-----------------");
		System.out.println(Math.exp(1));
		System.out.println(Math.log(10));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(2));
		System.out.println("random -----------------");
		// 0 < x < 1
		System.out.println(Math.random());
		System.out.println(Math.random());
	}

}
