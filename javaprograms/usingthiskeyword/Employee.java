class Employee
{
int employeeid;
int employeesalary;
char employeegrade;
Employee(int employeeid,int employeesalary,char employeegrade)
{
this.employeeid=employeeid;
this.employeesalary=employeesalary;
this.employeegrade=employeegrade;
}
public static void main(String[] args)
{
Employee e1=new Employee(1245,300000,'a');
System.out.println(e1.employeeid);
System.out.println(e1.employeesalary);
System.out.println(e1.employeegrade);
}
}