package DS;

import java.util.HashMap;
import java.util.Map;

public class SiemensTest {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        String [] patterns=pattern.split("");
        String[] strs=str.split(" ");
        Map<String,String> map=new HashMap<>();
        boolean check=false;

        for (int i = 0; i < patterns.length; i++) {
            if(map.containsKey(patterns[i]))
            {
                String val=map.get(patterns[i]);
                if(val.equals(strs[i]))
                {
                    check=true;
                }
            }
            else
            {
                map.put(patterns[i], strs[i]);
            }

        }
        System.out.println(check);
    }
}
