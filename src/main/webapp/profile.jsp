<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <c:if test="${adminView}">
        <div>This is for administrators only.</div>
        <p>Hypothetical administrator stuff!</p>
    </c:if>

    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

</body>
</html>
