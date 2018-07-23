<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  </head>
  <body>
    <a href = "<%=request.getContextPath() %>/hql.action">HQL查询</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/recordselect.action">get查询</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/saverecord.action">save保存记录</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/deleterecord.action">delte删除记录</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/updaterecord.action">update删除记录</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/hqlfieldselect.action">HQL字段查询</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/hqlparaselect.action">HQL带参数查询</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/sqlselect.action">SQL查询</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/InputData.jsp">SQL Insert</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/DelData.jsp">SQL Delete</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/updateData.jsp">SQL Update</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/updateData">Query By Criteria, 添加查询准则</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/updateData">Query By Criteria, 添加查询准则，分页显示</a><br/><br/>
    <a href = "<%=request.getContextPath() %>/QBEAddCriteria">Query By Criteria, 添加查询准则，组合条件查询</a><br/><br/>
  </body>
</html>
