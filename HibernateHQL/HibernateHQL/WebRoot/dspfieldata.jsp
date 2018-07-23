<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  </head>
  <body>
   HQL 查询结果显示<br>
   <table align="center">
   <tr><td>序号</td> <td>姓名</td> <td>地址</td> <td> 电话</td></tr>
    <s:iterator value="fieldObject" id="lso" status="st">
   <tr>
   <td><s:property value="#lso(#st.index)"/> </td>
   <td><s:property value="#lso(#st.index)"/> </td>
   <td><s:property value="#lso(#st.index)"/> </td>
   <td><s:property value="#lso(#st.index)"/> </td>
   </tr>
   </s:iterator>
   </table>
  </body>
</html>
