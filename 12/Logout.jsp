<%@ page import="java.util.*" %>
<%
String name = (String) session.getAttribute("user");
long start = (Long) session.getAttribute("start");
long duration = (System.currentTimeMillis() - start) / 1000;
session.invalidate();
%>

<html>
<body>
<h2>Thank You <%= name %></h2>
Session Duration: <%= duration %> seconds
</body>
</html>
