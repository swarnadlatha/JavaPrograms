class area
{
void trapezoid()
{
int a=67;
int b=76;
int h=45;
double trapezoidarea=0.5*a+b*h;
System.out.println("the trapezoid area" +trapezoidarea);
}
}
class trapezoid
{
public static void main(String[] args)
{
area a1=new area();
a1.trapezoid();
}
}