
public class Factorial {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.print(factorial.findFactorial(24));
	}
	public long findFactorial(int number)
	{
		if(number==1)
			return 1;
		else
		{
			return (long) number*findFactorial(number-1);
		}
	}
}
