class circle2
{
double area()
{
int r=9;
double pi=3.142;
double circle =pi*r*r;
return circle;
}
public static void main(String[] args)
{
circle2 c1=new  circle2();
double  circlearea=c1.area();
System.out.println("the  circle area is" + circlearea);
}
}