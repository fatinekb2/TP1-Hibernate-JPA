package ensaj.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");

        out.println("<h3>Bienvenue, " + login + ", au cours du Développement Web JEE</h3>");
    }
}
