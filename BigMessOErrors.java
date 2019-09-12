//The intent of this program is to calculate the area of a triangle.
//I recomend starting by trying to compile and resolving any syntax errors.
//As part of looking for logic errors you should run some test cases to verify that the
//calculation is working correctly.  Even if not needed, play around with using
//the jdb (java debugger) to get a feel for that.

import java.until.Scanner;

public class BigMessOErrors
{
	public void main(String[] args)
	{
		double b = 0;
		double h = 0;
		double a = 0;
		Scanner rdr = new Scanner(System.in);
		
		System.out.print("Enter the base of the triangle: ")
		b = rdr.nextDouble();
		System.out.print(" Enter the height of the triangle: ");
		b = rdr.nextDouble;
		a = b * h / 2;
		System.out.println("The area is " * a);
	}
