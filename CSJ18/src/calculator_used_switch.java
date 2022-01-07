import java.util.Scanner;

public class calculator_used_switch
{
    public static void main(String[] args) {
        calculate();
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void calculate()
    {
        int result=0;
        System.out.println("press 1 for addition\npress 2 for subtraction\npress 3 for multiplication\npress 4 for division");
        int operation = scanner.nextInt();
        if(operation>0 || operation<5)
        {
//            System.out.print("enter the numbers of operands you want ");
//            int number_operands = scanner.nextInt();
            int[] operand= new int[2];
//            System.out.println("enter the numbers.");
            for(int i=0;i<operand.length;i++)
            {
                System.out.print((i+1)+". ");
                operand[i]=scanner.nextInt();
            }
            switch (operation)
            {
                case 1:
                    for(int i=0;i<operand.length;i++)
                    {
                        result+= operand[i];
                    }
                    System.out.println("sum is "+result);
                    break;
                case 2:
                    result = operand[0]-operand[1];
                    System.out.println("subctraction result "+result);
                    break;
                case 3:
                    result = operand[0]*operand[1];
                    System.out.println("multiplication result "+result);
                    break;
                case 4:
                    result = operand[0]/operand[1];
                    System.out.println("division result "+result);
                    break;
            }

        }
    }
}
