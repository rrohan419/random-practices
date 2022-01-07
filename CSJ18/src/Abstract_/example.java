package Abstract_;

public abstract class example {
    abstract void sendmessage(String message);

}
abstract class  B extends example
{
    abstract void whatsappmessage(String message);

    @Override
    void sendmessage(String message) {
        System.out.println(message.toString());
    }
}
class  main extends B
{
    public static void main(String[] args) {
        main m = new main();
        m.sendmessage("hey boyy");
        m.whatsappmessage("abcd");
    }
    @Override
    void whatsappmessage(String message) {
        System.out.println(message+" main class");
    }

    @Override
    void sendmessage(String message) {
        System.out.println(message+" main class send message method");
    }
}
