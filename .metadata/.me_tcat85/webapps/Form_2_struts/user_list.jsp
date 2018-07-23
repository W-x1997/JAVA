<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"61110",secure:"61111"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/Form_2_struts/WebRoot/user_list.jsp">
    <table cellpadding="0" cellspacing="0" width="90%" align="center" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/Form_2_struts/WebRoot/user_list.jsp">
<tr style="background=color:#cccccc; height:28px;"> 
<td>学生姓名</td><td>学校</td><td>所在城市</td><td>年龄</td><td>性别</td><td>宿舍地址</td>
</tr>
<tr>
<td><s:property value="name"/> </td>
<td><s:property value="university"/> </td>
<td><s:property value="city"/> </td>
<td><s:property value="age"/> </td>
<td><s:property value="sex"/> </td>
<td><s:date name="birthday" format="yyyy年mm月dd日"/> </td>
<td><s:property value="address"/> </td>
</tr>

</table>
  </body>
</html>
