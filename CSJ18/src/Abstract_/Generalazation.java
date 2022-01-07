package Abstract_;

import java.util.Scanner;

public class Generalazation
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Father father =  new Son();
        father.work();
//        int i=1,j=2,k=3;
//        int m = (i-- - j-- - k--);
//        System.out.println(m);
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k);
        System.out.print("how many lines of diamond you need  always more that 2 or prefer odd numbers : ");
        int line = scanner.nextInt();
        if(line%2==0)
        {
            line++;
        }
        int half = line/2;
        for(int i=1;i<=line;i++)
        {
            for (int j=1;j<=(half-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=((i)*2)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int count =1;
        for(int i=line/2;i>=1;i--) {
            for (int j = line; j >= (count * 2) - 1; j--) {
                System.out.print("#");
                count++;
            }
            System.out.println();
        }
    }
}
class Father
{
    public void work()
    {
        System.out.println("father work hard to earn");
    }

}
class Son extends Father
{
    @Override
    public void work() {
        System.out.println("sON ALSO earns");
    }

    public void play()
    {
        System.out.println("Son just spend money");
    }
}
