package Fri_13_05_2022;

public class Con_Fri 
{

	public static void main(String[] args) 
	{
		Prem.manuja();
		 Prem monkey = new Prem();
		 monkey.manu(0);
		 
		 intel.laptop();
		 intel tiger = new intel ();
		 tiger.mobile();
		 
		 lion.rore();
		 lion cow = new lion();
		 cow.eat();
		 
		 trek dog = new trek();
		 dog.yana();
		 dog.hills();
		 
		 glass.mouse();
		 glass god = new glass();
		 god .bottle();
		 
		 
	}

}
class glass
{
	void bottle()
	{
		System.out.println("I am bottle");
		
	}
	static void mouse()
	{
		System.out.println("i have hp mouse");
	}

	}

class trek
{
	void yana()
	{
		System.out.println("yana is the best place");
	}
	void hills()
	{
		System.out.println("i love it..!");
	}
}
class lion
{
	void eat()
	{
		System.out.println("Lion is eating:");
	}
	static void rore()
	{
		System.out.println("Lion is roring:");
	}
}
class Prem
{	
	void manu(int a)
	{
		System.out.println(a);
		System.out.println("manu");
	}
	static void manuja()
	{
		System.out.println(" this is static method:");
	}
}
class intel
{
	static void laptop()
	{
		System.out.println("I am laptop:");
	}
	void mobile()
	{
		System.out.println("I am mobile:");
	}
}

// static other one non static 
// static --> we will call the static with the class name .
// non-static --> we will call the non static method with the object of the class.