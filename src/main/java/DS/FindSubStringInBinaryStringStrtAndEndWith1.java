package DS;

import java.util.Stack;

public class FindSubStringInBinaryStringStrtAndEndWith1 {
    public static void main(String[] args) {
        String str="1111";
        String [] sp=str.split("");
        for (int i = 0; i < sp.length; i++) {
           if(sp[i].equals("1"))
           {
               Stack<String> st=new Stack<>();
               st.push(sp[i]);

           }
        }
    }
}
