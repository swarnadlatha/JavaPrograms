class ellipse2
{
double area()
{
double pi=3.142;
int a=9;
int b=10;
double ellipse =pi*a*b;
return ellipse;
}
public static void main(String[] args)
{
ellipse2 e1=new  ellipse2();
double  ellipsearea=e1.area();
System.out.println("the  ellipse area is" + ellipsearea);
}
}