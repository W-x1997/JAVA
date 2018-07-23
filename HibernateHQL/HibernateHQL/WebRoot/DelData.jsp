<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  </head>
  <body>
  	<h3>删除员工数据</h3>
	<s:form action="sqldelete" method="post" namespace="/">
		<s:textfield name="delid"  label="删除序号"  size="15"/><br/>		
		<s:submit value="删除" align="left"/>
		<s:reset value="置空 " align="right"/>
	</s:form>
  </body>
</html>
