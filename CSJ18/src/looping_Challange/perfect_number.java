package looping_Challange;

public class perfect_number
{
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(is_perfect(i))
                System.out.println(i);
        }
    }
    public static boolean is_perfect(int number)
    {
        int sum=0;
        for(int i=1; i<number;i++)
        {
            if(number%i==0)
            {
                sum+=i;
            }
        }
        return number == sum;
    }
}
