package SimpleBankApplication;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.SortedMap;

public class Branch {
    private ArrayList<Customer> customers;
    private String branch_Name;

    public Branch(String branch_Name) {
        this.branch_Name = branch_Name;
        this.customers = new ArrayList<>();
    }

    public String getBranch_Name() {
        return branch_Name;
    }

    public  boolean addNewCustomer(String name, double initial_amount)
    {

        if(if_exists(name)!=null)
        {
            return false;
        }
        Customer customer = new Customer(name.toLowerCase(),initial_amount);
        customers.add(customer);
        return true;
    }
    public boolean addCustomerTransaction(String customer_Name, double amount)
    {
        Customer existingCustomer = if_exists(customer_Name);
        if(existingCustomer!=null)
        {
            existingCustomer.credit_amount(amount);
            return true;
        }
        return false;
    }

    private Customer if_exists(String name)
    {
        for (Customer customer : customers)
        {
            if(customer.getName().equals(name))
                return customer;

        }
        return null;
    }

    public void getCustomers() {
        for (Customer customer :customers)
        {
            System.out.println(customer.getName());
        }
    }
    public void getTransactions()
    {
        for (Customer customer : customers)
        {
            System.out.println(customer.getName()+" : "+customer.getTransaction());
        }
    }
}
