class square2
{
int area()
{
int a=9;
int square=a*a;
return square;
}
public static void main(String[] args)
{
square2 s1=new square2();
int squarearea=s1.area();
System.out.println("the square area is" +squarearea);
}
}