package dynamic_p;

interface InEx1{
	void meth_1();
	void meth_2();
}
interface InEx2{
	void meth_3();
	void meth_2();
}
interface InEx3{
	void meth_4();
}

//interface InExAll implements InEx3{
interface InExAll extends InEx1, InEx2, InEx3{	
}



class Inex1Impl implements InEx1{

	public void meth_1() {
		System.out.println("Inex1Impl.meth_1() 실행");
	}

	public void meth_2() {
		System.out.println("Inex1Impl.meth_2() 실행");
	}
}


class Inex2Impl extends Inex1Impl{

	public void meth_3() {
		System.out.println("Inex2Impl.meth_3() 실행");
	}
}


//class InExAllImpl implements InExAll  extends Inex1Impl {
//상속과 구현을 같이 할 경우
//class 자식구현클래스명 extends 부모클래스명 implements 인터페이스1,인터페이스2,...
//class InExAllImpl extends Inex1Impl,Inex2Impl implements InExAll {
class InExAllImpl extends Inex2Impl implements InExAll {

	@Override
	public void meth_4() {
		System.out.println("InExAllImpl.meth_4() 실행");
	}	
}



public class InterExtendsMain {

	public static void main(String[] args) {
		InExAllImpl ieai = new InExAllImpl();
		//인터페이스 <= 인스턴스
		InExAll iea = ieai;
		InEx1 ie1 = ieai;
		InEx2 ie2 = ieai;
		InEx3 ie3 = ieai;
		System.out.println("InExAll >>>>>>>>");
		iea.meth_1();
		iea.meth_2();
		iea.meth_3();
		iea.meth_4();
		System.out.println("InEx1 >>>>>>>>");
		ie1.meth_1();
		ie1.meth_2();
		//ie1.meth_3();
		//ie1.meth_4();
		System.out.println("InEx2 >>>>>>>>");
		//ie2.meth_1();
		ie2.meth_2();
		ie2.meth_3();
		//ie2.meth_4();
		System.out.println("InEx3 >>>>>>>>");
		//ie3.meth_1();
		//ie3.meth_2();
		//ie3.meth_3();
		ie3.meth_4();
		
		//클래스 <= 인스턴스
		Inex1Impl ie1i = ieai;
		Inex2Impl ie2i = ieai;
		System.out.println("Inex1Impl >>>>>>>>");
		ie1i.meth_1();
		ie1i.meth_2();
		//ie1i.meth_3();
		//ie1i.meth_4();
		System.out.println("Inex2Impl >>>>>>>>");
		ie2i.meth_1();
		ie2i.meth_2();
		ie2i.meth_3();
		//ie2i.meth_4();
		
		ie1 = ie1i;
		//ie2 = ie2i;
		ie1 = ie2i;
		
		ie1 = ieai;
		ie2 = ieai;
	}

}
