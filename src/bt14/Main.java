package bt14;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra:");
        String input = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                stack.push(Character.getNumericValue(input.charAt(i)));
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Chuỗi trên là chuỗi rỗng");
        } else {
            boolean isPrime = true;
            while (!stack.isEmpty()) {
                int number = stack.pop();
                if (number <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i  <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
            }
            if (isPrime) {
                System.out.println("Chuỗi nhập vào là dãy số nguyên tố");
            } else {
                System.out.println("Chuỗi nhập vào không phải là dãy số nguyên tố");
            }
        }
    }
}
