package looping_Challange;

public class math_table
{
    public static void main(String[] args) {
        table(13);
    }
    public static void table(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+" * "+i+" = "+(number*i));
        }
    }
}
