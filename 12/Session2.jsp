<%@ page import="java.util.*" %>
<%
String name = request.getParameter("uname");
if (name != null) {
    session.setAttribute("user", name);
    session.setAttribute("start", System.currentTimeMillis());
}
name = (String) session.getAttribute("user");
long start = (Long) session.getAttribute("start");
%>

<html>
<body>
<p align="right">Start: <%= new Date(start) %></p>

<h2>Hello <%= name %></h2>

<form action="Logout.jsp">
    <input type="submit" value="Logout">
</form>
</body>
</html>
