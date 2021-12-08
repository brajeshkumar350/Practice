package DS.Recursion;

public class RecussionTest {
    public static void main(String[] args) {
        test(4);
    }

    static void test(int n)
    {
        if(n<1)return;
        else
        {
            System.out.print(" "+n+" ");
            test(n-1);
            System.out.print(" "+n+" ");
        }
    }
}

