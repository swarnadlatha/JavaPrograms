class triangle1
{
void area(int b,int h)
{
double trianglearea=0.5*b*h;
System.out.println("the triangle area is" +trianglearea);
}
public static void main(String[] args)
{
triangle1 t1=new triangle1();
          t1.area(7,5);
}
}