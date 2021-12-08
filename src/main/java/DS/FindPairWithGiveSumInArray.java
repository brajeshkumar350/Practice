package DS;

import java.util.HashSet;
import java.util.Set;

public class FindPairWithGiveSumInArray
{
    public static void main(String[] args) {
        int [] arr={8, 7, 2, 5, 3, 1};
        int k=10;
        int len=arr.length;
      //  FindByIteration(arr, k, len);
        FindSumBySet(arr, k, len);
    }

    private static void FindSumBySet(int[] arr, int k, int len) {
        Set<Integer> hh=new HashSet<>();
        for (int i = 0; i < len; i++) {
            int tt= k - arr[i];
            if(hh.contains(arr[i]))
            {
                System.out.println(tt+"--"+ arr[i]);
            }
            hh.add(tt);

        }
    }

    private static void FindByIteration(int[] arr, int k, int len) {
        for (int i = 0; i < len; i++) {
            int first= arr[i];
            for (int j = 0; j < len; j++) {
                    if(i==j)continue;
                    int second= arr[j];
                    if((first+second)== k)
                    {
                        System.out.println(arr[i]+"--"+ arr[j]);
                    }
            }

        }
    }
}
