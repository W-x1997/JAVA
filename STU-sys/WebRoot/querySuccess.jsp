<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查询结果</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		*{
			padding: 0;
			font-family: 'Microsoft Yahei';
			margin: 0;
		}
		.main{
			width: 100%;
			height: 100%;
			background-color: #39F;
			position: absolute;
			top: 0;
			left: 0
		}
		.main .querySuccess{
			width: 400px;
			height: 500px;
			text-align: center;
			border-radius: 10px;
			background-color: rgba(255,255,255,0.5);
			margin: -300px 0 0 -200px;
			position: absolute;
			top: 50%;
			left: 50%;
		}
		.main .querySuccess .title{
			width: 400px;
			height: 50px;
			font-size: 24px;
			font-family: 'Microsoft Yahei';
			line-height: 50px;
			text-align: center;
			margin-top: 10px;
		}
		.main .querySuccess .button{
			width: 80px;
			height: 30px;
			padding: 0;
			color: #000;
			font-size: 14px;
			font-family: "Microsoft Yahei";
			line-height: 30px;
			text-decoration: none;
			background-color: #FFF;
			outline: none;
			margin-top: 15px;
			display: inline-block;
			transition: background-color 0.2s linear;
		}
		.main .querySuccess .button:hover{
			background-color: rgba(255,255,255,0.5);
		}
	</style>
  </head>
  
  <body>
  	<div class="main">
    	<div class="querySuccess">
	    	<table border="1" width="400">
		  	<tr>
		  		<th>编号ID</th>
		  		<th>姓名</th>
		  		<th>年龄</th>
		  		<th>专业</th>
		  	</tr>	  
		    <s:iterator value="students" var="l">
		    <input type="hidden" name="id" value="#l.getId()"/>
		   		<tr>
					<td><s:property value="#l.getId()"/></td>
					<td><s:property value="#l.getUsername"/></td>
					<td><s:property value="#l.getAge()"/></td>
					<td><s:property value="#l.getMajor()"/></td>
					
					<td><a href="check.action?id=<s:property value="#l.getId()"/>">修改</a></td>
					<td><a href="delete.action?id=<s:property value="#l.getId()"/>">删除</a></td>
					
				</tr> 		
		    </s:iterator>
		  </table>
    	<a class="button" href="loginSuccess.jsp">返回</a>
    	</div>
    </div>
  </body>
</html>