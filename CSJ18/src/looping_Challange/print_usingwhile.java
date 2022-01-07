package looping_Challange;

public class print_usingwhile
{
    public static void main(String[] args) {
        int number=1;
        int sum=0;
        while (number<11)
        {
            sum+= number;
            number++;
        }
        System.out.println(sum);
    }
}
