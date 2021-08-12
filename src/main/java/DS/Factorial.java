package DS;

public class Factorial {
    int factorial(int n)
    {
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int res=1;
        while(n>0)
        {
            res=res*n;
            n--;
        }
        System.out.println(res);
        Factorial fact=new Factorial();
        int res1= fact.factorial(5);
        System.out.println(res1);
    }
}
