package LoopsDemo;

public class Pattern2 {
	int i,j;
	public void user()
	{
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}
	public static void main (String[]args)
	{
		Pattern2 ad=new Pattern2();
		ad.user();
	}
}
