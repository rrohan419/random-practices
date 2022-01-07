package set_Pracctice;

public class Seat implements Comparable<Seat> {
    private String seatNumber;
    private boolean reserve=false;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Seat seat = (Seat) obj;
        if(this.seatNumber.compareTo(((Seat) obj).seatNumber)==0)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Seat o) {
        return this.seatNumber.compareTo(o.seatNumber);
    }

    public Seat(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
    public boolean reserve()
    {
        if(!reserve) {
            System.out.println(getSeatNumber() + " is now reserved");
            this.reserve = true;
            return true;
        }
        else
            return false;
    }
    public boolean cancle() {
        if (this.reserve) {
            this.reserve = false;
            System.out.println(getSeatNumber()+" successfully cancled");
            return true;
        }
        else
        {
            System.out.println("not reserved");
            return false;
        }
    }
}
