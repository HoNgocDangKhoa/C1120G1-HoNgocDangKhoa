package bai17_string_regex.thuchanh;

public class EmailExampleTest {
   private static EmailExample emailExample;
   private  static String[]validEmail =new String[]{ "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
   private  static String[]invalidEmail =new String[]{ "a@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email : validEmail ){
            boolean valid = emailExample.validate(email);
                System.out.println("Email is "+ email + "is valid "+ valid);
            }
        for (String email : invalidEmail ){
            boolean valid=emailExample.validate(email);
            System.out.println("Email is " + email + "is valid "+ valid);

        }
        }
    }

