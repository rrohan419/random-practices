package random_practice;

import set_Pracctice.Seat;
import set_Pracctice.Theatre;

import java.io.OutputStream;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
//       String str = "cyber success cyber success";
//
//        HashMap<String,Integer> hashMap = new HashMap<>();
//
//        for (String a : str.split(" "))
//        {
//            if(hashMap.containsKey(a))
//            {
//                hashMap.put(a,hashMap.get(a)+1);
//            }
//            else
//                hashMap.put(a,1);
//        }
//        System.out.println(hashMap);


        //        for (int i=1;i<=5;i++)
//        {
//            System.out.println("15000 at "+i+"% intrest is "+(calculate_intrest(15000,i)));
//        }
//        System.out.println(sumofall(1,1900));
//        System.out.println(isodd(8));
//        System.out.println(greatestCommonDivisor(25,15));
//        printFactor(66);
//        System.out.println(perfect_number(8128));
//        System.out.println(reverse(123));
//        System.out.println(3!=3);





//        int i=0;
//        i=i++ - --i + ++i - i--;
//        System.out.println(i);
//        int i=1;
//        int j=2;
//        int k=3;
//        int m= i-- - j-- - k--;
//        System.out.println(m);
//                System.out.println(charat("my name is",6));


//        int a=11;
//        int b=22;
//        int c=(a+b + a++ + b++ + ++a + ++b);
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(a);
//        Scanner scanner = new Scanner(System.in);
//        char ch = scanner.next().charAt(1);
//        System.out.println(ch);
//        Main m = new Main();
//        System.out.println(m.romanToInt("LVIII"));
        int[] num = {4,1,2,7,5,3,1};
        System.out.println(rob(num));


        Theatre theatre = new Theatre("mangla", 8,10);
        List<Seat> copyList = new ArrayList<Seat>(theatre.seatList);
        printList(copyList);
        Collections.shuffle(copyList);
        System.out.println("???????????????????????????????????????????????????????????????????????????????????????");
        printList(copyList);
        System.out.println("=======================================");
        printList(theatre.seatList);
        copyList.get(1).reserve();
        theatre.reserve("A02");
        sortList(copyList);
        System.out.println("sorted list ==============================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>=================================================" );
        printList(copyList);

    }
    public static void printList(List<Seat> list)
    {
        for(Seat seat: list)
        {
            System.out.print(seat.getSeatNumber()+" ");
        }
        System.out.println();
    }
    public static void sortList(List<? extends Seat> list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
                for (int j=i+1;j<list.size();j++)
                {
                    if(list.get(i).compareTo(list.get(j))>0)
                    {
                        Collections.swap(list,i,j);
                    }
                }
        }
    }
    public  int romanToInt(String s)
    {
        int result=0;
        HashMap<String,Integer> roman=new HashMap<>();
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D",500);
        roman.put("M",1000);
        roman.put("IV",4);
        roman.put("IX",9);
        roman.put("XC",90);
        roman.put("XL",40);
        roman.put("CD",400);
        roman.put("CM",900);
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            String a = ch[i]+"";
            String d= a+ch[i+1];
            if(roman.containsKey(d))
            {
                result+=roman.get(d);
                i+=2;
            }
            else if(roman.containsKey(a))
            {
                result+=roman.get(a);
            }

        }
        return result;
    }
    public static int robs(int[] nums)  //{4,1,2,7,5,3,1}
    {
        int sum=0;
        int sum1=0;
        int greatersum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];            //12
        }
        for(int i=1;i<nums.length;i+=2)
        {
            sum1+=nums[i];          //11
        }
        greatersum = Math.max(sum,sum1);            //12
        for(int i=0;i<nums.length;i++)    //{4,1,2,7,5,3,1}  [
        {
            for(int j=(i+2);j< nums.length && i!=j && j!=(i+1);j++)
            {
                if(nums[i]+nums[j]>greatersum)
                {
                    greatersum=nums[i]+nums[j];
                }
            }
        }
        if(nums.length>1) {
            if (greatersum < nums[1]) {
                greatersum = nums[1];
            }
        }
        if (nums.length==4)
        {
            if((nums[0]+nums[3])>greatersum)
            {
                greatersum=(nums[0]+nums[3]);
            }
        }
        return greatersum;
    }
    public static int rob(int[] nums)       //{4,1,2,7,5,3,1}
    {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0]=nums[0];          //[4,4,
        if(n==1){
            return nums[0];
        }

        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);      //(2+4),4
        }

        return dp[n-1];

    }
























    public static char charat(String string,int position)
    {
        char[] array = string.toCharArray();
        return array[position-1];
    }
    public static boolean perfect_number(int number)
    {
        int perfect=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                perfect+=i;
            }
        }
        if(perfect==number)
            return true;
        else
            return false;
    }
    public static int reverse(int number) // 123
    {
        int reverse=0;
        int num=number;
        while (num>0)
        {
            int temp=num%10;
            reverse=(reverse*10)+temp;
            num/=10;
        }
        return reverse;
    }
    public static int sumofall(int from, int to)
    {
        int sum=0;
        int count=0;
        for(int i =from;i<=to;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print(i+", ");
                sum+=i;
                count++;
            }
            if(count>=5)
                break;
        }
        System.out.println();
        return sum;
    }
    public static double calculate_intrest(double amount, double intrest)
    {
        return amount*(intrest/100);
    }
    public static boolean isodd(int number)
    {
        if(number<1)
            return false;
        if(number%2!=0)
            return true;
        else
            return false;
    }
    public static boolean iseven(int number)
    {
        if(number<1)
            return false;
//        boolean flag=false;
        if(number%2==0)
            return true;
        else
            return false;
    }
    public static int greatestCommonDivisor(int first, int second)
    {
        if(first<10 || second<10)
            return -1;

        int gcd=0;
        for(int i=1;i<first;i++)
        {
            if(first%i==0 && second%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    public static void printFactor(int number)
    {
        if(number<1)
            System.out.println("invalid input");
        System.out.print("Factors of "+number+" are :");
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.print(i+", ");
            }
        }
    }

}


