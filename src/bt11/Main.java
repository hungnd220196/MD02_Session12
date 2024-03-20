package bt11;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 9, 3, 7, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
        }
        System.out.println("phần tử lớn nhất là " + stack.peek());
    }
}
