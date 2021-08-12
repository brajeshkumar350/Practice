package DS;

public class FibonacciByVar {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int num;
        System.out.print(num1+","+num2);
        for (int i = 0; i < 10; i++) {
            num=num1+num2;
            System.out.print(",");
            System.out.print(num);
            num1=num2;
            num2=num;
        }
    }
}
