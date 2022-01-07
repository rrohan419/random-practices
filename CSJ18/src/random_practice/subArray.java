package random_practice;

public class subArray
{
    public static void main(String[] args) {
        char[] array = {'a','b','c','d','e','f'};
        char[] res = subArray(array,1,3);
        int[] intArray= {222,5,1,52,2,-88};
        largestTwoNumbers(intArray);
//        printIntegerArray(intArray);
    }
        private static char[] subArray(char[] array,int start,int end)
        {
            char[] result = new char[end-start+1];
            if(start>=0&& start<array.length && end>=0 && end<array.length && start<=end)
            {
                for(int i=start;i<end;i++)
                {
                    result[i] = array[i];
                }
            }
            return result;
        }
        private static void printCharArray(char[] array)
        {
            for (char c : array) {
                System.out.print(c+", ");
            }
        }
        private static void printIntegerArray(int[] array)
        {
            for(int i:array)
            {
                System.out.print(array[i]+", ");
            }
        }

        private static void largestTwoNumbers(int[] array)     // array ={2,5,8,1,0,10};
        {

            if (array.length>2)
            {
                for (int i =0;i<array.length;i++)
                {
                    for (int j=0;j<array.length-1;j++)
                    {
                        if(array[i]<array[j])
                        {
                            int temp = array[i];
                            array[i]=array[j];
                            array[j]=temp;
                        }
                    }
                }
                System.out.println(array[array.length-1]+", "+array[array.length-2]);
            }
        }
}
