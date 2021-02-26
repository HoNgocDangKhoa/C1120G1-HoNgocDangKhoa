package bai17_string_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidate {
    private static final String PHONE_VALIDATE = "^\\([\\d]{2}\\)-\\([0][\\d]{9}\\)$";

    public PhoneValidate() {
    }

    public static boolean validate(String s) {
       return s.matches(PHONE_VALIDATE);
    }

    private static final String[] phone = new String[]{"ab-0123456", "(03)-(0337568547)", "85-123456789", "12-a32876548"};

    public static void main(String[] args) {
        for (String phone1 : phone) {
            boolean valid = validate(phone1);
            System.out.println("số điện thoại : " + phone1 + " hợp lệ " + valid);
        }
    }

}
