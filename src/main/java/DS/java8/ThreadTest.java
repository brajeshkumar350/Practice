package DS.java8;

public class ThreadTest {
    public static void main(String[] args) {
    A a=new A();
    B b=new B();
    a.start();
    b.start();

    }
}
class A extends Thread
{
    public void  run()
    {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Thread A--");

                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread
{
    synchronized public void  run()
    {
        for (int i = 0; i < 5; i++) {
                System.out.println("Thread B--");

        }
    }
}
