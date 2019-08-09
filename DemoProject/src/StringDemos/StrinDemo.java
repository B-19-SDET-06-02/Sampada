package StringDemos;

public class StrinDemo {
String name=new String("Aman preet");
String name1;
String fname="preet";
int a=5;
char a1 ='y';
public void print()
{
	System.out.println(name+a+a1);
	fname=name.concat(fname);
	System.out.println(fname);
	a1=name.charAt(7);
	System.out.println(a1);
	name1=name;
	System.out.println("----"+name1);
	name="Prakhar";
	System.out.println(name);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrinDemo oo=new StrinDemo();
		oo.print();
	}

}
