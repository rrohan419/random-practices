package random_practice;

import java.util.Scanner;

public class ArrayLinarSearch
{
    public static void main(String[] args) {
        int[] array = {1,2,5,4,5,66,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you wanna serch in the array : ");
        double in = scanner.nextDouble();
        int number = scanner.nextInt();
        for (int i=0;i< array.length;i++)
        {
            if(number==array[i])
            {
                System.out.println(number+" was found in the array at the index number "+(i+1));
                break;
            }
        }
    }
}
