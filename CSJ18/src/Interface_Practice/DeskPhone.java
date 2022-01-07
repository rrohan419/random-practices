package Interface_Practice;

public class DeskPhone implements Telephone{

    private long myPhoneNumber;
    private boolean isRinging;

    public DeskPhone(long myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("its always connected dumb its a DeskPhone.");
    }

    @Override
    public void dial(long phone_Number) {
        System.out.println("Now Dialing "+phone_Number+" number");
    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("Answering the phone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(long phone_number) {
        if(phone_number==myPhoneNumber)
        {
            isRinging=true;
            System.out.println("Ring ring");
        }
        else
            isRinging=false;
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
