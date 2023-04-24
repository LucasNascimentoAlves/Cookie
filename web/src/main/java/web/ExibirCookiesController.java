package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exibirCookies")
public class ExibirCookiesController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Exibindo Cookies</title>");
        out.println("</head>");
        out.println("<body>");

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println("<p>" + cookie.getName() + ": " + cookie.getValue() + "</p>");
            }
        } else {
            out.println("<p>Nenhum cookie encontrado.</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
