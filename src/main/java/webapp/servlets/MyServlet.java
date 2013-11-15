package webapp.servlets;


import exigen.students.App;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: student10
 * Date: 15.11.13
 * Time: 15:26
 */
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        PrintWriter writer = res.getWriter();

        writer.println("<html>");
        writer.println("<head><title>My first page</title></head>");
        writer.println("<body>Привет!" +
                "<FORM method=\"post\"> " +
                "Могу ли я <INPUT NAME=\"question\"> <BR> " +
                "<INPUT TYPE=SUBMIT>\n" +
                "</FORM> " +
                "</body>");
        writer.println("</html>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        req.setCharacterEncoding("UTF-8");
        String a = req.getParameter("question");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head><title>My first page</title></head>");
        writer.println("<body>Привет!" +
                "<FORM method=\"post\">  " +
                "Могу ли я <INPUT NAME=\"question\">? <BR> " +
                "<INPUT TYPE=SUBMIT>\n" +
                "</FORM> <br>" +
                App.getResponse(a) +
                "</body>");
        writer.println("</html>");
        writer.close();


    }
}
