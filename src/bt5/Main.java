package bt5;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        String string = "able was i ere i saw elba";
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.offer(string.charAt(i));
        }
        System.out.println(queue);
        System.out.println(stack);
        while(!queue.isEmpty()){
            if (queue.poll()!= stack.pop()){
                System.out.println("không phải là palime");
                return;
            }
        }
        System.out.println("là chuỗi palime");
    }
}
