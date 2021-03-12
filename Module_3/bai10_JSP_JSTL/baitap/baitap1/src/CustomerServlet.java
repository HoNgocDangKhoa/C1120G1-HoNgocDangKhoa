import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = {"","/Customer"})
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList;

    @Override
    public void init() throws ServletException {
        customerList=new ArrayList<>();
        customerList.add(new Customer("Khoa","25/02/1999","Huế","web/img/anh/1.jpg"));
        customerList.add(new Customer("Nghĩa","25/02/1999","Đà Nẵng","web/img/anh/2.jpg"));
        customerList.add(new Customer("Đông","25/02/1999","Hội An","web/img/anh/3.jpg"));
        customerList.add(new Customer("Lĩnh","25/02/1999","Quảng Trị","web/img/anh/4.jpg"));
        customerList.add(new Customer("Sang","25/02/1999","Lào Cai","web/img/anh/5.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("Customer/list.jsp");
        requestDispatcher.forward(request,response);
    }
}
