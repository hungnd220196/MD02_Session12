package bt2;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character == ')' || character == '}' || character == ']') {
                if (stack.isEmpty()) {
                    System.out.println("không có cặp ngoặc");
                    return;
                }
                char openBracket = stack.pop();
                if (!isMatchingBracket(openBracket, character)) {
                    System.out.println("không có cặp ngoặc");
                    return;
                }
            } else if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("không có cặp ngoặc");
        } else {
            System.out.println("có các cặp ngoặc hợp lệ");
        }
    }

    private static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
