package looping_Challange;

public class division                           // without '/','%' operators
{
    public static void main(String[] args) {
        div(7,896);
        System.out.println(7*128);
    }
    public static void div(int divisor, int divident)
    {
        int remainder=0;
        int quoitent =0;
        int count=0;

        while(divident!=0 || divident<divisor)
        {
            divident -= divisor;
            count++;
            if(divident==0 || divident<divisor)
            {
                remainder=divident;
                quoitent=count;
                break;
            }
        }
        System.out.println("remainder : "+remainder+" \nquoitent : "+quoitent);
    }
}
