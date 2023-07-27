class area
{
void triangle()
{
int b=9;
int h=8;
double trianglearea=0.5*b*h;
System.out.println("the triangle area is"  +trianglearea);
}
}
class triangle
{
public static void main(String[] args)
{
area a1=new area();
     a1.triangle();
 }
 }