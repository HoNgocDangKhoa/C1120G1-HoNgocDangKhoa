package bai17_string_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidate {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[G-M]$";
    public static boolean validate(String s) {
        return s.matches(CLASS_REGEX);
    }
private static final String[] num=new String[]{"G1234M","A45B","Cflt","P9999M"};

    public static void main(String[] args) {
        for(String string: num){
            boolean valid=validate(string);
            System.out.println(string +":"+valid);
        }
    }
}

