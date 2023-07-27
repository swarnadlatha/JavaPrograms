class Area
{
void ellipse(double pi,int a,int b) 
	{
double ellipsearea=pi*a*a;
System.out.println("the ellipse area is" +ellipsearea);
}
}
class ellipse1
{
public static void main(String[] args)
{
Area a1=new Area();
a1.ellipse(3.142,75,56);
}
}