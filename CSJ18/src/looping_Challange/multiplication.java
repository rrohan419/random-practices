package looping_Challange;

public class multiplication                // without using the multiplication sign
{
    public static void main(String[] args) {
        System.out.println(multiply(8,9));
    }
    public static int multiply(int number1,int number2)
    {
        // 8*9=6
        // 9+9+9+9+9+9+9+9=71
        int result=0;
        for(int i=0;i<number1;i++)
        {
            result=result+number2;
        }
        return result;
    }
}
