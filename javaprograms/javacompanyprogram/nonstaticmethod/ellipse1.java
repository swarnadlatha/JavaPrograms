class ellipse1
{
void area(double pi,int a,int b)
{
double ellipsearea=pi*a*b;
System.out.println("the ellipse area is" +ellipsearea);
}
public static void main(String[] args)
{
ellipse1 e1=new ellipse1();
         e1.area(3.142,6,7);
}
}
