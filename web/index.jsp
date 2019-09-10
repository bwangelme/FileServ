<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.model.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Counter</title>
</head>
<body>

    <%@ include file="header.jsp"%>
    <%= headName %>

    <p>
        访问次数:
        <code>
            <%= Counter.getCount() %>
        </code>
    </p>

    <jsp:include page="footer.jsp" />
    <%--<%= footName %>--%>

</body>
</html>