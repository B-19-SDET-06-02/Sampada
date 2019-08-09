package LoopsDemo;

public class Pattern6 {
public void pat()
{
	for(int i=0;i<5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern6 oo=new Pattern6();
		oo.pat();
	}

}
