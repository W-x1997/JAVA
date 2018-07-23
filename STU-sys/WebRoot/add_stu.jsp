<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加会员</title>
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
		.main .add{
			width: 400px;
			height: 300px;
			border-radius: 10px;
			background-color: rgba(255,255,255,0.5);
			margin: -125px 0 0 -200px;
			position: absolute;
			top: 50%;
			left: 50%;
		}
		.main .add .title{
			width: 400px;
			height: 50px;
			font-size: 24px;
			font-family: 'Microsoft Yahei';
			line-height: 50px;
			text-align: center;
			margin-top: 10px;
		}
		.main .add form{
			width: 250px;
			line-height: 20px;
			margin: 15px auto;
			text-align: center;
		}
		.main .add form span{
			width: 80px;
			height: 30px;
			margin: 5px 0;
			font-size: 16px;
			font-family: 'Microsoft Yahei';
			display: inline-block;
		}
		.main .add form input{
			width: 150px;
			height: 30px;
			padding-left: 10px;
			font-size: 14px;
			outline: none;
			border: #AAA 1px solid;
			transition: border 0.2s linear;
		}
		.main .add form input:hover,
		.main .add form input:focus{
			border: #39F 1px solid;
		}
		.main .add .radio{
			width: 18px;
			height: 18px;
			display: inline-block;
		}
		.main .add form label{
			font-size: 16px;
			margin-right: 5px;
		}
		.main .add form .button{
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
		.main .add form .button:hover{
			background-color: rgba(255,255,255,0.5);
		}
	</style>
  </head>
  
  <body>
    <div class="main">
    	<div class="add">
    		<div class="title">增加学生</div>
    		<form action="add.action" method="post">
    		<span> NO.：</span>
    		<input type="text" name="id"/>
    		<span> 姓 名 ：</span>
    		<input type="text" name="username"/>
    		<span> 年龄：</span>
    		<input type="text" name="age"/>
    		<span> 专业：</span>
    		<input type="text" name="major"/>
    		<input class="button" type="submit" value="确定"/>
    		<input class="button" type="reset" value="重置"/>
    	</form>
    	</div>
    </div>
  </body>
</html>
