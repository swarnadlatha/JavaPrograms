class Area
{
double circle()
{
double pi=3.142;
int r=65;
double circle=pi*r*r;
return circle;
}
}
class circle2
{
public static void main(String[] args)
{
Area a1=new Area();
double	circlearea=a1.circle();
System.out.println("the circle area is" +circlearea);
}
}
