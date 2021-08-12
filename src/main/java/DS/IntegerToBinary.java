package DS;

import java.util.Stack;

public class IntegerToBinary {
    public static void main(String[] args) {

        int n=30;
        Stack<Integer> stack=new Stack<>();
        while(n>0)
        {
            int t=n%2;
            stack.push(t);
            n=n/2;
        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}
