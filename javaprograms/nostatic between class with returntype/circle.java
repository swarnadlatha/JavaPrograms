class area
{
void circle()
{
final double pi=3.142;
int r=67;
final double circlearea=pi*r*r;
System.out.println("the circle area is" +circlearea);
}
}
class circle
{
public static void main(String[] args)
{
area a1=new area();
a1.circle();
}
}