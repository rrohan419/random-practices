package random_practice;

import java.util.Scanner;

public class ArrayPractice
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {2,3,4,5,7,9};
        removeArray(array);
        printarray(array);
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array;
//        System.out.print("how many values you want to enter : ");
//        int size= scanner.nextInt();
//        array = new int[size];
//        System.out.println("Enter the numbers : ");
//        for (int i=0;i< array.length;i++)
//        {
//            array[i]= scanner.nextInt();
//        }
//        System.out.println("The numbers you have entered are now multiplied by 6 and the results are ");
//        for (int i=0;i< array.length;i++)
//        {
//            System.out.println(array[i]*6);
//        }
//    }

    public static void printarray(int[] array)
    {
        for (int i : array)
        {
            System.out.print(i+", ");
        }
    }
    public static void peakArray()
    {
        int[] array = {2,3,4};
        int n= 3;
        for(int i=0;i<array.length;i++)
        {
            int number= 0;
//            int number= array[i];
            if(n==array[i]) {
                if (i < array.length - 1) {
                    if (array[i - 1] < n && array[i + 1] < n) {
                        System.out.println(1);
                    } else
                        System.out.println(0);

                }
                else
                {
                    if(array[i-1]<n)
                    {
                        System.out.println(1);
                    }
                    else
                        System.out.println(0);
                }
            }
        }
    }
    public static void minMaxArray()
    {
        int[] array = {3,2,5,4,543,54,3};

        int temp=0;
        int temp2=0;
        int min=Integer.MAX_VALUE;
//        System.out.println(min);
//        System.out.println(min);
        int max=Integer.MIN_VALUE;
        for (int number : array) {
            if (number<min)
            {
                min = number;
            }
            if (number>max) {
                max = number;
            }
//            for (int j=1;j<array.length;j++)
//            {
//                if(array[i]<array[j])
//                {
//                    temp=array[i];
//                }
//                if(array[i]>array[j])
//                    temp2=array[i];
//
//
//            }
        }
        System.out.println("mim : "+min+" max : "+max);
    }
    public static int[] reversingArray(int[] array)
    {
        int temp=0;                 //array = {2,3,4,5,7,9}

        int last_index = (array.length-1);
        int half= array.length/2;
        for (int i=0;i<half;i++) {
            temp = array[i];
            array[i] = array[last_index - i];
            array[last_index - i] = temp;


        }
        return array;


//            for (int j=array.length-1;j>half;j--)
//            {
//                int tempvar = array[i];
//                array[i] = array[j];
//                array[j] = tempvar;
//            }

    }
    public static int[] removeArray(int[] array)
    {
        System.out.print("enter the array element you want to delete : ");           //int[] array = {2,3,4,5,7,9};
        int temp=0;
        int key = scanner.nextInt();
        for(int i=0;i<array.length-1;i++)
        {
            if(key==array[i])
            {
               array[i]=0;
               for(int j = i;j< array.length-1;j++)
               {
                   temp = array[j+1];
                   array[j+1]=array[j];
                   array[j]=temp;
               }
            }
        }

        return array;
    }




























}
