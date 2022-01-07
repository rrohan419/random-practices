package set_Pracctice;

import java.util.Set;

public class treesetPractice
{
    public static void main(String[] args) {
        method_name_unkownn(10,999);
    }
    public static void method_name_unkownn(int from, int to)
    {
        boolean flag = false;
        for (int i=from;i<=to;i++) {

            int number = i;
            int temp2=0;
            while (number > 0)       // number =102
            {

                int temp1 = number % 10;     // temp1=2;
                number /= 10;               // number = 10;
                if(number==0 && temp2 - temp1 == 1 || temp2 - temp1 == -1 || temp1-temp2 == 1||temp1-temp2==-1) {
                        flag = true;
                }
                temp2 = number % 10;    // temp2 = 0
                number/=10;         //number =1;
                if (temp2 - temp1 == 1 || temp2 - temp1 == -1 || temp1-temp2 == 1||temp1-temp2==-1) {
                    flag = true;
                }
                else
                {
                    flag=false;
                    break;
                }

            }
            if (flag)
                System.out.println(i);
        }

    }
}
