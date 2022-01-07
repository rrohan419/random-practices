package looping_Challange;

public class power
{
    public static void main(String[] args) {
        System.out.println( powerof(2,5));
    }
    public static int powerof(int base,int power)
    {
        int result=1;
        for(int i=0;i<power;i++)
        {
            result*=base;
        }
        return result;
    }
}
