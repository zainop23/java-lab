# Java Viva Q&A

---

## Program 1 - Quadratic Equation, Array Multiplication & Bubble Sort

**Q: What is a quadratic equation?**
A: A polynomial equation of degree 2: ax² + bx + c = 0, where a ≠ 0.

**Q: What is the discriminant formula?**
A: d = b² - 4ac. Determines nature of roots.

**Q: What does the discriminant tell us?**
A: d > 0: Two distinct real roots. d = 0: Two equal roots. d < 0: Two complex roots.

**Q: What is bubble sort?**
A: A sorting algorithm that repeatedly compares adjacent elements and swaps them if in wrong order.

**Q: Time complexity of bubble sort?**
A: Best: O(n), Average: O(n²), Worst: O(n²).

**Q: Space complexity of bubble sort?**
A: O(1) - it's an in-place sorting algorithm.

**Q: Is bubble sort stable?**
A: Yes, it doesn't change relative order of equal elements.

**Q: How to optimize bubble sort?**
A: Add a flag to check if any swap occurred. If no swap, array is sorted - break early.

---

## Program 2 - Employee Database

**Q: What is an array of objects?**
A: An array where each element is an object of a class.

**Q: What is a class?**
A: A blueprint that defines attributes (variables) and behavior (methods) of objects.

**Q: What is a constructor?**
A: A special method to initialize objects. Same name as class, no return type.

**Q: Difference between nextLine() and nextDouble()?**
A: nextDouble() reads only the number, leaves newline. nextLine() reads entire line including spaces.

**Q: What is equalsIgnoreCase()?**
A: Compares two strings ignoring case differences.

**Q: Why check for null before displaying highest-paid manager?**
A: To avoid NullPointerException when no matching employee exists.

---

## Program 3 - Complex Numbers

**Q: What is a complex number?**
A: A number in form a + bi, where a = real part, b = imaginary part (i = √-1).

**Q: What is encapsulation?**
A: Wrapping data and methods together, hiding internal details, providing controlled access.

**Q: What is 'this' keyword?**
A: Refers to current object. Used to differentiate instance variables from parameters.

**Q: How to add complex numbers?**
A: (a + bi) + (c + di) = (a+c) + (b+d)i.

**Q: Advantages of encapsulation?**
A: Data hiding, flexibility, reusability, easy maintenance.

---

## Program 4 - Inheritance (Person, Employee, Student)

**Q: What is inheritance?**
A: A mechanism where child class acquires properties and behaviors of parent class.

**Q: What is 'extends' keyword?**
A: Used to inherit a class. Child class extends parent class.

**Q: What is 'super' keyword?**
A: Refers to parent class. Used to call parent constructors or methods.

**Q: Types of inheritance in Java?**
A: Single, Multilevel, Hierarchical. (Multiple only through interfaces)

**Q: Why no multiple inheritance with classes?**
A: To avoid Diamond Problem - ambiguity when two parents have same method.

**Q: Can constructors be inherited?**
A: No, but child constructor implicitly calls parent constructor using super().

**Q: Order of constructor execution?**
A: Parent first, then child (top to bottom).

**Q: Difference between overriding and overloading?**
A: Overriding: Same signature in parent/child (runtime). Overloading: Same name, different parameters (compile-time).

---

## Program 5 - Polymorphism (Method Overloading)

**Q: What is polymorphism?**
A: Ability of an object to take many forms. One interface for different data types.

**Q: What is method overloading?**
A: Multiple methods with same name but different parameters in same class.

**Q: What is compile-time polymorphism?**
A: Polymorphism resolved at compile time through method overloading.

**Q: Rules for method overloading?**
A: Methods must differ in: number, type, or order of parameters. Return type alone cannot differentiate.

**Q: Can we overload main method?**
A: Yes, but JVM only calls main(String[] args).

**Q: What is type promotion in overloading?**
A: When exact match not found, Java promotes smaller types (int → long, float → double).

---

## Program 6 - Abstract Class & Banking System

**Q: What is an abstract class?**
A: A class with 'abstract' keyword that cannot be instantiated, may contain abstract methods.

**Q: What is an abstract method?**
A: A method without body, must be overridden in child class.

**Q: Can abstract class have concrete methods?**
A: Yes, can have both abstract and implemented methods.

**Q: Difference between abstract class and interface?**
A: Abstract: can have constructors, variables, concrete methods. Interface: only abstract methods and constants (before Java 8).

**Q: Can abstract class have constructor?**
A: Yes, but called only through subclass using super().

**Q: What if child doesn't override all abstract methods?**
A: Child must also be declared abstract.

---

## Program 7 - Multi-threading (Producer-Consumer)

**Q: What is a thread?**
A: A lightweight subprocess, smallest unit of processing, independent path of execution.

**Q: What is multi-threading?**
A: Running multiple threads concurrently in a single program.

**Q: Two ways to create thread?**
A: 1) Extend Thread class. 2) Implement Runnable interface.

**Q: What is Producer-Consumer problem?**
A: Synchronization problem where producers add to shared buffer, consumers remove from it.

**Q: What is synchronization?**
A: Controlling access of multiple threads to shared resources to prevent data inconsistency.

**Q: What are wait() and notify()?**
A: wait() pauses thread. notify() wakes up waiting thread. Used for inter-thread communication.

**Q: What is a race condition?**
A: When multiple threads access shared data simultaneously causing unpredictable results.

**Q: What is deadlock?**
A: When two or more threads are blocked forever, waiting for each other.

