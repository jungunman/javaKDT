<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin:0;
		padding:0;
	}
	html,body{
		width: 1200px;
		margin:0 auto;
	}
	.wrapper{
		display:flex;
		align-items : center;
		justify-content: space-between;
		width:1000px;
		margin-bottom:20px;
	}
	.wrapper>.month{
		border : 3px solid #000;
	}
	
	.wrapper>.month>.show_month>h2{
		text-align: center;
	}
	.wrapper>.month>div>img{
		width:300px;
		height:400px;
		object-fit:cover;
	}
	.wrapper>.month>.day_of_the_week{
		display:flex;
		align-items : center;
		justify-content: space-between;
	}
	.wrapper>.month>.day_of_the_week>p{
		width:41px;
		text-align:center;
		border: 1px solid #000;
	}
	.wrapper>.month>.days>.days_row{
		display:flex;
		align-items : center;
		justify-content: space-between;
	}
	
	.wrapper>.month>.days>.days_row>p{
		width:41px;
		height:20px;
		text-align:center;
		border: 1px solid #000;
	}
	.special{
		background-color: yellow;
	}
	.blue{
		color:blue;
	}
	.red{
		color: red;
	}
	.week_red{
		background-color: red;
		color: #fff;
	}
	.week_blue{
		background-color: blue;
		color: #fff;
	}
</style>
</head>
<body>
<%!
%>
<%
	Date date = new Date();
	int year = 2024-1900;
	date.setYear(year);
	Map<String,String> specialDay = new HashMap<>();
	specialDay.put("2023년 04월 06일", "special");
	specialDay.put("2023년 04월 30일", "special");
	specialDay.put("2024년 05월 26일", "special");
	specialDay.put("2024년 05월 30일", "special");
	specialDay.put("2024년 06월 06일", "special");
	specialDay.put("2023년 08월 13일", "special");
	specialDay.put("2023년 08월 29일", "special");
	specialDay.put("2024년 12월 29일", "special");
%>

	<%for(int row = 1; row <=12; row=row+3){ %>
		<div class="wrapper">
		<% for(int col = row; col < row+3; col++){
			date.setMonth(col);
			date.setDate(0);
			int last = date.getDate();
			int lastday = date.getDay();
			date.setDate(1);
			int first = date.getDay();
			%>
			<div class="month">
				<div>
					<img src="../pictures/<%=col%>.jpg" alt="" />
				</div>
				<div class="show_month">
					<h2><%= new SimpleDateFormat("yyyy년 MM월").format(date)%></h2>
				</div>
				<div class="day_of_the_week">
					<%for(char ch : "일월화수목금토".toCharArray()){
						String weekend = "";
						if(ch == '일'){
							weekend ="week_red";
						}else if(ch == '토'){
							weekend ="week_blue";
						}
					%>
						<p class=<%=weekend%>><%=ch%></p>
					<%}%>
				</div>
				<div class="days">
					<div class="days_row">
	
						<%for(int temp = 1; temp<=first;temp++){ %>
							<p></p>		
						<%}%>
						<%for(int day = 1; day <=last; day++){							
							date.setDate(day);
							String weekend = specialDay.get( new SimpleDateFormat("yyyy년 MM월 dd일").format(date) ) ==null ? "" : specialDay.get( new SimpleDateFormat("yyyy년 MM월 dd일").format(date) ) + " ";
							System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일").format(date));
							if(date.getDay()== 6){
								weekend += "blue";
							}else if(date.getDay()== 0){
								weekend += "red";
							}
						%>
						
							<p class=<%=weekend%>><%=date.getDate()%></p>
							<%if(date.getDay() == 6) {%>
								</div><div class="days_row">
							<%} %>
						<%}
						for(int temp = lastday; temp<6;temp++){ %>
							<p></p>
						<%}%>
					</div>
				</div>
			</div>	
		<%}%>
		</div>
	<%}%>
		
	
	
</body>
</html>