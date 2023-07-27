class Employee
{
int employeeid;
int employeesalary;
char employeegrade ;
Employee(int a,int b,char c)
{
employeeid=a;
employeesalary=b;
employeegrade=c;
}
public static void main(String[] args)
{
Employee e1=new Employee(2342,60000,'a');
System.out.println("the employee id is"  +e1.employeeid);
System.out.println("the employee salary is" +e1.employeesalary);
System.out.println("the employee grade  is"+e1.employeegrade);
}
}

