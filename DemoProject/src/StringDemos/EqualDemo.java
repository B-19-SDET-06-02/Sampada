package StringDemos;

import java.util.Scanner;

public class EqualDemo {
String loginid;
String pass;
int count;
Scanner sc=new Scanner(System.in);
public void checkLogin()
{
	System.out.println("Enter Login id");
	loginid=sc.nextLine();
	
	System.out.println("Enter Password ");
	pass=sc.nextLine();
	count=pass.length();
	System.out.println("Length of password"+count);
	if((loginid.equalsIgnoreCase("admin"))&&(pass.equalsIgnoreCase("admin")))
	{
		System.out.println("you are valid user");
	}
	else
	{
		System.out.println("Not valid user");
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualDemo oo=new EqualDemo();
		oo.checkLogin();
	}

}
