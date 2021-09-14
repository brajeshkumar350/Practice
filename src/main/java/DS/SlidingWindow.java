package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        //output[3,3,,5,5,6,7]
        slide(arr,k);
    }

    public static int[]   slide(int [] arr,int k)
    {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int[] arr1= Arrays.copyOfRange(arr,i,k);
            Arrays.sort(arr1);
            list.add(arr1[arr1.length-1]);
            k++;
            if(k==arr.length+1)break;

        }
        int[] res = new int[list.size()];
        for (int i =0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
