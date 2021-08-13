package DS;

import java.util.*;

public class SecondLargestArray {

    public static void main(String[] args) {
        int arr[]={12,34,4,5,6,8,9};
        Arrays.sort(arr);
        int[] arr1=new int[arr.length];

        int k=10;
        Map<Integer,Integer> map=new HashMap<>() ;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
            arr1[i]=arr[i];

        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {
            if(arr[i]<k)
            {
                list.add(arr1[i]);
            }
        }
        System.out.println(map);
        System.out.println(list);
        System.out.println(map.get(list.get(list.size()-1)));
    }
}
