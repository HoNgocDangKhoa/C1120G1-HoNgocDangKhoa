package controller;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    CustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                break;

        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            case "view":
                viewCustomer(request,response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }




    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAll();
        request.setAttribute("customerList", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createCustomer(HttpServletRequest request,HttpServletResponse response){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id=(int)(Math.random()*10000);
        Customer customer=new Customer(id,name,email,address);
        this.customerService.save(customer);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("customer/create.jsp");
//        request.setAttribute("message", "New customer was created");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customer= this.customerService.findById(id);
        RequestDispatcher requestDispatcher;
        if(customer==null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customer",customer);
            requestDispatcher=request.getRequestDispatcher("/customer/edit.jsp");
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
    int id=Integer.parseInt(request.getParameter("id"));
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String address=request.getParameter("address");
    Customer customer=this.customerService.findById(id);
    RequestDispatcher requestDispatcher;
    if(customer==null){
        request.getRequestDispatcher("error-404.jsp");
    }else {
        customer.setName(name);
        customer.setEmail(email);
        customer.setAddress(address);
        this.customerService.update(id,customer);
        request.setAttribute("customer",customer);
        request.setAttribute("message", "Customer information was updated");
        requestDispatcher=request.getRequestDispatcher("/customer/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customer=this.customerService.findById(id);
        RequestDispatcher requestDispatcher;
        if(customer == null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customer",customer);
            requestDispatcher=request.getRequestDispatcher("customer/delete.jsp");
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
   Customer customer=this.customerService.findById(id);
   RequestDispatcher dispatcher;
   if(customer==null){
       request.getRequestDispatcher("error-404.jsp");
   }else {
      this.customerService.remove(id);
       dispatcher=request.getRequestDispatcher("customer/delete.jsp");
       try {
           dispatcher.forward(request,response);
       } catch (ServletException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
    }
    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customer=this.customerService.findById(id);
        RequestDispatcher requestDispatcher;
        if(customer==null){
            request.getRequestDispatcher("error-404.jsp");

        }else {
            request.setAttribute("customer",customer);
            requestDispatcher= request.getRequestDispatcher("customer/view.jsp");
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
