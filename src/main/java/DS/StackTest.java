package DS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search("bb"));
        System.out.println("-----------Queue------------");
        Queue<String> queue=new LinkedList<>();
        queue.add("q1");
        queue.add("q2");
        queue.add("q3");
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
