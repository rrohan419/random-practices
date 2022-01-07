public class odd_Even
{

    public static void isodd_even(int number)
    {
        if(number%2==0)
            System.out.println(number+" is an even number");
        else if(number <=0)
            System.out.println("wrong entry");
        else
            System.out.println(number+" is an odd number");
    }
}
