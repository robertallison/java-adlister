<%--
  Created by IntelliJ IDEA.
  User: robertallison
  Date: 11/30/21
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%! int counter = 0; double two = 2.523; %>

<% counter += 1;
request.setAttribute("NumberOfVisits", counter); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"></jsp:include>
<h1>The current count is ${NumberOfVisits}</h1>
</body>
</html>
