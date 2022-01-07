package looping_Challange;

public class sum_of_digit
{
    public static void main(String[] args) {
        System.out.println(sum_of_digits(123));
    }
    public static int sum_of_digits(int number)
    {
        int sum=0;
        while (number!=0)
        {
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }
}
