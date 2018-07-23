<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息系统系统</title>
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
		.main .operate{
			width: 400px;
			height: 200px;
			border-radius: 10px;
			background-color: rgba(255,255,255,0.5);
			margin: -125px 0 0 -200px;
			position: absolute;
			top: 50%;
			left: 50%;
		}
		.main .operate .title{
			width: 400px;
			height: 50px;
			font-size: 24px;
			font-family: 'Microsoft Yahei';
			line-height: 50px;
			text-align: center;
			margin-top: 10px;
		}
		.main .operate a{
			width: 120px;
			height: 30px;
			padding: 0;
			color: #000;
			font-size: 14px;
			font-family: "Microsoft Yahei";
			line-height: 30px;
			text-align: center;
			text-decoration: none;
			background-color: #FFF;
			outline: none;
			margin: 10px auto;
			display: block;
			transition: background-color 0.2s linear;
		}
		.main .operate a:hover{
			background-color: rgba(255,255,255,0.5);
		}
	</style>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"61110",secure:"61111"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-3" data-genuitec-path="/STU-sys/WebRoot/loginSuccess.jsp">
  		<div class="main" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc2-3" data-genuitec-path="/STU-sys/WebRoot/loginSuccess.jsp">
  			<div class="operate">
  				<div class="title">学生信息管理系统</div>
			    <a href="add_stu.jsp">增加学生</a>
			    <a href="query_stu.jsp">学生查询</a>
			    <a href="static_stu.jsp">学生统计</a>
			</div>
		</div>
  </body>
</html>
