class area 
{
void ellipse()
{
double pi=3.142;
int a=25;
int b=35;
double ellipsearea=pi*a*b;
System.out.println("the ellipse area is" +ellipsearea);
}
}
class ellipse
{
public static void main(String[] args)
{
area a1=new area();
a1.ellipse();
}
}