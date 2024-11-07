import java.io.*;
import java.util.*;
import mca.student;
class pgm3_student
{
public static void main(String[] args)
{
String name;
int roll;
int m1,m2,m3;
Scanner br=new Scanner(System.in);
System.out.println("Enter Roll No:");
roll=br.nextInt();
System.out.print("Enter Name:");
name=br.next();
System.out.print("Enter Subject1 mark:");
m1=br.nextInt();
System.out.print("Enter Subject2 mark:");
m2=br.nextInt();
System.out.print("Enter Subject3 mark:");
m3=br.nextInt();
student s=new student(roll,name,m1,m2,m3);
s.display();
}
}