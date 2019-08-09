package StringDemos;

public class ComparisonDemo {
String s1="Raj";//Constant Pool
String s2="Raj";//Constant Pool
String s3=new String("Raj");//Heap Memory
public void acc()
{
	System.out.println(s1==s2);//Shallow Comparison
	System.out.println(s1.equals(s2));//Deep Comparison
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparisonDemo oo=new ComparisonDemo();
		oo.acc();
	}

}
