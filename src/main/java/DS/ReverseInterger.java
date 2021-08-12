package DS;

public class ReverseInterger
{
    public static void main(String[] args) {
        int n=123456;
        int num=0;
        while(n>0)
        {
            int t=n%10;
            num=(num*10)+t;
            n=n/10;
        }
        System.out.println(num);

    }
}
