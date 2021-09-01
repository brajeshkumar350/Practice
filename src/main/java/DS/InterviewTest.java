package DS;

import java.util.HashMap;
import java.util.Map;

public class InterviewTest {
    public static void main(String[] args) {
        int [] arr= { 1, 3, 2, 4, 7};
        int l=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            int s=arr[i];
            int res=7-s;
            if(map.containsKey(res))
            {
                System.out.println(i+" "+map.get(res));
            }
            map.put(arr[i], i);


            /*
             * for(int j=i+1;j<l;j++) { if(arr[i]+arr[j]==7) { System.out.print(i+" "+j); }
             *
             * }
             */

        }
    }
}
