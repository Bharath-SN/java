 import java.io.*;
import java.util.*;

class program2
{
  public static void main(String args[])
  {
    int n;
    Scanner br = new Scanner(System.in);
    System.out.println("Enter the base of squared matrix:");
    
    n = br.nextInt();
    
    int m1[][] = new int[n][n];
    int m2[][] = new int[n][n];
    int prod[][] = new int[n][n];

    System.out.println("Enter the elements of 1st matrix:");
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n;j++)
     {
      m1[i][j] = br.nextInt();
     }
    }
    System.out.println("Enter the elements of 2nd matrix:");
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n;j++)
     {
      m2[i][j] = br.nextInt();
     }
    }
    System.out.println("Multiplying the matrices...");
    for(int i=0;i<n;i++) 
    {
     for(int j=0;j<n;j++)
     {
      for(int k=0;k<n;k++)
      {
       prod[i][j] = prod[i][j]+m1[i][k]*m2[k][j];
      }
     }
    }
    System.out.println("The product is:");
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n;j++)
     {
      System.out.print(prod[i][j]+" ");
     }
      System.out.println();
    }
   }
}    
   