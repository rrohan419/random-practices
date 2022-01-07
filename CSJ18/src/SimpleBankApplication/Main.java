package SimpleBankApplication;

public class Main {
    public static void main(String[] args) {
        Bank hdfc = new Bank("HDFC");
        hdfc.addBranch("gaya_branch");
        hdfc.addBranch("patna_branch");

        hdfc.addCustomer("patna_branch","Rohan",1000);
        hdfc.addCustomer("patna_branch","sachin",1000);
        hdfc.addCustomer("patna_branch","mehul",1000);
        hdfc.addCustomer("gaya_branch","ayush",230100);
        hdfc.addCustomerTransaction("patna_branch","Rohan",2500);

        hdfc.listCustomer("patna_branch",true);
        hdfc.listCustomer("gaya_branch",true);
    }
}
