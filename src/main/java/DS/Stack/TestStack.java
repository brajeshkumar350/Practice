package DS.Stack;

public class TestStack {
    public static void main(String[] args) throws Exception {
        MyStack stack=new MyStack(4);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
