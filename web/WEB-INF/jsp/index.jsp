<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Hibernate project</title>
    </head>

    <body>
        <h1>User Information System</h1>
        <table border="1">
            <tr>
                <th>id</th>
                <th>Name</th>
                <th>Address</th>
                <th>Contact No</th>
                <th>Email Address</th>
            </tr>
            <c:forEach var="lst" items="${lst}">
                <tr>
                    <td>${lst.id}</td>
                    <td>${lst.name}</td>
                    <td>${lst.address}</td>
                    <td>${lst.contactno}</td>
                    <td>${lst.emailaddress}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
