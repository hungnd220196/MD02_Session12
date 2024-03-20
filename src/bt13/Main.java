package bt13;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào");
        String input = scanner.nextLine();
        Stack<Character> stackDescending = new Stack<>();
        for (int i = 0; i < input.length(); i++)
        {
            if (stackDescending.isEmpty())
                stackDescending.push(input.charAt(i));
            else if (stackDescending.peek().compareTo(input.charAt(i)) < 0)
            {
                System.out.println("Không giảm dần");
                return;
            }
            stackDescending.push(input.charAt(i));
        }
        System.out.println("Chuỗi giảm dần");
    }
}
