package may_11;

public class FibonacciExample1
{  
public static void main(String args [])  
{    
 int n1=0,n2=1,n3,i,count=10; 
 // int n1 = 0;
 // int n2 = 1;
 // int n3 ;
 //int count = 10;
 System.out.print(n1+ " " +n2);//printing   
    
 for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  

// 0 1 1 2 3 5 8 ............................................................................................
// n1 =0 , n2 = 1
//print n1 and n2 



