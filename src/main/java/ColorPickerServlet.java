import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ColorPickerServlet", urlPatterns = "/pickcolor")
public class ColorPickerServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("colorPicker.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String colorChoice = request.getParameter("colorChoice");
        request.setAttribute("colorChoice", colorChoice);
        response.sendRedirect("/viewColor?color=" + colorChoice);
    }
}
