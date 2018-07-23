<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   
   <s:form action="register" method="post">
   <s:bean name="actions.BirthAction" id="ba"></s:bean>
   <s:textfield name="user.username" label="User Name:"></s:textfield>
   <s:property value="errors.user.username" />
   <s:password name="user.password" label="Password:"> </s:password>
 	<s:password name="user.password1" label="Retype passwd:"></s:password>
 	<s:select list="#ba.birthyearmap" name="user.birthday" label="Birthyear" headValue="Actual " headerKey="1950" />
 	<s:reset value="reset" align="left"></s:reset>
 	<s:submit value="register" align="left"></s:submit>
   
   </s:form>
  
   
  </body>
</html>
