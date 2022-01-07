package random_practice;

public class MegaByte_Converter
{
    public static void main(String[] args) {
        printMegaByteAndKiloByte(1024);
    }
    public static void printMegaByteAndKiloByte(int kiloByte)
    {
        if(kiloByte<0)
            System.out.println("invalid input");
        else {
            int temp = kiloByte % 1024;
            System.out.println(kiloByte + " KB = " + (kiloByte / 1024) + " MB and " + temp + " KB");
        }
    }
}
