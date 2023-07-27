class ellipse
{
void area()
{
double pi=3.142;
int a=7;
int b=8;
double ellipsearea=pi*a*b;
System.out.println("the ellipse area is" +ellipsearea);
}
public static void main(String[] args)
{
ellipse e1=new ellipse();
        e1.area();
}
}