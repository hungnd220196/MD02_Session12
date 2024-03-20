package bt9;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> stack =new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
        for (int i : arr) {
            System.out.print(i+"\t");
        }
        String str = "abcdefgh";
        StringBuilder sb = new StringBuilder(str);
        Stack<Character> stack1 =new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack1.push(str.charAt(i));
            ;
        }
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i,stack1.pop());
        }
        System.out.println("\n"+sb);
    }
}
