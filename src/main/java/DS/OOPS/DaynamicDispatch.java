package DS.OOPS;

public class DaynamicDispatch {
    public static void main(String[] args) {
        //B a= (A)new A();//class cast Exception
        A a=new B();
        a.test();
    }
}

