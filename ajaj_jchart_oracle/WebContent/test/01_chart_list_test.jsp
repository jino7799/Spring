<%@page import="com.test.chart.ChartVO"%>
<%@page import="com.test.chart.ChartDAO"%>
<%@page import="com.google.gson.GsonBuilder"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head><body>
<%
ChartDAO dao = new ChartDAO();
List<ChartVO> datas	   =	dao.getData();
Gson gson = new Gson();
String json = gson.toJson(datas);

%>

<%= json%> 

</body></html>