# Java Viva Q&A

## Program 10 - JDBC

**Q: What is JDBC?**
A: Java Database Connectivity - an API to connect Java applications to databases.

**Q: Difference between Statement and PreparedStatement?**
A: Statement executes static SQL. PreparedStatement uses precompiled SQL with placeholders (`?`), is faster for repeated queries, and prevents SQL injection.

**Q: Explain the connection URL `jdbc:mysql://localhost:3306/lab`**
A: `jdbc:mysql` = protocol, `localhost` = server, `3306` = MySQL port, `lab` = database name.

**Q: What is SQL injection?**
A: A hack where malicious SQL is inserted through user input. PreparedStatement prevents it by treating input as data, not code.

**Q: What does `?` placeholder do?**
A: It marks where values will be inserted safely using `setInt()`, `setString()`, etc.

**Q: Difference between executeUpdate() and executeQuery()?**
A: `executeUpdate()` → for INSERT/UPDATE/DELETE, returns row count. `executeQuery()` → for SELECT, returns ResultSet.

**Q: What is ResultSet?**
A: An object that holds data returned from a SELECT query. By default, it's forward-only (can't move backwards).

---

## Program 11 - Servlet

**Q: What is a Servlet?**
A: A Java class that handles HTTP requests and generates responses on a web server.

**Q: Servlet lifecycle?**
A: `init()` → called once when servlet loads. `service()` → called for each request. `destroy()` → called when servlet is unloaded.

**Q: What does @WebServlet("/check") do?**
A: Maps the servlet to the URL `/check` without needing web.xml configuration.

**Q: Difference between doGet(), doPost(), service()?**
A: `doGet()` handles GET requests, `doPost()` handles POST requests. `service()` handles all HTTP methods.

**Q: Difference between GET and POST?**
A: GET → data in URL, limited size, bookmarkable. POST → data in body, larger size, more secure for sensitive data.

**Q: What is HttpServletRequest and HttpServletResponse?**
A: Request = contains client data (parameters, headers). Response = used to send data back to client.

**Q: What does getParameter() return if parameter doesn't exist?**
A: Returns `null`.

**Q: What is a servlet container?**
A: Software that manages servlets. Examples: Apache Tomcat, Jetty, GlassFish.

**Q: Difference between PrintWriter and ServletOutputStream?**
A: PrintWriter → for text/character data. ServletOutputStream → for binary data (images, files).

---

## Program 12 - JSP Session

**Q: What is JSP?**
A: JavaServer Pages - HTML with embedded Java code. Gets converted to a servlet by the server.

**Q: JSP lifecycle?**
A: Translation (JSP → Servlet) → Compilation → Loading → Initialization → Request handling → Destroy.

**Q: What is a session?**
A: Server-side storage to maintain user data across multiple requests. Identified by session ID (usually stored in cookie).

**Q: What does session.setAttribute() and getAttribute() do?**
A: `setAttribute("key", value)` stores data. `getAttribute("key")` retrieves data.

**Q: What does session.invalidate() do?**
A: Destroys the session and all its attributes. Cannot access attributes after this.

**Q: Difference between `<%= %>` and `<% %>`?**
A: `<%= %>` = expression, outputs value directly. `<% %>` = scriptlet, executes Java code without output.

**Q: Why cast getAttribute() return value?**
A: Because it returns `Object` type, must cast to actual type like `(String)` or `(Long)`.

**Q: JSP scopes?**
A: `page` (current page), `request` (single request), `session` (user session), `application` (entire app).

**Q: Difference between invalidate() and removeAttribute()?**
A: `invalidate()` destroys entire session. `removeAttribute()` removes only one attribute.

**Q: Implicit objects in JSP?**
A: request, response, session, out, application, config, pageContext, page, exception.

**Q: Difference between forward and redirect?**
A: Forward → server-side, URL doesn't change, faster. Redirect → client-side, URL changes, new request.

---

## General Questions

**Q: Servlets vs JSP?**
A: Servlets = Java code with HTML (good for logic). JSP = HTML with Java (good for presentation).

**Q: What is MVC?**
A: Model-View-Controller. Model = data/JDBC, View = JSP, Controller = Servlet.
