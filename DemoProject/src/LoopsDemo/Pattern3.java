package LoopsDemo;

public class Pattern3 {
	int i,j,k,l=5;
	public void user()
	{
	for(i=1;i<=6;i++)
	{
		for(j=1;j<=i;j++)
			{
				System.out.print(j);
				if(j==3)
				{
					break;
				}
			}
			if(i>3)
			{
				for(k=5;k<=l;k=k+2)
				{
					System.out.print(k);
				}
				l=l+2;
			}
			System.out.println();
	}	
	
}
		
public static void main (String[]args)
{
	Pattern3 ad=new Pattern3();
	ad.user();
}
}
