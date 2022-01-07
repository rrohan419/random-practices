public class multipleoffive
{
    public static void main(String[] args) {
        multiple5(15);
    }
    public static void multiple5(int number)
    {
        if(number%5==0)
            System.out.println(number+" is divisible by 5.");
        else
            System.out.println("not divisible by 5");
    }
}
