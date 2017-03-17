<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

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
    <a href = "${pageContext.request.contextPath }/category_update.action">访问update</a>
    <a href = "${pageContext.request.contextPath }/category_update.action?id=2&typed=child&hot=false">访问update2</a>

	<a href = "category_query.action">查询所有类别</a>
 	<br/>
 	<c:forEach items= "${requestScope.categorylist}" var = "category">
 		${category.id}|${category.typed}|${category.hot}<br/>
 	</c:forEach>
 	<br/>
 	<c:forEach items= "${sessionScope.categorylist}" var = "category">
 		${category.id}|${category.typed}|${category.hot}<br/>
 	</c:forEach>
 	<br/>
 	<c:forEach items= "${applicationScope.categorylist}" var = "category">
 		${category.id}|${category.typed}|${category.hot}<br/>
 	</c:forEach>
  </body>
</html>
