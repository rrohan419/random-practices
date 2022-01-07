package Impleminting_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LearninglinkedList {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("patna");
        linkedList.add("varanasi");
        linkedList.add("gaya");
        addInOrder(linkedList,"delhi");
        addInOrder(linkedList,"delhi");
        addInOrder(linkedList,"indore");
        System.out.println(linkedList);
        visit(linkedList);
    }
    private static void visit(LinkedList<String> cities)
    {
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty())
        {
            System.out.println("there are no cities for us to show you");
        }
        else
        {
            System.out.println("now visiting "+listIterator.next());
            printMenu();
        }

        boolean quit=false;
        boolean goimgFOrward=false;

        while(!quit)
        {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    if(!goimgFOrward)
                    {
                        if(listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        goimgFOrward= true;
                    }
                    if (listIterator.hasNext())
                    {
                        System.out.println("now visiting "+listIterator.next());
                    }
                    else
                    {
                        System.out.println("This is the last city in the list");
                        goimgFOrward=false;
                    }
                    break;

                case 1:
                    if(goimgFOrward)
                    {
                        if(listIterator.hasPrevious())
                            listIterator.previous();
                        goimgFOrward=false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("now visiting "+listIterator.previous());
                    }
                    else
                    {
                        System.out.println("this is the first city in the list.");
                        goimgFOrward=true;
                    }
                    break;


                case 2:
                    printMenu();
                    break;


                case 3:
                    System.out.println("Time to quit the fun");
                    quit=true;
                    break;
                default:
                    System.out.println("wrong entry");
                    break;
            }
        }
    }
    private static void printMenu()
    {
        System.out.println("Avalaible choices :");
        System.out.println("press\t");
        System.out.println("0 -- To visit the next city\n" +
                           "1 -- To visit the previous city\n" +
                           "2 -- To print the menu\n" +
                           "3 -- Quit");
    }
    public static boolean addInOrder(LinkedList<String> list, String newCityName)
    {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext())
        {
            int compare = listIterator.next().compareTo(newCityName);
            if(compare==0)
            {
                System.out.println(newCityName+" is already in the list");
                return false;
            }
            else if (compare>0)
            {
                listIterator.previous();
                listIterator.add(newCityName);
                return true;
            }
            else if (compare<0)
            {
            }
        }
        listIterator.add(newCityName);
        return true;
    }
}
