import java.util.Scanner;
class Employee
{
  String name;
  int id;
  String department;
  double salary;
  int cca=200;

  void displayDetails()
  {
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Name:"+name);
    System.out.println("Department:"+department);
    System.out.println("Salary:$"+salary);
    System.out.println("DA:"+0.10*salary);
    System.out.println("TA:"+0.02*salary);
    System.out.println("CCA:"+cca);
    System.out.println("HRA:"+0.15*salary);
    double gross = salary+(0.1*salary)+(0.02*salary)+cca+(0.15*salary);
    System.out.println("Gross Salary:"+gross);
    
  }
}

public class EmployeeDetails
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    Employee employee = new Employee();
    
    System.out.print("Enter Employee ID:");
    employee.id = scanner.nextInt();

    System.out.print("Enter employee Name:");
    employee.name = scanner.next();

    System.out.print("Enter Department:");
    employee.department = scanner.next();

    System.out.print("Enter Salary:");
    employee.salary = scanner.nextDouble();

    System.out.print("\nEmployee Details:\n");
    employee.displayDetails();
  }
}    