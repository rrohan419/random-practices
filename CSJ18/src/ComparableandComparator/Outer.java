package ComparableandComparator;

public class Outer
{
    public static void outerdisplay()
    {
        System.out.println("outer static outerdisplay method");
    }
    public void outerdisp()
    {
        System.out.println("outer class instance method");
    }
    static class inner{
        public static void display()
        {
            System.out.println("inner class static display method");
        }
        public void disp()
        {
            System.out.println("inner class instance disp method.");
        }
    }
}
