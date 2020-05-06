import java.util.ArrayDeque;
import java.util.Deque;
public class A{
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();

        deque.push(2);
        deque.push(3);
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}