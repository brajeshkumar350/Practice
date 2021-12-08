package DS;

import java.util.Map;
import java.util.TreeMap;

public class PrintStringWithHeightOccurenceOrder {
    public static void main(String[] args) {
        String str = "abbabbac";
        String[] st = str.split("");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < st.length; i++) {
            if (map.containsKey(st[i])) {
                map.put(st[i], map.get(st[i]) + 1);
            } else {
                map.put(st[i], 1);
            }
        }
        Map<Integer,String> map1=new TreeMap<>();
        map.entrySet().forEach(m->{

            int a=m.getValue();
            String b=m.getKey();
            map1.put(a,b);

        });
        StringBuilder sb=new StringBuilder();
        map1.keySet().forEach(k->{
            for (int i = k; i < 0; i--) {
                sb.append(map1.get(k));
            }


        });

        System.out.println(sb);

    }


}

