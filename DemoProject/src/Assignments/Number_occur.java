package Assignments;

import java.util.Scanner;

public class Number_occur {

		int n,x,count=0,i=0;
	Scanner s=new Scanner(System.in);
	{
	System.out.print("Enter the number");
	n=s.nextInt();
	}
	public void acc()
	{
		int a[]=new int[n];
		System.out.println("enter all the number");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the number which you want to count");
		x=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("the occurence is"+count);
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Number_occur oo=new Number_occur();
	oo.acc();
		}

	}

