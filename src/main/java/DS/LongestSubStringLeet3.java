package DS;

public class LongestSubStringLeet3 {
    public static void main(String[] args) {
        //pwwkew
        //"ohomm"
        //abcabcbb
        //"ckilbkd"
        String s="ckilbkd";
        int l=s.length();
        String res="";
        for (int i = 0; i < l; i++) {
            String a=String.valueOf(s.charAt(i));
            if(res.contains(a))
            {

                if(res.endsWith(a))
                {
                    if(i==l-1)
                        continue;
                    res=res.replace(res,a);
                }
                else if(res.startsWith(a))
                {
                   res=res.replace(a,"");
                   res=res+a;
                }
                else continue;
                /*if(i<=2){
                    res=res.replace(res,a);
                   }
                else if(i<l-1){
                    res=res.replace(a,"");
                res=res+a;}*/




            }
            else
            {
                res=res+a;
            }
        }
        System.out.println(res);
    }
}
