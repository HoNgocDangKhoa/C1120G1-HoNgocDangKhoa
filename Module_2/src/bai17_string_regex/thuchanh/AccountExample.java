package bai17_string_regex.thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    private static final String COUNT_REGEX="^[_a-z0-9]{6}$";
    public AccountExample(){

    }
    public  boolean validate(String regex){
       Pattern pattern= Pattern.compile(COUNT_REGEX);
      Matcher  matcher=pattern.matcher(regex);
      return matcher.matches();
    }
}
