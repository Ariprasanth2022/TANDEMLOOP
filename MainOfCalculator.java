package TANDEMLOOP;

import java.util.Scanner;

public class MainOfCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		double result = 0;
		System.out.println("Enter a value");
		double a = scn.nextDouble();
		System.out.println("Enter b value");
		double b = scn.nextDouble();
		System.out.println("1.Add 2.Sub 3.Mul 4.Div");
		String choice = scn.next();
		Calculator cal = new Calculator();
		switch(choice)
		{
		case "Add" :
			result = cal.add(a, b);
			break;
		case "Sub" :
			result = cal.sub(a, b);
			break;
		case "Mul" :
			result = cal.mul(a, b);
			break;
		case "Div" :
			 result = cal.div(a, b);
			break;
		}
		System.out.println("Result: "+result);
	}
}
