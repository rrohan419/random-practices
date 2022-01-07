package random_practice;

import java.util.Arrays;
import java.util.Scanner;

public class smallest_largest_numbers_using_array
{
    public static void main(String[] args) {

    }
    public static Scanner scanner = new Scanner(System.in);
    public static void numbers(int number)
    {
        int[] num = new int[number];
        System.out.println("Enter "+number+" numbers :");
        for(int i=0;i<number;i++)
        {
            System.out.print((i+1)+". ");
            num[i]=scanner.nextInt();
            scanner.nextLine();
        }
    }
}