**Q: Synchronized method vs synchronized block?**
A: Method locks entire method. Block locks only specific code section.

---

## Program 8 - Exception Handling

**Q: What is an exception?**
A: An unexpected event that disrupts normal program flow.

**Q: What is exception handling?**
A: Mechanism to handle runtime errors, maintaining normal program flow.

**Q: Keywords in exception handling?**
A: try, catch, finally, throw, throws.

**Q: Checked vs unchecked exceptions?**
A: Checked: compile-time (IOException). Unchecked: runtime (NullPointerException, ArithmeticException).

**Q: What is finally block?**
A: Executes regardless of exception. Used for cleanup (closing resources).

**Q: What is ArithmeticException?**
A: Unchecked exception for illegal arithmetic (division by zero).

**Q: Can we have multiple catch blocks?**
A: Yes. Specific exceptions should be caught before general ones.

**Q: Difference between throw and throws?**
A: throw: explicitly throw exception. throws: declares exceptions method might throw.

**Q: Can we have try without catch?**
A: Yes, if followed by finally block.

---

## Program 9 - Interface (Conversion)

**Q: What is an interface?**
A: A reference type containing only abstract methods and constants.

**Q: How to implement interface?**
A: Using 'implements' keyword.

**Q: Can a class implement multiple interfaces?**
A: Yes, Java supports multiple inheritance through interfaces.

**Q: Difference between abstract class and interface?**
A: Interface: all abstract, multiple inheritance. Abstract class: can have concrete methods, single inheritance.

**Q: What are default methods (Java 8)?**
A: Methods with implementation in interfaces, marked with 'default'.

**Q: Can interfaces have constructors?**
A: No, interfaces cannot be instantiated.

**Q: What are marker interfaces?**
A: Empty interfaces used to mark classes (e.g., Serializable, Cloneable).

---

## Program 10 - JDBC

**Q: What is JDBC?**
A: Java Database Connectivity - API to connect Java to databases.

**Q: Steps to connect using JDBC?**
A: 1) Load driver 2) Establish connection 3) Create statement 4) Execute query 5) Process results 6) Close connection.

**Q: What are CRUD operations?**
A: Create (INSERT), Read (SELECT), Update (UPDATE), Delete (DELETE).

**Q: Statement vs PreparedStatement?**
A: Statement: static SQL. PreparedStatement: precompiled, uses parameters, prevents SQL injection.

**Q: What is ResultSet?**
A: Object containing query results, like a table with rows and columns.

**Q: What is SQL injection?**
A: Security attack where malicious SQL is inserted. PreparedStatement prevents by treating input as data.

**Q: Difference between execute(), executeQuery(), executeUpdate()?**
A: execute(): returns boolean. executeQuery(): returns ResultSet (SELECT). executeUpdate(): returns int (INSERT/UPDATE/DELETE).

**Q: Explain connection URL jdbc:mysql://localhost:3306/lab**
A: jdbc:mysql = protocol, localhost = server, 3306 = port, lab = database.

---

## Program 11 - Servlet

**Q: What is a Servlet?**
A: Java class that handles HTTP requests and generates dynamic web content.

**Q: Servlet lifecycle?**
A: init() → service() → destroy().

**Q: What does @WebServlet("/check") do?**
A: Maps servlet to URL /check without web.xml.

**Q: Difference between doGet() and doPost()?**
A: doGet: data in URL, visible. doPost: data in body, hidden, more secure.

**Q: HttpServletRequest vs HttpServletResponse?**
A: Request: contains client data. Response: sends data to client.

**Q: What is servlet container?**
A: Software managing servlets. Examples: Tomcat, Jetty, GlassFish.

**Q: forward() vs sendRedirect()?**
A: forward: server-side, same request. sendRedirect: client-side, new request, URL changes.

**Q: What is session management?**
A: Maintaining user state across requests using HttpSession, cookies, or URL rewriting.

---

## Program 12 - JSP Session

**Q: What is JSP?**
A: JavaServer Pages - HTML with embedded Java. Converted to servlet by server.

**Q: JSP implicit objects?**
A: request, response, session, out, application, config, pageContext, page, exception.

**Q: What is a session?**
A: Server-side storage for user data across multiple requests.

**Q: Session methods?**
A: setAttribute(), getAttribute(), removeAttribute(), invalidate(), getId().

**Q: Difference between `<%= %>` and `<% %>`?**
A: `<%= %>`: expression, outputs value. `<% %>`: scriptlet, executes code.

**Q: Request vs session scope?**
A: Request: single request. Session: entire user session.

**Q: What is session timeout?**
A: Duration after which inactive session is invalidated. Default: 30 minutes.

**Q: invalidate() vs removeAttribute()?**
A: invalidate(): destroys entire session. removeAttribute(): removes one attribute.

---

## General Concepts

**Q: JDK vs JRE vs JVM?**
A: JDK: development kit with compiler. JRE: runtime environment. JVM: executes bytecode.

**Q: What is garbage collection?**
A: Automatic memory management - JVM reclaims memory from unused objects.

**Q: Difference between == and equals()?**
A: ==: compares references (memory address). equals(): compares content/values.

**Q: What is MVC?**
A: Model-View-Controller. Model = data/JDBC, View = JSP, Controller = Servlet.

**Q: Servlets vs JSP?**
A: Servlets: Java with HTML (logic). JSP: HTML with Java (presentation).

**Q: What is static keyword?**
A: Belongs to class, not instance. Shared among all objects.

**Q: What is final keyword?**
A: final variable: constant. final method: can't override. final class: can't inherit.
