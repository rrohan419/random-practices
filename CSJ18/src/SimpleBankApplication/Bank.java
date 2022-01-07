package SimpleBankApplication;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches ;
    private String BankName;

    public Bank(String bankName) {
        BankName = bankName;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String branchname)
    {
        if(if_exists(branchname)==null) {
            branches.add(new Branch(branchname));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialamount)
    {
        Branch branch = if_exists(branchName);
        if(branch!=null)
        {
            return branch.addNewCustomer(customerName,initialamount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customer_Name, double amount)
    {
        Branch branch = if_exists(branchName);
        if(branch!=null)
        {
            branch.addCustomerTransaction(customer_Name,amount);
            return true;
        }
        return false;
    }
    private Branch if_exists(String bankName)
    {
        for (Branch branch:branches)
        {
            if (branch.getBranch_Name().equals(bankName))
            {
                return branch;
            }
        }
        return null;
    }
    public Branch listCustomer(String branchName,boolean transaction)
    {
        Branch branch = if_exists(branchName);
        if(branch!=null)
        {
            branch.getCustomers();
            if(transaction)
            {
                branch.getTransactions();
            }
        }
        return null;
    }

}
