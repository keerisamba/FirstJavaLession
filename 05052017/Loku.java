import java.util.Scanner;

public class Loku
{
	public static void main( String[] arg )
	{

		Scanner input = new Scanner( System.in );
		double num1;
		double num2;
		double num3;
		
		double res1;
		double res2;
		double large;

		System.out.printf("num1: ");
		num1 = input.nextDouble();
		System.out.printf("num2: ");
		num2 = input.nextDouble();
		System.out.printf("num3: ");
		num3 = input.nextDouble();

/////////////////////////////////////////////////////////////////////

		if(num1>num2)
			res1=num1;
		else
			res1=num2;


		if(num1>num3)
			res2=num1;
		else
			res2=num3;


		if(res1>res2)
			large=res1;
		else
			large=res2;


		System.out.printf("result %.1f",large);


/////////////////////////////////////////////////////////////////////	
	}
}