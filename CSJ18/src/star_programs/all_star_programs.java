package star_programs;

import java.util.ArrayList;

public class all_star_programs {
    public static void main(String[] args) {
//        power_star(5);
//        left_star(5);
//        right_star(5);
//        triangle(10);
//        number_triangle(9);
//        palindrome_number_triangle(7);
        pattern_7(5);
//        pattern_5(10);
//        System.out.println(9000+10300+12000);
//        System.out.println(15000-10300);
//        System.out.println(41700-15000);
//        System.out.println(26700-10300-9000);
//        System.out.println(510/4.66);


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            arrayList.add(i);
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(arrayList.get(i));
        }
    }




    public static void power_star(int lines)
    {
        for(int i=1;i<=lines;i++)
        {
            for(int j=lines-i;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=lines;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void left_star(int lines)
    {
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=lines-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void right_star(int no_of_lines)
    {
        for(int i=1;i<=no_of_lines;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int k=1;k<=no_of_lines-i;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }



    public static void triangle(int no_of_lines)
    {
        for (int i=1;i<=no_of_lines;i++)
        {
            for (int k=1;k<=no_of_lines-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void number_triangle(int no_of_lines)
    {
        for(int i=1;i<=no_of_lines;i++)
        {
            for(int j=1;j<=no_of_lines-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }



    public static void palindrome_number_triangle(int lines)
    {
        int count=0;
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=lines-i;j++)
            {
                System.out.print(". ");
            }
            for (int j=lines-count;j>=lines-count;j++)
            System.out.println();
//            for (int k=i;k>0;k--)
//            {
//                System.out.print(i);
//            }
//            for(int l=2;l<=i;l++)
//            {
//                System.out.print(l);
//            }
//            System.out.println();
        }
    }



    public static void pattern_1(int lines)
    {
//           *
//           **
//           ***        pattern_1
//           ****
//           *****
//           ******

        for (int i=1; i<=lines;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void pattern_2(int lines)
    {
//           *
//          **
//         ***         pattern_2
//        ****
//       *****
//      ******
        for(int i=1;i<=lines;i++)
        {
            for (int j=1;j<=lines-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void pattern_3(int lines)
    {
//     ******
//     *****
//     ****         pattern_3
//     ***
//     **
//     *
        int count=0;
        for(int i=1;i<=lines;i++)
        {
            for (int j=1;j<=lines-count;j++)
            {
                System.out.print("*");
            }
            count++;
            System.out.println();
        }
    }



    public static void pattern_4(int lines)
    {
//     *****
//      ****
//       ***         pattern_4
//        **
//         *
        int count=0;
        for(int i=1;i<=lines;i++)
        {
            for (int j=1;j<=count;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=lines-count;k++)
            {
                System.out.print("*");
            }
            count++;
            System.out.println();
        }
    }


    public static void pattern_5(int lines)
    {
//        *
//       ***
//      *****         pattern_5
//     *******
        int c=1;
        for (int i=1;i<lines;i++)
        {
            for (int k=1;k<=lines-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            c+=2;
            System.out.println();
        }
    }



    public static void pattern_6(int lines)
    {
//      *******
//       *****
//        ***         pattern_6
//         *

        int space=1;
        int count=lines+(lines-1);
        for(int i=0;i<lines;i++)
        {
            for (int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=count;k++)
            {
                System.out.print("*");
            }
            count-=2;
            System.out.println();
        }
    }


    public static void pattern_7(int lines)
    {
//         *
//        ***
//       *****               pattern_7
//      *******
//       *****
//        ***
//         *


        if(lines%2==0)
        {
            lines++;
        }
        int half = lines/2;

        for(int i=1;i<=(half+1);i++)
        {
            for(int j=1;j<=(half+1)-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int newcount=1;
        for (int i=(half+2);i<=lines;i++)
        {

            int count=half;
            for(int j=1;j<=(i-half)-1;j++)
            {
                System.out.print(" ");
            }
//            for(int k=lines-newcount;k<)
            for(int k=1;k<=(newcount*2)-1 && count<lines;k++)                               // so what we can do to print 3 and 1 stars.
            {
                System.out.print("*");
                count++;
                newcount++;
            }
            System.out.println();
        }
    }


}