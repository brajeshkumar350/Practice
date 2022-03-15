package DS;

public class IncrementSum {
    public static void main(String[] args) {
        //Op - 6, 10,22
        int arr[] = {1, 5, 3, 7, 4, 8, 10,7,8,4,3,5,5,9,8,7,8};
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            int a=arr[i];
            int b=arr[i+1];
            if(a<=b)
            {
                sum=sum+a;
                if(i==arr.length-2)
                {
                    System.out.println(a+b);
                }
            }
            else
            {
                if(i!=arr.length-2 && sum>0)
                {
                    System.out.println(sum+a);
                }

                sum=0;
            }

        }
    }
}
