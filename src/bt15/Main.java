package bt15;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số theo hệ thập phân");
        int input = Integer.parseInt(scanner.nextLine());
        Stack<String> binaryStack = new Stack<>();
        while (input > 0) {
            binaryStack.push(String.valueOf(input % 2));
            input /= 2;
        }
        while (!binaryStack.isEmpty())
            System.out.print(binaryStack.pop());
    }

}
