class test
{
	test()
	{
		System.out.println("you called the default constructor");
	}
	test(int n)
	{
		this();
	}
}
public class Parameterised
{
	public static void main(String[] args)
	{
		test obj=new test(10);
	}
}