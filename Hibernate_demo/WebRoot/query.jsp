<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
  
	<title>登录</title>
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
		.main .login{
			width: 400px;
			height: 250px;
			border-radius: 10px;
			background-color: rgba(255,255,255,0.5);
			margin: -125px 0 0 -200px;
			position: absolute;
			top: 50%;
			left: 50%;
		}
		.main .login .title{
			width: 400px;
			height: 50px;
			font-size: 24px;
			font-family: 'Microsoft Yahei';
			line-height: 50px;
			text-align: center;
			margin-top: 10px;
		}
		.main .login form{
			width: 250px;
			margin: 25px auto;
			text-align: center;
		}
		.main .login form label{
			width: 50px;
			height: 30px;
			margin: 5px 0;
			font-size: 14px;
			font-family: 'Microsoft Yahei';
			display: inline-block;
		}
		.main .login form input{
			width: 180px;
			height: 30px;
			padding-left: 10px;
			font-size: 14px;
			outline: none;
			border: #AAA 1px solid;
			transition: border 0.2s linear;
		}
		.main .login form input:hover,
		.main .login form input:focus{
			border: #39F 1px solid;
		}
		.main .login form .button{
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
		.main .login form .button:hover{
			background-color: rgba(255,255,255,0.5);
		}
		
	</style>
  </head>
  
  <body>
    <div class="main">
    	<div class="login">
	    	<div class="queryaction">数据录入界面</div>
	    	<form action="query" method="post">
	    		<label>查询的ID：</label>
	    		<input type="text" name="id" />
	    		<input class="button" type="submit" value="查询"/>
	    	</form>
    	</div>
    </div>
    
  
  </body>
 
  
  
   
  
</html>
