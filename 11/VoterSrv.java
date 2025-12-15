import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/check")
public class VoterSrv extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        PrintWriter pw = res.getWriter();

        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));

        if (age >= 18)
            pw.println("Welcome " + name + ", you are eligible to vote");
        else
            pw.println("Sorry " + name + ", you are not eligible to vote");
    }
}
