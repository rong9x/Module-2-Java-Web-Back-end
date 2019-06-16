import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Double.parseDouble;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("description");
        double listPrice = parseDouble(request.getParameter("price"));
        double discountPercent = parseDouble(request.getParameter("discount_percent"));
        double discountAmount = listPrice * discountPercent / 100;
        double discountPrice = listPrice - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<label>Product Description:</label>");
        writer.println("<span>" + productDescription + "</span><br>");
        writer.println("<label>Price:</label>");
        writer.println("<span>" + listPrice + "</span><br>");
        writer.println("<label>Discount percent:</label>");
        writer.println("<span>" + discountPercent + "</span><br>");
        writer.println("<label>Discount amount:</label>");
        writer.println("<span>" + discountAmount + "</span><br>");
        writer.println("<label>Discount price:</label>");
        writer.println("<span>" + discountPrice + "</span><br>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
