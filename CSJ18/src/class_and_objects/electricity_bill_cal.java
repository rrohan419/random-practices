package class_and_objects;

public class electricity_bill_cal
{
    public static void main(String[] args) {
        electricity_bill_cal rohan = new electricity_bill_cal(240);
        electricity_bill_cal shalni = new electricity_bill_cal(330);
        electricity_bill_cal yogesh = new electricity_bill_cal(20);
        electricity_bill_cal mukul = new electricity_bill_cal(80);
        electricity_bill_cal vaishavi = new electricity_bill_cal(-40);

    }

    private int number_of_units_consumed;

    public electricity_bill_cal(int number_of_units_consumed) {
//        this.number_of_units_consumed = number_of_units_consumed;
        if(number_of_units_consumed>0 && number_of_units_consumed<=30)
        {
            System.out.println("you used "+number_of_units_consumed+" units.\nyour bill at Rs 1.50 per unit is Rs "+number_of_units_consumed*1.50);
        }
        else if(number_of_units_consumed>30 && number_of_units_consumed<=300)
        {
            System.out.println("you used "+number_of_units_consumed+" units.\nyour bill at Rs 3.00 per unit is Rs "+number_of_units_consumed*3.00);
        }
        else if(number_of_units_consumed>300)
        {
            System.out.println("you used "+number_of_units_consumed+" units.\nyour bill at Rs 4.25 per unit is Rs "+number_of_units_consumed*4.25);
        }
        else
            System.out.println("invalid input");
    }
}
