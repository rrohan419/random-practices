package random_practice;

import javax.lang.model.element.PackageElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class StringArrayPractice {
    static int a=20;
    class Student
    {
        String name;

        public Student(String name) {
            this.name = name;
        }
    }



    private static boolean isStringArrayPalindrome(String[] array)     // {"abc","xyz","xyz","abc"}
    {
        int last = array.length-1;
        int first = 0;
        int mid = (last-first)/2;
        String[] copystring = new String[array.length];
        boolean flag=true;
        int count =0;
        for (int i=last;i>=0 ;i--)
        {
            copystring[count]=array[i];
            System.out.println("copy string "+copystring[count]);

            count++;

        }
        if(array.length%2==0) {

            for (int i = first; i <= mid; ) {
                for (int j = last; j > mid; j--) {
                    if (!array[i].equals(array[j])) {
                        return false;
                    }
                    i++;

                }
            }
            return true;
        }
        else
        {
            for(int i=first;i<mid;)
            {
                for (int j=last;j>mid;j--)
                {
                    if(!array[i].equals((array[j])))
                    {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        }
    }
    public void print()
    {
        int a=8;
        System.out.println(a);
    }


    public static void main(String[] args)
    {
//        int a[][] = new int[3][];
//        a[1] = new int[]{1,2,3};
//        a[2] = new int[]{4,5};
//        System.out.println(a[1][1]);
//        String c = " my name is slim shady";
//        char[] b = {'a','b','c'};
//        int []a1 = {1,2,3,4,5};
//        System.out.println(c instanceof Object);
         new StringArrayPractice().print();
        for (int a=0;a<5;a++)
        {

        }
        System.out.print(a);

//        int obj1= 363;
//
//        int obj2=234433;
//        int obj3=1255675675;
//        int r1 = Character.charCount(obj1);
//        int r2 = Character.charCount(obj2);
//        int r3 = Character.charCount(obj3);
//        System.out.println(obj1+"    "+r1);
//        System.out.println(obj2+"    "+r2);
//        System.out.println(obj3+"    "+r3);

















//            String[] array = {"abc","xyz","ab","ab","ab","xyz","abc"};
//        System.out.println(isStringArrayPalindrome(array));

//        String[] abc = new String[]{"abc", "abc", "cbe"};
//        String newstr = new String("at at success cyber at cyber success you ");
//        System.out.println(onlyDigit(newstr));
//        onlyDigit(" tanya rocks");
//        String s = removeDuplicateWords(newstr);
//        System.out.println(s.toString());
//        removeDuplicateWords(newstr);
//        String[] abc1 = new String[]{"ABC","ABC","ABC"};
//        String[] result = mergeStrings(abc,abc1);
//        for (String i :result)
//        {

//            System.out.print(i+", ");
//        }

//        System.out.println(deleteSpacesInString(newstr));
//        duplicateCharInString(newstr);
//        System.out.println(newstr.length());
//        String abv = deleteSpacesInString(newstr);
//        System.out.println(abv);
//        System.out.println(abv.length());
//        System.out.println(newstr);
//        String stri = newstr.concat(newstr);
//        System.out.println(deleteSpacesInString("success cyber success"));

//        System.out.println(countDuplicateWords(abc));
//        String first= "a b c d";

//        String second = " e f g h";
//        System.out.println(concatString(first,second));
//        System.out.println(duplicateCharInString("success cyber cyber success"));
//        System.out.println(duplicateCharInString("abccefabe"));
//        System.out.println("mera toh aagya "+countWords("My name is rohan."));
    }

    // 1.  Java Program to Count Number of Duplicate Words in String.
    private static void duplicateCharInString(String str)           // "success cyber cyber success"
    {
        String newstring  = deleteSpacesInString(str);  //"succes"
        char[] arraychar = newstring.toCharArray();     // ['s','u','c','c','e'....]              int i=5; int j=8;

//                                                                                                 if(i<j)
        StringBuffer copyString = new StringBuffer("");  // stringBuffer is mutable.
        for(int i=0;i<newstring.length();i++)
        {
            boolean flag = false;
            int count=0;
            String s1 = new String(copyString);
            for(int j=0;j<newstring.length()-1;j++)
            {
                if(s1.contains(String.valueOf(arraychar[i])))
                {
                    continue;
                }
                else if(arraychar[i]==arraychar[j])
                {
                    count++;
                    flag=true;
                }
            }
            if(flag)
            {
                System.out.println("char "+arraychar[i]+"  count is : "+count);
            }
            copyString.append(arraychar[i]);
        }

    }

    //    private static String[] concatStringArray(String[] str1, String[] srt2)
//    {
//        String[] result = new String[(str1.length+srt2.length)];
//        for (int i=0;i<result.length;i++)
//        {
//
//            result[i] = str1[i]+srt2[i];
//        }
//    }

    // 2. Java Program to Count Number of Words in Given String.

    private static int countWords(String str) {
        int count = 1;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }
    private static String deleteSpacesInString(String str)
    {
        char ch;
        String newstr = "";
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            else
            {
                newstr += str.charAt(i);
            }
        }
        return newstr.toString();
    }

    private static int countDuplicateWords(String[] str) {
        int count = 0;
        String ch;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1 && i != j; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }

        }
        return count;
    }
    private static String concatString(String str1,String str2)
    {
        return str1+str2;
    }


    //Java Program to Merge two String Arrays

    private static String[] mergeStrings(String[] first,String[] second)
    {
        String[] result = new String[(first.length+second.length)];
        int count=0;
        for(int i=0;i<first.length;i++)
        {
            result[i]=first[i];
            count++;
        }
        int count1=0;
        for (int i=count;i<result.length;i++)
        {
            result[i]=second[count1];
            count1++;
            count++;
        }
        return result;

    }

    //Java Program to Remove Duplicate Words from String
    private static String removeDuplicateWords(String str)          //"success cyber cyber success free"
    {
        String[] coptstr = str.split(" ");

        StringBuffer stringBuffer = new StringBuffer("");
        boolean flag=false;
        String temp;

        String strcopy = new String(stringBuffer+" ");
        for(int i=0;i<coptstr.length;i++)
        {
            int counter=0;
            for(int j=0;j<coptstr.length-1&& i!=j;j++)
            {

                if(coptstr[i]==coptstr[j] && counter<2)
                {
                    stringBuffer.append(coptstr[i]+" ");
                    counter++;
                }
//                else
//                {
//                    finalstr+=coptstr[j]+", ";
//                }
            }
            if(counter==0)
            {
                stringBuffer.append(coptstr[i]+" ");
            }

        }
//        for(int i=0;i<coptstr.length;i++)
//        {
//            for (int j=0;j<coptstr.length && i!=j ;j++)
//            {
//                if(!str1.contains(coptstr[i]))
//                {
//                    stringBuffer.append(coptstr[i]);
//                }
//                if ()

//
//            }
//            if(!str1.contains(coptstr[i]))
//            {
//                stringBuffer.append(coptstr[i]+", ");
//            }
//        }
//        return stringBuffer;
        return strcopy;
    }
}













