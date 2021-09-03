package DS.number;

public class FindTrialZero {
    public static void main(String[] args) {
        int n=12;
        int res=0;
        for (int i = 5; i <=n ; i=i*5) {
            res=res+n/i;
        }
        System.out.println(res);
    }

    public static class Factorial {
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
}
