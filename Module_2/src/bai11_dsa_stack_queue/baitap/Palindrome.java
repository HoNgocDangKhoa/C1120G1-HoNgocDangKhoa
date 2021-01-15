package bai11_dsa_stack_queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean checkPalindrome(String string) {
        string=string.toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        for (int i = 0; i < string.length() / 2; i++) {
            if (!stack.pop().equals(queue.poll())) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (checkPalindrome("Able was I ere I saw Elba")) {
            System.out.println("chuổi đối xứng");
        } else {
            System.out.println("noooo");

        }
    }
}