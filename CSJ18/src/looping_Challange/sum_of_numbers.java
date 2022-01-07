package looping_Challange;

import java.util.Scanner;

public class sum_of_numbers
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.print("How many numbers you want to add : ");
        int num = scanner.nextInt();
        System.out.println(sum(num));


    }
    public static int sum(int number)
    {
        int sum=0;
        int result;
        for(int i=0;i<number;i++)
        {
            System.out.print((i+1)+". ");
            result = scanner.nextInt();
            sum+=result;
        }
        return sum;
    }
}
