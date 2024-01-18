<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	img{
		width: 300px;
		height : 250px;
	}
	.now{
		background-color: yellow;
	}
</style>
<title>Insert title here</title>
</head>
<body>
<h1>Diary</h1>
<%
	Calendar today = Calendar.getInstance();
	String title = new SimpleDateFormat("yyyy년 MM월").format(today.getTime());
	int now = today.get(Calendar.DATE);
	
	
	today.set(Calendar.DATE , 1);
	int first =today.get(Calendar.DAY_OF_WEEK);
	int last = today.getActualMaximum(Calendar.DATE);

%>

<table border="">
	<tr>
		<td colspan="7">
			<img src="../pictures/1.jpg" alt="" />
		</td>
	</tr>
	<tr>
		<td colspan="7">
			<%= title %>
		</td>
	</tr>
	<tr>
	<% for(char ch : "일월화수목금토".toCharArray()) {%>
		<td><%= ch %></td>
	<%} %>
	</tr>
	<tr>
	<% 
	for(int i = 1; i<first;i++){
		out.println("<td></td>");
	}
	
	
	for(int date = 1; date<= last; date++){
		today.set(Calendar.DATE,date);
		if(now == date){
		%>
			<td class="now"><%= date %></td>
		<%}else{%>
			<td><%= date %></td>
		<%}%>
		
		<%if(today.get(Calendar.DAY_OF_WEEK) == 7){%>
			</tr><tr>	
		<%}
	}%> 
	</tr>
	
</table>






</body>
</html>