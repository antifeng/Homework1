 /* 
 * @Brief description: This is a homework project for CPE640
 *                    Figure out the location of largest element in a matrix
 * @created by: Lifeng Yin
 * 
 */

import java.util.Scanner;

public class Location
	{
	/**
	 * @member data
	 */
		public int row;
		public int column;
		public double maxValue;

	/**
	 * @member methods
	 */
		
		public Location()
		{
			this.row = 0;
			this.column= 0;	
			this.maxValue = Double.NEGATIVE_INFINITY;
		}

		public static Location locateLargest(double[][] BiDarray)
		{
			Scanner sc = new Scanner (System.in);
			System.out.printf ("Please enter values of matrix element, splitted with space:\n");

			int row = BiDarray.length;
			int column= BiDarray[0].length;
			
			//get the element of matrix from input
			for(int i=0; i<row; i++)
				for(int j=0; j<column; j++)
				{
					BiDarray[i][j] = sc.nextDouble();
				}

			Location objLocation = new Location();
			
			//locate the largest element
			for(int i=0; i<row; i++)
				for(int j=0; j<column; j++)
				{
					if(BiDarray[i][j]>objLocation.maxValue){
						objLocation.maxValue = BiDarray[i][j];
						objLocation.row = i;
						objLocation.column = j;
					}
				}
			System.out.println("The max of this array is " + objLocation.maxValue);
			return objLocation;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, column;
		System.out.printf ("Please enter values of  row, column of the matrix, splitted with space:\n");
		
		//get the size of matrix
		Scanner sc = new Scanner (System.in);
		row = sc.nextInt();
		column = sc.nextInt();
		
		if( row<=0 || column<=0){
			System.out.println("You input invalid value!\n");
			return;
		}
		
		double[][] BiDArray = new double[row][column];
		locateLargest(BiDArray);
	}

}
