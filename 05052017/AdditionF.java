import java.util.Scanner;

public class AdditionF
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		double number1;
		double number2;
		double sum;

		System.out.print("Enter First Integer: ");
		number1 = input.nextDouble();
		System.out.print("Enter Second Integer: ");
		number2 = input.nextDouble();

		sum = number1 + number2;

		System.out.printf("Sum is = %.2f\n",sum );
	}
}