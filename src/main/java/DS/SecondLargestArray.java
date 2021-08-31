package DS;

import java.util.*;

public class SecondLargestArray {

    public static void main(String[] args) {
        int arr[]={12,34,4,5,6,8,9};
        findLargestBySingleLoop(arr);
        //FindLargestByLoop(arr);
    }

    private static void FindLargestByLoop(int[] arr) {
        int[] arr1=new int[arr.length];

        int k=10;
        Map<Integer,Integer> map=new HashMap<>() ;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);

        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

        System.out.println(map.get(arr[arr.length-2]));
    }

    private static void findLargestBySingleLoop(int [] arr)
    {
        // int arr[]={12,34,4,5,6,8,9};
        int largest=0;
        int sencodLargest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>sencodLargest)
            {
                sencodLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > sencodLargest && arr[i] != largest)
                sencodLargest = arr[i];

        }
        System.out.println(sencodLargest);

    }
}
