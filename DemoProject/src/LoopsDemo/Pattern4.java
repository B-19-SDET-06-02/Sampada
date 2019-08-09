package LoopsDemo;

public class Pattern4 {
	int i,j,p,q;
	public void user()
	{
		for(i=0;i<5;i++)
		{
			if(i%2==0)
			{
				p=1;
				q=0;
			}
			else
			{
				p=0;
				q=1;
			}
			for(j=0;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(p);
				else
					System.out.print(q);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Pattern4 ad=new Pattern4();
		ad.user();
	}
}
