class trapezoid
{
	static void area()
	{
    double pi=3.142;
	int a=6;
	int b=3;
	int h=7;
    double trapezoidarea=0.5*a+b*h;
	System.out.println("the trapezoid area is:" +trapezoidarea);
	}
}
class staticmethodtrapezoid
    {

	public static void main(String[] args) 
	{
		trapezoid.area();
	}
}