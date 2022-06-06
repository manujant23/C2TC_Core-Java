package may_11;

import java.util.Scanner;

public class even_number_check {

	public static void main(String[] args) 
	{
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number- ");  
	int num = sc.nextInt();//5
	
	if(num % 2 == 0)//5 %2 
	{
		System.out.print("it is a even number");
	}
	else
	{
		System.out.print("it is  not even number");
	}

	}

}

//=,==
// a= 2
// b =10
// ==
