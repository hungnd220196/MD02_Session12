package bt6;

import java.util.Stack;

public class BracketChecker {
    public static boolean isValidExpression(String expression) {
        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                bracketStack.push(symbol);
            } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                char left = bracketStack.pop();
                if ((left == '(' && symbol != ')') ||
                        (left == '[' && symbol != ']') ||
                        (left == '{' && symbol != '}')) {
                    return false;
                }
            }
        }

        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        String[] expressions = {
                "s * (s - a) * (s - b) * (s - c)",
                "(- b + (b^2 - 4*a*c)^(0.5/ 2*a))",
                "s * (s - a) * s - b) * (s - c)",
                "( - b + (b^2 - 4*a*c)^(0.5/ 2*a))"
        };

        for (String expression : expressions) {
            if (isValidExpression(expression)) {
                System.out.println(expression + " → Well");
            } else {
                System.out.println(expression + " → ???");
            }
        }
    }
}


