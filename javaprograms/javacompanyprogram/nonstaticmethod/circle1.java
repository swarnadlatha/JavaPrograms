class circle1
{
void area(double pi,int r)
{
double circlearea=pi*r*r;
System.out.println("the circle area is" +circlearea);
}
public static void main(String[] args)
{
circle1 c1=new circle1();
        c1.area(3.142,9);
}
}