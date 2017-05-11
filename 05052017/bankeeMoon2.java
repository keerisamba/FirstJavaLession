import java.util.Scanner;

public class bankeeMoon2
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

		rate=10;
		if ( deposit >= 100000 )
			rate=12;

		interest = deposit * rate / 100;
		mat = interest + deposit;

		System.out.printf("\n\t\t Interest Paid: \t %f\n",interest);
		System.out.printf("\t\t Total: %.2f \n\n",mat);
	}
}