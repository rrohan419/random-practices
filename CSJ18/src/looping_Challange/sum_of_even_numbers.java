package looping_Challange;

import java.util.Scanner;

public class sum_of_even_numbers
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {

//        System.out.print("How many number : ");
//        int num = scanner.nextInt();
//        System.out.println(sum(num));
        System.out.println(sumofeven(10));


    }
    public static int sumofeven(int number)
    {
        int sum=0;

        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
