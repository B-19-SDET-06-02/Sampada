package Assignments;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] ar)
	
	{
		 int i,j,r;
		   System.out.print("Enter number of rows : ");
		   Scanner sc = new Scanner(System.in);
				    r = sc.nextInt();
		   for(i=0;i<=r;i++)
		   {
		     for(j=1;j<=r-i;j++)
		     {
		     System.out.print(" ");
		     }
		     for(j=1;j<=2*i-1;j++)
		     {
		    	 System.out.print("*");
		     }
		     System.out.print("\n");
		   }
		 
		   for(i=r-1;i>=1;i--)
		   {
		     for(j=1;j<=r-i;j++)
		     {
		     System.out.print(" ");
	
		     }
		     for(j=1;j<=2*i-1;j++)
		     {
		    	 System.out.print("*");
		     }
		     System.out.print("\n");
		   }
	}
}