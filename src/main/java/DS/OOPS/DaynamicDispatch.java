package DS.OOPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaynamicDispatch {
    public static void main(String[] args) {
        //B a= (A)new A();//class cast Exception
        A a=new A();
        a.test();

        int[][] mat = {
                { 1, 1	,0,	1 },
                { 1	,1	,1	,0},
                { 1	,0	,1	,0},
                { 1	,0	,1	,1}};
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1)
                {
                    if(map.containsKey(i))
                    {
                        map.put(i,map.get(i)+1);
                    }else
                    {
                        map.put(i,1);
                    }

                }
                else
                {
                    if(map.containsKey(i))
                    {
                        if(map.get(i)==0) {
                            map.put(i, map.get(i) + 1);
                        }
                    }else
                    {
                        map.put(i,0);
                    }
                }
            }
        }
       System.out.println(map.toString());

    }
}

