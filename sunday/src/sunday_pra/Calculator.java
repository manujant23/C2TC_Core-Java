package sunday_pra;

import java.util.Scanner;

public class Calculator 
{
	public static void mul(int a,int b)
	{
	int c;
	c = a * b;
	System.out.println("mul output"+ "----- " + c);
		
	}
	public static void div(int a,int b )
	{
		int d;
		d = a / b;
	
		System.out.print("div output"+"-----" + d);
	}
	
	public static void add(int a, int b)

	{
		int c;
		c = a + b;
		System.out.println("addition output"+ "----- " + c);
	}
	public static void sub(int a, int b)
	{
		int c;
		c = a - b;
		System.out.println("substraction output" + "------" + c);
	}
	public static void main(String [] arg)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the integer a");
		int a = s1.nextInt();
		System.out.println("enter the integer b");
		int b = s1.nextInt();
		add(a,b);
		sub(b,a);
		mul(a,b);
		div(a,b);
	
		
		}
	}
	