//This program takes an input from the user and outputs the sum of the squares of that number and the next three numbers
//A next number for this program is defined as 1 plus the previous one
//The programs in this lab don't have comments, that is intentional to make it a little harder to find errors
//Adding comments helps you and others better understand your code, reducing errors and development time

import java.util.Scanner;
import java.lang.Math;

public class LogicErrors
{
	public static void main(String[] args)
	{
		double Sum = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double Reader = reader.nextDouble();
		double sum = Math.pow(2.0, Reader);
		sum = Math.pow(Reader+1.0, 2.0);
		sum = Math.pow(sum+1.0, 2.0);
		System.out.print("The sum is ");
		System.out.println(Sum);
	}
}
