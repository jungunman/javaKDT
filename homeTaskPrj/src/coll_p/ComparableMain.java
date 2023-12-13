package coll_p;

import java.util.TreeSet;

class TrSawon2 implements Comparable{
	
	String name;
	int jum;
	
	public TrSawon2( String name, int jum) {
		this.name = name;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return name + "\t" + jum;
	}

	@Override
	public int compareTo(Object o) {
		TrSawon2 you = (TrSawon2)o;
		// TODO Auto-generated method stub
		System.out.println(this +" : "+you);
		int res = you.jum - jum;
		
		if(res==0) {
			res = name.compareTo(you.name);
		}
		return res;
	}
}


class TrShape implements Comparable{
	String name;
	int area, border;
	
	@Override
	public int compareTo(Object o) {
		TrShape you = (TrShape)o;
		int res = name.compareTo(you.name);
				
		if(res==0) {
			res = you.area - area;
		}
		if(res==0) {
			res = you.border - border;
		}
		return res;
	}

	public TrShape(String name, int area, int border) {
		this.name = name;
		this.area = area;
		this.border = border;
	}

	@Override
	public String toString() {
		return name + "\t" + area + "\t" + border;
	}
	
	
	
}
public class ComparableMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new TrSawon2("현빈", 42));
		System.out.println("-----------------");
		ts.add(new TrSawon2("원빈", 92));
		System.out.println("-----------------");
		ts.add(new TrSawon2("김우빈", 82));
		System.out.println("-----------------");
		ts.add(new TrSawon2("투빈", 92));
		System.out.println("-----------------");
		ts.add(new TrSawon2("골빈", 82));
		System.out.println("-----------------");
		ts.add(new TrSawon2("커피빈", 72));
		System.out.println("-----------------");
		ts.add(new TrSawon2("젤리빈", 62));
		System.out.println("-----------------");
		ts.add(new TrSawon2("장희빈", 2));
		System.out.println("-----------------");
		ts.add(new TrSawon2("미스터빈", 52));
		System.out.println("-----------------");
		ts.add(new TrSawon2("하얼빈", 82));
		System.out.println("-----------------");
		ts.add(new TrSawon2("텅빈", 62));
		System.out.println("-----------------");
		ts.add(new TrSawon2("자바빈", 32));
		System.out.println("-----------------");
		for (Object ob : ts) {
			System.out.println(ob);
		}
		
		System.out.println("............................");
		
		TreeSet shapes = new TreeSet();
		shapes.add(new TrShape("직사각형", 11, 22));
		shapes.add(new TrShape("직각삼각형", 44, 33));
		shapes.add(new TrShape("원", 66,55 ));
		shapes.add(new TrShape("직사각형", 66, 11));
		shapes.add(new TrShape("직각삼각형", 22, 44));
		shapes.add(new TrShape("원", 44, 33));
		shapes.add(new TrShape("직사각형",44 ,44 ));
		shapes.add(new TrShape("직각삼각형", 22, 66));
		shapes.add(new TrShape("원", 44, 33));
		shapes.add(new TrShape("원", 11,22 ));
		shapes.add(new TrShape("직사각형",22 ,33 ));
		shapes.add(new TrShape("직각삼각형", 66, 55));
		shapes.add(new TrShape("원", 33, 33));
		shapes.add(new TrShape("직사각형", 11, 22));
		
		for (Object sh : shapes) {
			System.out.println(sh);
		}
		
/*
		도형을 생성하고 도형의 정보대로 정렬하여 출력하세요

		도형 정보 : 이름, 넓이, 둘레

		정렬순서 : 이름 >  넓이 > 둘레

		        이름 , 넓이, 둘레 모두 같을 경우 생략
		        */ 
	}

}
