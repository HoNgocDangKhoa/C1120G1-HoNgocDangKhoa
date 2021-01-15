package bai11_dsa_stack_queue.baitap;

import java.util.Stack;

public class KiemTraDauNgoac {
    public static boolean check(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char sym = string.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            }
            if (sym == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                stack.pop();

                }

            }
        }
        if (stack.empty()) {
            return true;
        }
        return true;


    }

    public static void main(String[] args) {
        if (check("s * () * s – b * (s – c) ")) {
            System.out.println("gut chóp");
        } else {
            System.out.println("no gut chop");
        }

    }
}
