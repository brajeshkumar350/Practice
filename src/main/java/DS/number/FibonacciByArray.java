package DS.number;

public class FibonacciByArray {
    public static void main(String[] args) {
        int n=10;
        int[] arr=new int[n+2];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+","+arr[1]);
        for (int i = 2; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(",");
            System.out.print(arr[i]);

        }


    }
}
