package random_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBinarySearch
{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,8,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want to search : ");
        int number = scanner.nextInt();         //8
        int low=0;
        int high = array.length-1;   //4
        int mid = (low+high)/2;
        boolean flag=false;
        while (low<high)
        {
            if(array[mid]>number)
            {
                high=mid;
                mid = (low+high)/2;
            }
            else if(array[mid]<number)
            {
                low = mid;
                mid = (low+high)/2;
            }
            else if(array[mid]==number)
            {
                flag=true;
                break;
            }
        }
        System.out.println((flag)?"found":"not found");
    }
}
