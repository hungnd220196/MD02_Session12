package bt4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng từ:");
        int numberOfWords = Integer.parseInt(scanner.nextLine());

        Stack<String> stack = new Stack<>();

        System.out.println("Nhập các từ:");
        for (int i = 0; i < numberOfWords; i++) {
            String word = scanner.nextLine();
            stack.push(word);
        }
        System.out.println("Các từ theo thứ tự đảo ngược:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
