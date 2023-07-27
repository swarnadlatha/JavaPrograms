class Area
{
void trapezoid(int a,int b,int h) 
	{
double trapezoidarea=0.5*a+b*h;
System.out.println("the trapezoid area is" +trapezoidarea);
}
}
class trapezoid1
{
public static void main(String[] args)
{
Area a1=new Area();
a1.trapezoid(64,88,78);
}
}