package LoopsDemo;

public class Pattern1 {
	int i,j;
	public void user()
	{
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	}
	public static void main (String[]args)
	{
		Pattern1 ad=new Pattern1();
		ad.user();
	}
}
