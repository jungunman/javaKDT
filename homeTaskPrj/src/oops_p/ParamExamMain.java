package oops_p;

import java.util.Arrays;

class ParamStud{
	String name;
	int [] jum;
	int tot, avg;
	
	void init(String name, int kor, int eng, int mat) {
		this.name = name;
		jum = new int[] {kor, eng, mat};
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
	void ppp() {
		System.out.println(name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
}

class ParamShape{
	
	String name;
	double area, border;
	
	void circle(int arrqwe) {
		name = "원";
		double PI = 3.141592;
		area = arrqwe * arrqwe * PI;
		border = arrqwe * 2 * PI;
		//System.out.println("원");
	}
	
	void rectangle(int [] arr) {
		name = "직사각형";
		area = arr[0] * arr[1];
		border = (arr[0] + arr[1]) * 2;
		//System.out.println("직사각형");
	}
	
	void triAngle(int [] arr) {
		name = "직각삼각형";
		area = arr[0] * arr[1] / 2;
		border = arr[0] + arr[1]+ arr[2];
		//System.out.println("직각삼각형");
	}
	
	void qwer() {
		System.out.println(name+" : "+area+" , "+border);
	}
	
}

public class ParamExamMain {

	public static void main(String[] args) {
		ParamStud st = new ParamStud();
		st.init("장동건", 78, 79, 71);
		st.calc();
		st.ppp();
		
		System.out.println("------------------------------");
		
		
		String [] names = {
				"현빈","원빈","장희빈","커피빈","미스터빈"
		};
		int [][] arr = {
				{79,71,74},	
				{69,61,64},
				{89,81,84},
				{99,91,94},
				{59,51,54}
		};
		
		ParamStud [] studs = new ParamStud[names.length];
		for (int i = 0; i < studs.length; i++) {
			
			studs[i] = new ParamStud();
			studs[i].init(names[i], arr[i][0], arr[i][1], arr[i][2]);
			studs[i].calc();
			studs[i].ppp();
		}
		
		System.out.println("------------------------------");
		
		//도형 클래스를 완성하세요
		// 멤버변수 : 도형 이름, 넓이, 둘레
		/// 사각형메소드, 원메소드, 직각삼각형메소드, 
		///  출력메소드 - 도형 이름, 넓이, 둘레
		
		
		
		
		
		int [][] lines = {
				{5},
				{5,6, 8},
				{5,6},
				{10,20},
				{8},
				{15,10,22}
				};
		
		ParamShape[] shapes = new ParamShape[lines.length];
		
		System.out.println(lines.length);
		for (int i = 0; i < shapes.length; i++) {
			int [] line = lines[i];
			
			ParamShape shape = new ParamShape();
			shapes[i] = shape;
			
			//System.out.println(Arrays.toString(line));
		
			switch(line.length) {
			case 1:
				shape.circle(line[0]);
				break;
			case 2:
				shape.rectangle(line);
				break;
			case 3:
				shape.triAngle(line);
				break;
			}
			
			
		}
		
		
		for (ParamShape sh : shapes) {
			sh.qwer();
		}
		
		

	}

}
