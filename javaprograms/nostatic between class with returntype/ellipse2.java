class Area
{
double ellipse()
{
double pi=3.142;
int a=65;
int b=45;
double ellipse=pi*a*b;
return ellipse ;
}
}
class ellipse2
{
public static void main(String[] args)
{
Area a1=new Area();
double	ellipsearea=a1.ellipse();
System.out.println("the ellipse area is" +ellipsearea);
}
}
