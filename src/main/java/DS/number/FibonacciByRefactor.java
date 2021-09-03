package DS.number;

public class FibonacciByRefactor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n)
    {
        if (n <= 1)
            return n;

        // Recursive call
        return fibonacci(n - 1)
                + fibonacci(n - 2);
    }
}
