
public class exception_extends
{
public static void main(String args[]) 
	{
	try
	{
		throw new Test();
	}
	catch(Test t)
	{
		System.out.println("Got the Test Exception");
	}
	finally
	{
	System.out.println("inside finally block");
	}

	}

}
