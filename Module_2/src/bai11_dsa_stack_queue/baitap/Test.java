package bai11_dsa_stack_queue.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("khoa", "25/02/1999", "nam"));
        arrayList.add(new Employee("van", "05/04/1994", "nu"));
        arrayList.add(new Employee("dong", "25/02/1997", "nam"));
        arrayList.add(new Employee("sang", "15/09/1999", "nam"));
        arrayList.add(new Employee("long", "25/07/1998", "nam"));
        arrayList.add(new Employee("nhi", "01/02/1999", "nu"));
        arrayList.add(new Employee("thuy", "18/08/1988", "nu"));
        System.out.println("trc khi sap xep :");
        Collections.sort(arrayList, new BirthDays());
        for (Employee arrayList1 : arrayList) {
            System.out.println(arrayList1);
        }
        Queue<Employee> nam = new LinkedList<>();
        Queue<Employee> nu = new LinkedList<>();
        for (Employee employee : arrayList) {
            if (employee.gender.equals("nam")) {
                nam.add(employee);
            } else {
                nu.add(employee);
            }

            System.out.println(employee);
        }

        System.out.println("sau khi sap xep");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(nu);
        employees.addAll(nam);
//        while (!nu.isEmpty()) {
//            employees.add(nu.poll());
//        }
//        while (!nam.isEmpty()) {
//            employees.add(nam.poll());
//        }
        for (Employee em : employees) {
            System.out.println(em);
        }
//        for (Employee em:){
//            System.out.println(em);
//        }
    }

}
