import java.util.Scanner;
class Employee{
int empid,salary;
String name,address;
Employee(int empid,String address,String name,int salary)
{
this.empid=empid;
this.name=name;
this.address=address;
this.salary=salary;
}
Employee(){}
}
class Teacher extends Employee
{
String department,subject;
Teacher(int empid,String name,String address,int salary,String department,String subject)
{
super(empid,name,address,salary);
this.department=department;
 this.subject=subject;
 }
 Teacher(){
 super();
 }
 void displayTeachers(Teacher[] teachers)
 {
 String format="%-10s %-20s %-20s %-10s %-20s %-20s";
 System.out.format(format,"empId","Name","Address","Salary","Department","Subject");
 System.out.println();
 System.out.format(format,"------","--------","---------","--------","------------","--------");
 System.out.println();
 for(Teacher t: teachers)
 {
 System.out.format(format,t.empid,t.name,t.address,t.salary,t.department,t.subject);
 System.out.println();
 }
 }
 }
 class Employees
 {
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the no.of Employee");
 Teacher[] teachers=new Teacher [eCount];
 {
 System.out.println("Enter EmpId:");
 int empid=sc.nextInt();
 sc.nextLine();
 System.out.println("Enter Name:");
 String name=sc.nextLine();
 System.out.println("Enter Address:");
 String address=sc.nextLine();
 sc.nextLine();
 System.out.println("Enter Salary:");
 int salary=sc.nextInt();
 sc.nextLine();
 System.out.println("Enter Department:");
 String department=sc.nextLine();
 System.out.println("Enter Subject:");
 String subject=sc.nextLine();
 teachers[i]=new Teacher(empid,name,address,salary,department,subject);
 }
 Teacher t1=new Teacher();
 t1.displayTeachers(teachers);
 }
 }
 
