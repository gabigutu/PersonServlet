<%@ page import="com.gabigutu.person.Person" %>
<%--
  Created by IntelliJ IDEA.
  User: gabigutu
  Date: 14/12/2020
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Something page</title>
</head>
<body>

This is a JSP file.

<%
    Person person = (Person) request.getAttribute("person");
%>

I received the name <%=person.getName()%> with age <%=person.getAge()%>

</body>
</html>
