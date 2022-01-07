public class somthing
{
    public static void main(String[] args) {
//        System.out.println(1+'z');

        for(int i=30;i<170;i++)
        {
            if(Character.isDigit(i)|| Character.isLetter(i))
//            if ((i >= '0' && i <= '9') || (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))  //total =62
            {
//                System.out.println( (char) i);
                char[] array = new char[(char)i];
                char[] temp_array = new char[4];
                char temp;
                for(int j=0;j< array.length;j++)
                {
                    for (int z=j;z<=(j+3);z++)
                    {
                        temp_array[j] = array[i];

                    }
                    temp = temp_array[0];
                }
            }
        }


    }
}
