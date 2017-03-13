<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <a href = "category_save.action" >访问save</a>
    <a href = "${pageContext.request.contextPath }/category_update.action?category.id=2&category.typed=child&category.hot=false">访问update</a>
  </body>
</html>
