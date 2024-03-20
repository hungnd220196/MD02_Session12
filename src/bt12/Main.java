package bt12;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] arr = {1, 2, 9, 3, 7, 4, 5, 6};

        for (int i : arr) {
            queue.offer(i);
        }
        int min = queue.poll();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current < min) {
                queue.offer(min);
                min = current;
            } else {
                queue.offer(current);
                break;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);

    }

}
