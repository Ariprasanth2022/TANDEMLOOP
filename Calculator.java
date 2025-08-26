package TANDEMLOOP;

public class Calculator
{
	public double add(double a, double b)
	{
		return a+b;
	}
	public double sub(double a, double b)
	{
		return a-b;
	}
	public double mul(double a, double b)
	{
		return a*b;
	}
	public double div(double a, double b)
	{
		if(b!=0)
		{
			return a/b;
		}
		else
		{
			System.out.println("Enter valid number");
			return Double.NaN;
		}
	}
}
