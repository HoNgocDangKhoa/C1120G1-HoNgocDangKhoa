package bai17_string_regex.thuchanh;

public class AccountExampleTest {
    private static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    private static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
    private static AccountExample accountExample;

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String count : validAccount) {
            boolean valid = accountExample.validate(count);
            System.out.println("Tai khoản la : " + count + " là hợp lệ  " + valid);
        }
        for (String count : invalidAccount) {
            boolean valid = accountExample.validate(count);
            System.out.println("Tài khoản là : " + count + " là hợp lệ " + valid);
        }
    }
}
