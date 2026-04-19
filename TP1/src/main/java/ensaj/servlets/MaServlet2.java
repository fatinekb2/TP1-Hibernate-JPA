package ensaj.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/MaServlet2")
public class MaServlet2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if(login.equals("Fatine") && password.equals("123")) {

            out.println("<h3>Authentification réussie</h3>");

            RequestDispatcher rd = request.getRequestDispatcher("TargetServlet");
            rd.include(request, response);


        } else {
            out.println("<h3>Vous n'êtes pas un utilisateur valide</h3>");
        }
    }
}
