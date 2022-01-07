import java.util.Scanner;

public class isvowel
{
    public static void is_vowel()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or a character ");
        char ch= scanner.next().charAt(0);
        if(ch=='a'||ch=='A' ||
           ch=='e' ||ch=='E' ||
            ch=='i' || ch=='I' ||
            ch=='o' || ch=='O' ||
            ch=='u' || ch=='U')
        {
            System.out.println("it has its first character as a vovel");
        }
        else
            System.out.println("not a vovel the first word.");
    }
}
