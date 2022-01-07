public class eligible_vote
{
    public static void isadult(int age)
    {
        if(age>=18 && age<150)
            System.out.println("the adult is eligible for voting");
        else if(age<=0)
        {
            System.out.println("age cant be less than 0");
        }
        else
            System.out.println("not eligible for  voting");

    }
}
