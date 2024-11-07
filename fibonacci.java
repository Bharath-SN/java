import java.io.*;
import java.util.*;

class fibonacci
{
   static int n1=0, n2=1, n3;
   static void fibonaccirecursive(int count)
	{   
	   if(count > 0)
		{
		   n3 = n1+n2;
		   n1 = n2;
		   n2 = n3;
		   System.out.println(" "+n3);
		   fibonaccirecursive(count-1);
		}
	}
	public static void main(String args[])
	{
	   Scanner br = new Scanner(System.in);
	   int choice,count,i;
	   System.out.println("1-Fibonacci Using Recusrion");
	   System.out.println("2-Fibonacci without Using Recusrion");
	   System.out.println("Enter your choice:");
	   choice = br.nextInt();
	   System.out.println("Enter the count");
	   count = br.nextInt();
	   switch(choice)
	   {
		case 1:System.out.println("Fibonacci Using Recusrion");
		       System.out.println("The values are:\n" +n1+ " " +n2);
		       fibonaccirecursive(count-2);
		       break;
		
		case 2:System.out.println("Fibonacci without Using Recusrion");
		       System.out.println("The values are:\n" +n1+ " " +n2);
		       for(i=2;i<count;i++)
		       {
			  n3 = n1 + n2;
			  System.out.println(" "+n3);
			  n1 = n2;
			  n2 = n3;
		       }
		       break;
	   }
	}
}	  