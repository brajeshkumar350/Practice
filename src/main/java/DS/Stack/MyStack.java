package DS.Stack;

public class MyStack {
    int a[];
    int capacity;
    int top;
    MyStack(int capacity)
    {
        this.capacity=capacity;
        top=-1;
        a=new int[capacity];
    }
    void push(int data) throws Exception {
        if(top==capacity-1)
        {
            throw new Exception("tewst");
        }
        top++;
        a[top]=data;

    }
    int pop() throws Exception {
        if(top==-1)
        {
            throw  new Exception("empty");
        }
        int res=a[top];
        top--;
        return res;
    }
    int peek() throws Exception {
        if(top==-1)
        {
            throw  new Exception("empty");
        }
        int res=a[top];

        return res;
    }
}
