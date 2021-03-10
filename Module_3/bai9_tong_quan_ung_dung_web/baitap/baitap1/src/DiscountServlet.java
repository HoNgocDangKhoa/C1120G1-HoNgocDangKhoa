import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet" ,urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String product = request.getParameter("Description");
    float price= Float.parseFloat(request.getParameter("Price"));
    float Percent= Float.parseFloat(request.getParameter("Percent"));
    float Amount= price*(Percent/100);
    float DiscountPrice= price-Amount;

            PrintWriter writer = response.getWriter();
            writer.println("<html>");
            writer.println("<h1>Product Description:"+product+"</h1>");
            writer.println("<h1>List Price:"+price+"</h1>");
            writer.println("<h1>Discount Percent:"+Percent+"</h1>");
            writer.println("<h1>Discount Amoun:"+Amount+"</h1>");
            writer.println("<h1>DiscountPrice:"+DiscountPrice+"</h1>");
            writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request,response);
    }
}
