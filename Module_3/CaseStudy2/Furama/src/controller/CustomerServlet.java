package controller;

import model.Customer;
import model.Customer_type;
import service.customer.CustomerService;
import service.customer.CustomerServiceImpl;
import service.customer_type.CustomerTypeService;
import service.customer_type.CustomerTypeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }switch (action){
            case "delete":
                deleteCustomer(request,response);
                break;
            case "save":
                addCustomer(request,response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            case "ad" :
                break;
            default:
               break;
        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if(action == null){
    action = "";
}switch (action){
            case "delete":
                showDeleteCustomer(request,response);
                break;
            case "edit":
                showEditCustomer(request,response);
                break;
            case "save":
                showAddCustomer(request,response);
                break;
            case "search":
               searchCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
        }
    }


    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        List<Customer> customerList = this.customerService.searchCustomer(search);
        request.setAttribute("customerList",customerList);
        RequestDispatcher  requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id_Customer = request.getParameter("id");
        Customer customer = this.customerService.findByIdCustomer(id_Customer);
        request.setAttribute("customer",customer);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/delete.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void deleteCustomer(HttpServletRequest request,HttpServletResponse response){
     String id_customer = request.getParameter("idCus");
     this.customerService.deleteCustomer(id_customer);
     this.listCustomer(request,response);
}
    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) {
        String idCustomer = request.getParameter("id");
        Customer customer = this.customerService.findByIdCustomer(idCustomer);
        request.setAttribute("customer",customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        String idCus = request.getParameter("idCus");
        int cus_type_id = Integer.parseInt(request.getParameter("Cus_type"));
        Customer_type cus_type = this.customerTypeService.findByIdCus_Type(cus_type_id);
        String nameCus = request.getParameter("nameCus");
        Date birthDayCus = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        try {
            java.util.Date birthday = format.parse(request.getParameter("birthDayCus"));
            birthDayCus = new Date(birthday.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean gender = Boolean.parseBoolean(request.getParameter("genderCus"));
        String idCardCus = request.getParameter("idCardCus");
        String phoneCus = request.getParameter("phoneCus");
        String emailCus = request.getParameter("emailCus");
        String addressCus = request.getParameter("addressCus");
        Customer customer = new Customer(cus_type,nameCus,birthDayCus,gender,idCardCus,phoneCus,emailCus,addressCus);
        this.customerService.upDateCustomer(idCus,customer);

        this.listCustomer(request,response);
    }
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAllCustomer();
        request.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void showAddCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerService.findAllCustomer();
        request.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/save.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void addCustomer(HttpServletRequest request, HttpServletResponse response) {
        Customer customer = null;
        String idCus = request.getParameter("idCus");
        int cus_type_id = Integer.parseInt(request.getParameter("Cus_type"));
        Customer_type cus_type = this.customerTypeService.findByIdCus_Type(cus_type_id);
        String nameCus = request.getParameter("nameCus");
        Date birthDayCus = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        try {
            java.util.Date birthday = format.parse(request.getParameter("birthDayCus"));
            birthDayCus = new Date(birthday.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean gender = Boolean.parseBoolean(request.getParameter("genderCus"));
        String idCardCus = request.getParameter("idCardCus");
        String phoneCus = request.getParameter("phoneCus");
        String emailCus = request.getParameter("emailCus");
        String addressCus = request.getParameter("addressCus");
        customer= new Customer(idCus,cus_type,nameCus,birthDayCus,gender,idCardCus,phoneCus,emailCus,addressCus);
        this.customerService.saveCustomer(customer);
       this.listCustomer(request,response);

    }

}
