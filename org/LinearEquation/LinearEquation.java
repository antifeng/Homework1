package LinearEquation;

 /* 
 * @Brief description: This is a homework project for CPE640
 * 
 * @created by: Lifeng Yin
 * 
 */

import java.util.Scanner;

public class LinearEquation {

	/**
	 * @param args
	 */
		private double a;
		private double b;
		private double c;
		private double d;
		private double e;
		private double f;

		public LinearEquation(double a, double b, double c, double d, double e, double f)
		{
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
		}

		public boolean isSolvable()
		{
			if (a*d == b*c)
				return false;
			else
				return true;
		}

		public double getA()
		{
			return this.a;
		}

		public double getB()
		{
			return this.b;
		}

		public double getC()
		{
			return this.c;
		}

		public double getD()
		{
			return this.d;
		}

		public double getE()
		{
			return this.e;
		}

		public double getF()
		{
			return this.f;
		}

		public double getX()
		{
			return (e*d-b*f)/(a*d-b*c);
		}

		public double getY()
		{
			return (a*f-e*c)/(a*d-b*c);
		}

	public static void main(String[] args) {
		// some testing
		
		double a, b, c, d, e, f;
		System.out.printf ("Enter values of a, b, c, d, e, f seperated with space:\n");
		
		Scanner sc = new Scanner (System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
		
		System.out.printf ("What you have input are %f %f %f %f %f %f\n", a, b, c, d, e, f);
		
		LinearEquation objLinearEquation = new LinearEquation(a, b, c, d, e, f);
		
		if (objLinearEquation.isSolvable())
			System.out.println("The solution of X is " + objLinearEquation.getX() + " Y is " + objLinearEquation.getY());
		else
			System.out.println("The equation has no solution\n");
		
		//for exercise 3
		double x1, y1, x2, y2, x3, y3, x4, y4;
		
		System.out.printf ("Enter values of x1, y1, x2, y2, x3, y3, x4, y4 seperated with space:\n");
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		x4 = sc.nextDouble();
		y4 = sc.nextDouble();
		
		a = -(y2 - y1)/(x2 - x1);
		b = 1;
		e = y2 + a * x2;
		
		c = -(y4 - y3)/(x4 - x3);
		d = 1;
		f = y4 + c * x4;
		
		System.out.printf ("What you have input are %f %f %f %f %f %f %f %f\n", x1, y1, x2, y2, x3, y3, x4, y4);
		
		
		LinearEquation obj2LinearEquation = new LinearEquation(a, b, c, d, e, f);
		
		if (obj2LinearEquation.isSolvable())
			System.out.println("The solution of X is " + obj2LinearEquation.getX() + " and Y is " + obj2LinearEquation.getY());
		else
			System.out.println("The equation has no solution\n");
			
	}

}
