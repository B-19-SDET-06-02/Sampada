package LoopsDemo;

public class DiamondPattern {
	int i,j,k;
	public void user()
	{
		for(i=1;i<5;i++)
		{
			
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}	
			for(k=0;k<i*2-1;k++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		for(i=1;i<5;i++)
		{
						
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}	
			
			for(k=6;k>i*2-1;k--)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
		}	
	}
	public static void main(String[] args)
	{
		DiamondPattern ad=new DiamondPattern();
	
		ad.user();
	}	
}
