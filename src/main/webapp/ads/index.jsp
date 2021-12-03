<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: robertallison
  Date: 12/3/21
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Current Advertisements</title>
</head>
<body>

<c:forEach items="${allAds}" var="ad">
    <div>${ad.getTitle()}</div>
    <p>${ad.getDescription()}</p>
    <br>

</c:forEach>
</body>
</html>
