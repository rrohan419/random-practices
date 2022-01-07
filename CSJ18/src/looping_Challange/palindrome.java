package looping_Challange;

import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number you want to check for a plaindrome :");
        int n = scanner.nextInt();
        int palindrome =reverse(n);
        if(palindrome==n)
        {
            System.out.println(n+" is a palindrome.");
        }
        else
            System.out.println(n+" is not a palindrome");
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
