class Course
{
String univirname;
String coursename;
int examcost;
Course(String a,String b,int c)
{
univirname=a;
coursename=b;
examcost=c;
}
public static void main(String[] args)
{
Course c1=new Course("jspider","java",42000);
System.out.println("the univir name is"  +c1.univirname);
System.out.println("the course name is" +c1.coursename);
System.out.println("the exam cost is"+c1.examcost);
}
}

