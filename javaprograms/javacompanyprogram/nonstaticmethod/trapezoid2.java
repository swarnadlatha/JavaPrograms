class trapezoid2
{
double area()
{
int a=9;
int b=7;
int h=8;
double  trapezoid=0.5*a+b*h;
return trapezoid ;
}
public static void main(String[] args)
{
trapezoid2 t1=new  trapezoid2();
double  trapezoidarea=t1.area();
System.out.println("the  trapezoid area is" + trapezoidarea);
}
}