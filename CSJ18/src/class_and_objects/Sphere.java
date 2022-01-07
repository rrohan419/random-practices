package class_and_objects;

import java.util.Scanner;

public class Sphere
{
    public static void main(String[] args) {
        Sphere sphere = new Sphere(14);
    }
    public static Scanner scanner = new Scanner(System.in);
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
        System.out.println("what you want to find surface area or volume");
        String print = scanner.nextLine().toLowerCase();
        if(print.toString().equals("surface area"))
        {
            System.out.println("Surface area "+(4*Math.PI*(radius*radius)));
        }
        else if(print.toString().equals("volume"))
        {
            System.out.println("volume is "+((4/3)*Math.PI*(radius*radius*radius)));
        }
        else
            System.out.println("invalid input");
    }
}
