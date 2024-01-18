<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>너무 쉬운 JSP</title>
</head>
<body>
<h1>lifeCycle</h1>
<%! //Declaration ==> 클래스 정의부
	String pname = "나는 킹"; //멤버 변수
	int age = 29; //멤버 변수 , 			jsp 최초 페이지 요청 시에 초기화
	boolean marrige = true; //멤버 변수	이후 페이지 요청시에 변수값으로 처리
	
	class InnerClass {
		InnerClass(){
			System.out.println("나는 이너클래스 생성자");
		}
	}
	
	public void showPrint(String msg){
		System.out.println(msg);
	}
	void meth_1(){
		System.out.println("meth_1() 실행");
	}
	
	public void jspInit(){ //최소 페이지 요청 시 1회 실행
		System.out.println("jspInit() 실행");		
	}
	public void jspDestroy(){ //페이지 소스코드 변경 시 실행;
		System.out.println("jspDestroy() 실행");		
	}
	public void jspService(){ //jsp 에서는 Service 개념만 있을 뿐 진짜 있는 것은 아님.  overriding 안함
								//jspService() ==> srciptlet 구간의로 재정의 됨.
		System.out.println("jspService() 실행");		
	}
	
	//클래스(정의부)니까 당연히 실행 구문 안됨!
	//System.out.println("출력가능?");
%>

<%
	int cnt = 0;
	int age = 11;
	//Scriptlet ==> _jspService() 구간 : 페이지 요청시 호출,
	
	System.out.println("=============   =====================");
	System.out.println("scriptlet 입니다. "+pname+","+this.age+","+marrige);
	System.out.println("난 scriptlet 지역 : "+cnt);
	this.age++; //누적증가
	cnt++;
	InnerClass inner = new InnerClass();
	meth_1();
	showPrint("jsp-declaration에서 메소드 생성 후에 실행~~");
	out.println("out으로 출력 </br>"); //내장객체는 Scriptlet에서만 가능
	
	
	
	
	/*
	public void meth_2(){
		System.out.println("메소드 안에 메소드는 생성 불가하니까~ 이건 jspService() 메소드라구~");
	}
	*/
%>

<p><%= pname %></p>
<p><%= this.age %></p>
<p><%= marrige %></p>
<p><%= cnt %></p>
<p><%= age %></p>


<%!	//분리하여 작업가능
	int [] arr = {11,22,33};
%>

<%	//분리하여 작업가능
	for(int i = 0; i<arr.length; i++){
		out.println(i + " : " + arr[i] +"</br>");
	}
%>

<hr/>

<%for(int i = 0; i<arr.length; i++){ %>
		<div><p><%=i%> : <%=arr[i] %><p></div>
<%}%>

</body>
</html>