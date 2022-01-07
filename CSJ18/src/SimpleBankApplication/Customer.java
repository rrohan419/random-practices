package SimpleBankApplication;

import java.util.ArrayList;

public class Customer
{
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double initial_amount) {
        this.name = name;
        this.transaction = new ArrayList<>();
        credit_amount(initial_amount);
    }

    public String getName() {
        return name;
    }
    public boolean credit_amount(double amount)
    {
        if(amount<0.0)
            return false;
        transaction.add(amount);
        return true;
    }

    public Double getTransaction() {
        ArrayList<Double> transactions;
         for (int i=0;i<transaction.size();i++)
        {
            return transaction.get(i);
        }
        return 0.0;
    }
}
