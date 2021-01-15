package bai11_dsa_stack_queue.baitap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class BirthDays implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1= null;
        Date date2= null;
        try {
            date1 = simpleDateFormat.parse(o1. getDate());
            date2 = simpleDateFormat.parse(o2. getDate());
            return date1.compareTo(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
