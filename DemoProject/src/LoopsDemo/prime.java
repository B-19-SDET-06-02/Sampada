package LoopsDemo;

public class prime {
int p;
	
	public void user()
	{
		for(int i=2;i<100;i++)
		{
			boolean prime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime=false;
					break;
				}
			}
			if(prime==true)
			
			System.out.print(i+" ");
		}
		
	}
	public static void main(String args[])
	{
		prime ad=new prime();
		ad.user();
	}


}
