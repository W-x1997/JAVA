<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    

 <base href="<%=basePath%>">
    
    <title> 查询</title>
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
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"61110",secure:"61111"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-5" data-genuitec-path="/STU-sys/WebRoot/query_stu.jsp">
    <div class="main" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-5" data-genuitec-path="/STU-sys/WebRoot/query_stu.jsp">
    	<div class="login">
	    	<div class="title">查询</div>
	    	<form action="query.action" method="post">
	    		<label>ID</label>
	    		<input type="text" name="id"/>
	    		<label>姓名</label>
	    		<input type="text" name="username" />
	    		<label>专业</label>
	    		<input type="text" name="major" />
	    		<input class="button" type="submit" value="查询"/>
	    		<input class="button" type="reset" value="重置"/>
	    	</form>
    	 </div>
     </div>
  </body>
</html>
