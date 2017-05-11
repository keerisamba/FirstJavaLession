import java.util.Scanner;


public class Quad
{
	public static void main( String[] arg )
	{
		Scanner input = new Scanner( System.in );

		double a=1;
		double b=2;
		double c=3;
		double x;
		double delta;
		double doubledelta;

			System.out.println("value for A:");
			a = input.nextDouble();

			System.out.println("value for B:");
			b = input.nextDouble();

			System.out.println("value for C:");
			c = input.nextDouble();

		doubledelta = b*b + 4*a*c;

		if(doubledelta < 0)
			System.out.println("Sorry!");
		else
		{

			delta=Math.sqrt(doubledelta);
			x=(-1*b+delta)/2*a;
			System.out.printf("X = %f",x);
		}

	}
}