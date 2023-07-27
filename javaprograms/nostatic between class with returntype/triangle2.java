class Area
{
double triangle()
{
int b=89;
int h=98;
double triangle=0.5*b*h;
return triangle;
}
}
class triangle2
{
public static void main(String[] args)
{
Area a1=new Area();
double trianglearea=a1.triangle();
System.out.println("the triangle area is" +trianglearea);
}
}


