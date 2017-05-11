import java.util.Scanner;

public class bankeeMoon
{

	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );


		double deposit;
		double rate;
		double mat;
		double interest;

		System.out.printf("\n\n Deposit Amount:\t");
		deposit = input.nextDouble();

		System.out.printf(" Interest Rate:\t");
		rate = input.nextDouble();

		interest = deposit * rate / 100;
		mat = interest + deposit;

		System.out.printf("\n\t\tInterest Paid:\t %f\n",interest);
		System.out.printf("\t\tTotal: %.2f\n\n",mat);
	}
}