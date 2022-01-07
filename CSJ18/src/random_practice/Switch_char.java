package random_practice;

import java.util.Locale;
import java.util.Scanner;

public class Switch_char
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Character you want to search : ");
        char c = scanner.nextLine().toUpperCase().charAt(0);
        switch (c)
        {
            case 'A': case 'B': case 'C': case 'D': case 'E' :
                System.out.println("The provided char value is "+c);
                break;
            default:
                System.out.println("A,B,C,D,E not found");
        }

    }
}
