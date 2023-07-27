class parallogram2
{
int area()
{
int h=9;
int b=7;
int  parallogram=b*h;
return  parallogram;
}
public static void main(String[] args)
{
 parallogram2 p1=new  parallogram2();
int  parallogramarea=p1.area();
System.out.println("the  parallogram area is" + parallogramarea);
}
}