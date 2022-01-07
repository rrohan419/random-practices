package looping_Challange;

public class armstrong_number
{
    public static void main(String[] args) {
        System.out.println(armstrong(152));
    }
    public static boolean armstrong(int number)
    {
        int sum = 0;
        int original = number;
        while (number!=0)
        {
            int num = 0;
            int temp = 0;

            temp = number % 10;
            num = temp * temp * temp;
            sum += num;
            number /= 10;
        }
        return original == sum;

    }
}
