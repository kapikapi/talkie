package webapp.servlets;


import exigen.students.App;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: student10
 * Date: 15.11.13
 * Time: 15:26
 */
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/answer.jsp");
        rd.forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String a = req.getParameter("question");
        HttpSession session = req.getSession();
        session.setAttribute("answer",App.getResponse(a));


        RequestDispatcher rd = req.getRequestDispatcher("/answer.jsp");
        rd.forward(req, resp);
    }
}
