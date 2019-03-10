<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- https://www.runoob.com/jsp/jsp-life-cycle.html --%>

<%!
    private int initVar = 0;
    private int serviceVar = 0;
    private int destroyVar = 0;
%>

<%!
    public void jspInit() {
        initVar++;
        System.out.println("jspInit(): JSP is initialized " + initVar + " times");
    }
    public void jspDestroy() {
        destroyVar++;
        System.out.println("jspDestroy(): JSP is destroyed " + initVar + " times");
    }
%>

<%
    serviceVar++;
    System.out.println("_jspService(): JSP responds " + serviceVar + " times");

    String content1 = "init times: " + initVar;
    String content2 = "response times: " + serviceVar;
    String content3 = "destroy times: " + destroyVar;
%>

<p><%= content1 %></p>
<p><%= content2 %></p>
<p><%= content3 %></p>

</body>
</html>
