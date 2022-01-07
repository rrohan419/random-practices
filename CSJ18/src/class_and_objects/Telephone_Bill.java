package class_and_objects;

public class Telephone_Bill

{
    public static void main(String[] args) {
        Telephone_Bill telephone_bill = new Telephone_Bill("Rohan","G-304 Three Jewels",866836,229);
    }

    private String name,address;
    private int phone_number,no_Of_Calls;

    public Telephone_Bill(String name, String address, int phone_number, int no_Of_Calls) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.no_Of_Calls = no_Of_Calls;
        bill();
    }
    public void bill()
    {
        System.out.println(toString());
        System.out.println(this.name+ " your Outstanding amount is Rs "+(no_Of_Calls*2));
    }

    @Override
    public String toString() {
        return "Customer Detail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number=" + phone_number +
                ", no_Of_Calls=" + no_Of_Calls +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public int getNo_Of_Calls() {
        return no_Of_Calls;
    }
}
