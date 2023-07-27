class School
{
String schoolname;
char schoolgrade;
int schoolstrenth;
School(String a,char b,int c)
{
schoolname=a;
schoolgrade=b;
schoolstrenth=c;
}
public static void main(String[] args)
{
School s1=new School("jspider",'A',950);
System.out.println("the school name is" +s1.schoolname);
System.out.println("the school grade is" +s1.schoolgrade);
System.out.println("the school strenth is" +s1.schoolstrenth);
}
}

