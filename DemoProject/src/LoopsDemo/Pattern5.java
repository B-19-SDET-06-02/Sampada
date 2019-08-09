package LoopsDemo;

public class Pattern5 {
	int i,j,k,l=1;
	public void user()
	{
		for(i=0;i<5;i++)
		{
			
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}	
			for(k=0;k<l;k++)
			{
				System.out.print("*");
			}				
			l=l+2;
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Pattern5 ad=new Pattern5();
		ad.user();
	}
}
