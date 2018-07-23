<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  </head>
  <body>
  	<h3>增加员工数据</h3>
	<s:form action="sqlinsert" method="post" namespace="/">
		<s:textfield name="inObject.id"  label="序号"  size="15"/><br/>
		<s:textfield name="inObject.name"  label="姓名"  size="15"/><br/>
		<s:textfield name="inObject.address"  label="地址"  size="15"/><br/>
		<s:textfield name="inObject.phone"  label="电话"  size="15"/><br/>
		<s:submit value="添加" align="left"/><br/>
		<s:reset value="置空 " align="right"/>
	</s:form>
  </body>
</html>
