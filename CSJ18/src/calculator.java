import java.util.Scanner;

public class calculator
{
    public static void main(String[] args) {
        calc();
    }
    public static Scanner scanner= new Scanner(System.in);
    public static void calc()
    {
        int result=0;
        System.out.print("how many numbers you want to perform arithmetic operation : ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        for(int i=0; i<num; i++)
        {
            System.out.print((i+1)+" number :" );
           numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("press 1 for addition\npress 2 for subtraction\npress 3 for multiplication\npress 4 division");

        int pressed = scanner.nextInt();
        switch (pressed)
        {
            case 1:
                    for (int i=0; i<num;i++)
                    {
                      result+=numbers[i];
                    }
                    System.out.println("result : "+result);
                    break;
            case 2:
                for (int i=0; i<num;i++)
                {
                    result-=numbers[i];
                }
                System.out.println("result : "+result);
                break;
            case 3:
                result=1;
                for (int i=0; i<num;i++)
                {
                    result*=numbers[i];
                }
                System.out.println("result : "+result);
                break;
            case 4:
                result=1;
                for (int i=0; i<num;i++)
                {
                    result/=numbers[i];
                }
                System.out.println("result : "+result);
                break;
        }
    }
}
