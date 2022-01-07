package set_Pracctice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Theatre
{
//    public static void main(String[] args) {
//        Theatre theatre = new Theatre("mangla Theatre",10,5);
//        theatre.getSeatList();
//    }
     private String theatre_name;
     public List<Seat> seatList = new ArrayList<>();

     public static Comparator<Seat> seatComparator;
     static {
         seatComparator =(o1,o2) ->(o1.getSeatNumber().compareTo(o2.getSeatNumber()));// new Comparator<Seat>() {
//         {
//             @Override
//             public int compare(Seat o1, Seat o2) {
//                 int a = o1.getSeatNumber().compareTo(o2.getSeatNumber());
//                 if(a==0)
//                 {
//                     return 0;
//                 }
//                 else if(a>0)
//                 {
//                     return 1;
//                 }
//                 else
//                     return -1;
//             }
//         };
     }

    public Theatre(String theatre_name, int num_rows, int seats_per_Rows)
    {
        this.theatre_name = theatre_name;
        int last_row = 'A'+(num_rows-1);
        for(char i='A';i<=last_row;i++)
        {
            for(int j=1;j<=seats_per_Rows;j++)
            {
                Seat seat=new Seat(i+String.format("%02d",j));
                seatList.add(seat);
            }
        }
    }

    public void reserve(String seatnumber)
    {
        Seat seat = new Seat(seatnumber);
        if(seat.reserve())
        {
            System.out.println(seatnumber+" already reserved");
        }
        else
        {
            seat.reserve();
            System.out.println(seat.getSeatNumber()+" is now reserved");
        }
    }

    public void getSeatList() {
        for (Seat seat : seatList)
        {
            System.out.println(seat.getSeatNumber());
        }
    }
}
