package DS;

public class ReverseStringWithOutPositionOfSpecialCharcter {
    public static void main(String[] args) {
        String str="Ab,c,de!$";
        String ss=str.replaceAll("[^a-zA-Z]","");

        StringBuilder ssb=new StringBuilder(ss).reverse();
        int l=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            Character c=str.charAt(i);
            if(c.isAlphabetic(c))
            {
                res.append(ssb.charAt(l)+"");
                l++;
            }
            else
            {
                res.append(str.charAt(i)+"");
            }

        }



        System.out.println(res);

    }
}
