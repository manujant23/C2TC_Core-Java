package may_11;


class student
{
	String  name = "manu";
}
public class Practice extends student
{
	String school = "mvj";
	public static void main(String[] args)
	{
		Practice ob1 = new Practice();
		System.out.println(ob1.name);
		System.out.println(ob1.school);
		student ob2 =new student();
		System.out.println(ob2.name);
		
		
	}

}
