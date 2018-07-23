<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table cellpadding="0" cellspacing="0" width="90%" align="center">
<tr style="background=color:#cccccc; height:28px;"> 
<td>用户名</td><td>密码</td><td>真实姓名</td><td>年龄</td><td>性别</td>
</tr>
<tr>
<td><s:property value="username"/> </td>
<td><s:property value="password"/> </td>
<td><s:property value="name"/> </td>
<td><s:property value="age"/> </td>
<td><s:property value="sex"/> </td>
<td><s:date name="birthday" format="yyyy年mm月dd日"/> </td>
<td><s:property value="address"/> </td>
</tr>

</table>
</body>
</html>