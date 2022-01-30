package random_practice;

import java.util.Scanner;

public class CheckCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch=scanner.next().trim().charAt(0);
		if(ch>='a' && ch <='z')
			System.out.println("is lower");
		else
			System.out.println("is upper");
	}
	
}
