class Area
{
double trapezoid()
{
int a=35;
int b=45;
int h=56;
double trapezoid=0.5*a+b*h;
return trapezoid;
}
}
class trapezoid2
{
public static void main(String[] args)
{
Area a1=new Area();
double	trapezoidarea=a1.trapezoid();
System.out.println("the trapezoid area is" +trapezoidarea);
}
}

