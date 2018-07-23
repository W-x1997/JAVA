<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib  prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <s:head theme="xhtml" />
<sx:head parseContent="true"/>
  
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
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"61110",secure:"61111"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-0" data-genuitec-path="/Form_2_struts/WebRoot/index.jsp">
  学生基本情况调查统计表
   <s:form action="add_user" method="post" namespace="/">
        <s:textfield name="name" label="姓名" size="15" />
		<s:textfield name="university" label="学校" size="15" />
		<s:textfield name="city" label="城市" size="15" />
		<s:textfield name="age" label="年龄" size="15" />
		<s:radio list="#{'男':'男','女':'女' }" name="sex" label="性别" 	listKey="key" listValue="value" />
		<sx:datetimepicker name="birthday" toggleType = "explode"  toggleDuration="400" label="出生日期" displayFormat="yyyy-mm-dd" />
		<s:textfield name="address" label="宿舍地址" size="15"/>
		<s:submit value="添加用户" align="center" />
   
   
   </s:form>
   
  </body>
</html>
