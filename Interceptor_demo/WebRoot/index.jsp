<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
————————用户登录界面———————————— 
	<s:property value="#session.errorMsg" />
	<s:form action="login" class="org.struts.wx.actions.LoginAction" method="post" namespace="/">
		<s:textfield name="username" label="用户名" size="20" />
		<s:textfield name="name" label="真实姓名" size="20" />
		<s:password name="password" label="密码" size="20" />

	<s:submit value="登  录" />
	</s:form>
</body>
</html>
