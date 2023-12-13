package lang_p;

class AAA{
	int a;

	public AAA(int a) {
		super();
		this.a = a;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//return true;
		//return a = obj.a;
		AAA you = (AAA)obj;
		return a == you.a;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "너무하고싶었어요";
		return "AAA : "+a;
	}
}

public class ObjectMain {

	public static void main(String[] args) {
		AAA a1 = new AAA(10);
		AAA a2 = new AAA(20);
		AAA a3 = a1;
		AAA a4 = new AAA(10);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println("toString() >>>>>>>> ");
		System.out.println(a1.toString());
		
		System.out.println(a1.getClass());
		System.out.println(a1.getClass().getName());
		System.out.println(a1.hashCode());
		System.out.println(Integer.toHexString(1865127310));
		
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(" == >>>>>>>> ");
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println(a1 == a4);
		System.out.println("equals() >>>>>>>> ");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		
	}

}
