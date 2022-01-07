public class number_biggest
{
    public static void biggest_number(int a,int b, int c)
    {
        if(a>b && a>c)
            System.out.println(a+" is the biggest in the given 3 numbers");
        else if(b>a && b>c)
            System.out.println(b+" is the largest number");
        else
            System.out.println(c+" is the largest of all");
    }
}
