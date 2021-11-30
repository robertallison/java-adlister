import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//not sure where to push this
@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String searchQuery = req.getParameter("q");
        String name = req.getParameter("name");
        PrintWriter out = res.getWriter();
//        out.println("<h1>Hello, World!</h1>");

        if(name != null) {
            out.println("<h1>Hello, " + name + "</h1>");
        } else {
            out.println("<h1>Hello, World</h1>");
        }
        if(searchQuery != null) {
            out.println("<p>Here are your results for " + searchQuery + "</p>");
        }

    }
}
