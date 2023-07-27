class Course
{
String coursename;
String univirname;
int examcost;
Course(String coursename,String univirname,int examcost)
{
this.coursename=coursename;
this.univirname=univirname;
this.examcost=examcost;
}
public static void main(String[] args)
{
Course c1=new Course("HTML","Qspider",49000);
System.out.println(c1.coursename);
System.out.println(c1.univirname);
System.out.println(c1.examcost);
}
}
