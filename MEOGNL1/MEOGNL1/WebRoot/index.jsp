<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib  prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head theme="xhtml" />
<sx:head parseContent="true"/>
<body>
	<s:form action="adduser" method="post" namespace="/">
		<s:textfield name="username" label="用户名" size="15" />
		<s:password name="password" label="密码" size="15" />
		<s:textfield name="name" label="真实姓名" size="15" />
		<s:textfield name="age" label="年龄" size="15" />
		<s:radio list="#{'男':'男','女':'女' }" name="sex" label="性别" 	listKey="key" listValue="value" />
		<sx:datetimepicker name="birthday" toggleType = "explode"  toggleDuration="400" label="出生日期" displayFormat="yyyy-mm-dd" />
		<s:textfield name="address" label="家庭地址" size="15"/>
		<s:submit value="添加用户" align="center" />
	</s:form>
</body>
</html>
