<%@ page import="java.util.*" %>
<%
String name = request.getParameter("uname");

session.setAttribute("user",name);
session.setAttribute("start", System.currentTimeMillis());
long start = (Long) session.getAttribute("start");
%>

<html>
<body>
<p align="right">Start: <%= new Date(start)%><p>
<form action="Logout.jsp">
<input type="submit" value="Logout"/>
</form>
</body>
</html>