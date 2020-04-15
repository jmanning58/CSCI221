import java.util.*;

public class Tester {

    public static int fun100(int x, int y) {
        if(x == 0)
            return y;
        else {
            return fun100(x-1,x+y);
        }
    }

    public static void main(String [] args) {
    //int[] arr = {1, 2, 3, 4, 1};
    //System.out.println(fun100(5, 10));
        Queue<Integer> q = new Queue<>();
        int item1 = 1;
        int item2 = 0;
        int item3 = 4;
        q.enqueue(item2);
        q.enqueue(item1);
        q.enqueue(item1 + item3);
        item2 = q.peek();
        q.enqueue(item3*item3);
        q.enqueue(item2);
        q.enqueue(3);
        item1 = q.peek();
        q.dequeue();
        System.out.println(item1 + " " + item2 + " " + item3);
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}