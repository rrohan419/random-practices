package Learning_Thread;

public class Thread1 implements Runnable
{
    @Override
    public void run() {
        System.out.println("run");
        throw new RuntimeException("problem");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
        thread.start();
        System.out.println("End of Method");
    }
}
abstract class bike{
    private int a;
    private int b;
    public abstract void get(int a , int b);
    public void setAnchor(int  a,int b)
    {
        this.a=a;
        this.b=b;
    }

}


