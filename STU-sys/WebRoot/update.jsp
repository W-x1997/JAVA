<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改学生信息</title>
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
		.main .check{
			width: 400px;
			height: 300px;
			border-radius: 10px;
			background-color: rgba(255,255,255,0.5);
			margin: -125px 0 0 -200px;
			position: absolute;
			top: 50%;
			left: 50%;
		}
		.main .check .title{
			width: 400px;
			height: 50px;
			font-size: 24px;
			font-family: 'Microsoft Yahei';
			line-height: 50px;
			text-align: center;
			margin-top: 10px;
		}
		.main .check form{
			width: 250px;
			margin: 15px auto;
			text-align: center;
		}
		.main .check form label{
			width: 80px;
			height: 30px;
			margin: 5px 0;
			font-size: 14px;
			font-family: 'Microsoft Yahei';
			display: inline-block;
		}
		.main .check form input{
			width: 150px;
			height: 30px;
			padding-left: 10px;
			font-size: 14px;
			outline: none;
			border: #AAA 1px solid;
			transition: border 0.2s linear;
		}
		.main .check form input:hover,
		.main .check form input:focus{
			border: #39F 1px solid;
		}
		.main .check form .button{
			width: 80px;
			height: 30px;
			padding: 0;
			font-size: 14px;
			font-family: "Microsoft Yahei";
			line-height: 30px;
			background-color: #FFF;
			outline: none;
			margin-top: 15px;
			transition: background-color 0.2s linear;
		}
		.main .check form .button:hover{
			background-color: rgba(255,255,255,0.5);
		}
	</style>
  </head>
  
  <body>
    <div class="main">
    	<div class="check">
    		<div class="title">修改学生信息</div>
    		<form action="update.action" method="post">
    		<label> 姓 名 ：</label>
    		<input type="text" name="username" value="${username}"/>
    		<label>年龄</label>
    		<input type="text" name="age" value="${age}"/>
    		<label>专业：</label>
    		<input type="text" name="major" value="${major}"/>
    		
    		<input type="hidden" name="id" value="${id}"/>
    		<input class="button" type="submit" value="修改"/>
    		<input class="button" type="reset" value="重置"/>
    	</form>
    	</div>
    </div>
  </body>
</html>