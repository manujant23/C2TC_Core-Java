package Non_static_methodes;

public class D {

public static void main(String[] args) 
{
	Z z1= new Z();
	z1.add();

}

}
class Z
{
public void add()
{
	System.out.println(10+20);
}
}
