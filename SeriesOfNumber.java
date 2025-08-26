package TANDEMLOOP;

import java.util.Scanner;

public class SeriesOfNumber
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = scn.nextInt();
		for(int i=1;i<=x;i++)
		{
			int a = i*2-1;
			if(i<x)
			{
				System.out.print(a+",");
			}
			else
			{
				System.out.print(a);
			}
		}
	}
}
