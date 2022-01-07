package looping_Challange;

public class number_Reverse
{
    public static void main(String[] args) {
        System.out.println( reverse(13456221));
    }
    public static int reverse(int number)
    {
        int digit=0;
        int num=0;
        int rev=0;
        while (number!=0)
        {
            digit = number % 10;
            number = number/10;
            rev = (rev*10)+digit;
        }
        return rev;
    }
}
