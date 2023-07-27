class Area
{
void circle(double pi,int r) 
	{
double circlearea=pi*r*r;
System.out.println("the circle area is" +circlearea);
}
}
class circle1
{
public static void main(String[] args)
{
Area a1=new Area();
a1.circle(3.142,65);
}
}