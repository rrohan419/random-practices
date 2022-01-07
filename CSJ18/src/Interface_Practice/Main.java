package Interface_Practice;

public class Main
{
    public static void main(String[] args) {
        DeskPhone deskPhone = new DeskPhone(12345);
        deskPhone.powerOn();
        deskPhone.callPhone(12345);
        System.out.println(deskPhone.isRinging());
        deskPhone.answer();
        System.out.println(deskPhone.isRinging());
    }
}
