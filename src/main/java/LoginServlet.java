import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //session
        HttpSession currentSession = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            currentSession.setAttribute("isAdmin", true);
            response.sendRedirect("/profile");
        } else if (username.equals("robert") && password.equals("password")) {
            currentSession.setAttribute("isAdmin", false);
            response.sendRedirect("/profile");
        }
        else {
            response.sendRedirect("/login");
        }
    }
}





