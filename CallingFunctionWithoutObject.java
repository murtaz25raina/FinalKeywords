class ant
{
	public static void a() 
	{
		System.out.println("hello");
	}
	
}
class App extends ant{}
public class CallingFunctionWithoutObject
{
	public static void main(String[] args)
	{
		App.a();
	}
}
