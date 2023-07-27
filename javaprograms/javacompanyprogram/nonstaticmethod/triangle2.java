class triangle2
{
double area()
{
int b=8;
int h=9;
double triangle=0.5*b*h;
return triangle;
}
public static void main(String[] args)
{
triangle2 t1=new triangle2();
  double trianglearea=t1.area();
  System.out.println("the triangle area is" +trianglearea);
}
}