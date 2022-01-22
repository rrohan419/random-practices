package serializationex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile 
{
	public static void main(String[] args) {
		readFile("C:/Users/91620/Desktop/access token.txt");
	}
	
	public static void readFile(String path)
	{
		try
		{
//			FileInputStream fileInputStream = new FileInputStream("C:/Users/91620/Desktop/access token.txt");
			FileReader fileReader = new FileReader(path);
			int a;
			while((a=fileReader.read())!=-1)
			{
				System.out.print((char)a);
			}
			fileReader.close();
		}
		catch(IOException ex)
		{
			ex.getStackTrace();
		}
		
	}

}
