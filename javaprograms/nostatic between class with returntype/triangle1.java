class area
{
void triangle(int b,int h)
{
double trianglearea=0.5*b*h;
System.out.println("the triangle area is" +trianglearea);
}
}
class triangle1
{
public static void main(String[]args)
{
area a1=new area();
a1.triangle(56,76);
}
}