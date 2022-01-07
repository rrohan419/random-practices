package random_practice;

public class speed_converter
{
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(-10.25));
        printConversion(1.5);
    }
    public static long toMilesPerHour(double kilometerPerHour)
    {
        if(kilometerPerHour<0)
        {
            return -1;
        }

        return  Math.round(kilometerPerHour*0.62137119);
    }
    public static void printConversion(double kilometerPerHour)
    {
        if(kilometerPerHour<0)
        {
            System.out.println("invalid Value");
        }
        else
        {
            double miles = Math.round(kilometerPerHour*0.62137119);
            System.out.println(kilometerPerHour+" km/h = "+miles+" mi/h");
        }
    }
}
