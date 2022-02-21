package DS;

public class PrintDuplicateInLinearTime {
    public static void main(String[] args) {
        int [] arr= {1,2,3,1,4,5};
        printRepeating(arr, 6);

    }

    static void printRepeating(int arr[], int n)
    {
        // First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
        for (int i = 0; i < n; i++)
        {
            int index = arr[i] % n;
            arr[index] +=n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) >= 2)
                System.out.print(i + " ");
        }
    }
}
