package Static_to_Static_different_class;

public class A {

	public static void main(String[] args) 
	{
		B.Name("manu");
		B.Name("simple");
		int g = c.Add(8, 3);
	
	}

}
class B
{
	public static void Name(String n)
	{
		System.out.println("okay");
		System.out.println(n);
		
	}
}
class c
{
	public static int Add(int a,int b)
	{
		int c = a+b;
		return c; 
	}
	}
