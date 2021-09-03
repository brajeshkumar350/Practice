package DS;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MediaanOfTwoSortedArrayLeetCode4 {
    public static void main(String[] args) {
        int []nums1 = {};
        int []nums2 = {1};
        double res=medianOfSortedArray(nums1,nums2);
        System.out.println(res);
    }

    public static double medianOfSortedArray(int[] arr1,int[] arr2)
    {
        Set<Integer> set=new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {

            set.add(arr1[i]);

        }
        for (int i = 0; i <arr2.length ; i++) {
            set.add(arr2[i]);
        }
       List<Integer> li= set.stream().collect(Collectors.toList());
        int l=li.size();
        if(l>2) {


            if (l % 2 == 0) {
                int ll = l / 2;

                Double ls = (double) (li.get(ll) + li.get(ll - 1)) / 2;

                return ls;
            } else {
                double ll = Math.floor((double) l / 2);
                return li.get((int) ll);
            }
        }
        else if(l==1) return li.get(l-1);
        else return 0;


    }
}
