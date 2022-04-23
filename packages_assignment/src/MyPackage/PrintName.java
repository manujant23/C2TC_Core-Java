package MyPackage;

import Others_Package.Other_Class;
public class PrintName 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "I am from same package but from different class";
      
      // Creating an instance of class MyClass in 
      // the package.
      MyClass obj = new MyClass();
      
      obj.getNames(name);
      
      Other_Class obj2 = new Other_Class();
      obj2.printer();
   }
}



