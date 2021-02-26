package bai11_dsa_stack_queue.baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void Revert(int[] num) {
        ArrayList<Integer> integers = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num.length; i++) {
            stack.push(num[i]);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            integers.add(stack.pop());
        }
        System.out.println(integers);
    }

    public static void main(String[] args) {
        int[] num = {9, 6, 8, 7, 5, 4, 34};
        Revert(num);
    }
}