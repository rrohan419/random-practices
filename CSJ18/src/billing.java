import java.util.Scanner;

public class billing
{
    public static void main(String[] args) {
        final_bill();
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void final_bill()
    {

        int quantity, discount=10;
        float rate, calc_amt,final_bill;
        System.out.print("enter the MRP of the product :");
        int amount = scanner.nextInt();
        if(amount<5000)
        {
            calc_amt = (float) (amount*discount)/100;
            final_bill = amount-calc_amt;
            System.out.println("Final price after discount of "+discount+"% is"+" : "+final_bill);
        }
        else if(amount>=5000 && amount<10000)
        {
            discount = 15;
            calc_amt = (float) (amount*discount)/100;
            final_bill = amount-calc_amt;
            System.out.println("Final price after discount of "+discount+"% is"+" : "+final_bill);
        }
        else if(amount>=10000 && amount<20000)
        {
            discount=20;
            calc_amt = (float) (amount*discount)/100;
            final_bill = amount-calc_amt;
            System.out.println("Final price after discount of "+discount+"% is"+" : "+final_bill);
        }
        else if(amount>=20000)
        {
            discount=50;
            calc_amt = (float) (amount*discount)/100;
            final_bill = amount-calc_amt;
            System.out.println("Final price after discount of "+discount+"% is"+" : "+final_bill);
        }
        else
        {
            System.out.println("it's totally yours fault.");
        }

    }
}
