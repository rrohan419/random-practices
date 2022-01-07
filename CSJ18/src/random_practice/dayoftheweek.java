package random_practice;

public class dayoftheweek
{
    public static void main(String[] args) {
        printdayoftheweek(5);
        DaysoftheWeek(6);
        printNumberinWords(3);
        isleapyear(1999);
    }

    // To print days of the week using switch case statement.


    public static void printdayoftheweek(int day)
    {
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("yeahhh it's Friday");
                break;
            case 6:
                System.out.println("Saturday came");
                break;
            case 7:
                System.out.println("Sunday is here.");
                break;
            default:
                System.out.println("wrong entry that can't be good");
        }
    }


    // To print Days using if-else statement.

    public static void DaysoftheWeek(int day)
    {
        if(day==1)
        {
            System.out.println("monday");
        }
        else if(day==2)
        {
            System.out.println("tuersday");
        }
        else if(day==3)
        {
            System.out.println("wednesday");
        }
        else if(day==4)
            System.out.println("thursday");
        else if(day==5)
            System.out.println("Friday");
        else if(day==6)
            System.out.println("Saturday");
        else if (day==7)
            System.out.println("Sunday");
        else
            System.out.println("invalid input");
    }



    // To print Whole number in words


    public static void printNumberinWords(int whole_number)
    {
        switch (whole_number)
        {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }




    // Leap year program


    public static boolean isleapyear(int year)
    {
        if(year<1 || year>9999) {
            System.out.println("invlid input");
            return false;
        }
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println(year+" is a leap year.");
            return true;
        }
        else {
            System.out.println("not a leap year");
            return false;
        }
    }
}
