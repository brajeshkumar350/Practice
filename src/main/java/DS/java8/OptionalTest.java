package DS.java8;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalTest {
    static ArrayList<String> al=new ArrayList<>();
    public static void main(String[] args) {
        Optional<Integer> optional=Optional.ofNullable(45);
        if(optional.of(45)==null)
        {
            System.out.println(optional.isPresent());
        }
        else {
            System.out.println("nulllllll");

        }
    }





    private static void findsubsequences(String s, String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        findsubsequences(s.substring(1), ans + s.charAt(0));

        findsubsequences(s.substring(1), ans);
    }

}
