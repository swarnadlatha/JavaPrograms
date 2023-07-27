class circle
{
	static void area()
	{
    double pi=3.142;
	int r=6;
	double  circlearea=pi*r*r;
	System.out.println("the  circle area is:" + circlearea);
	}
}
class staticmethodcircle
    {

	public static void main(String[] args) 
	{
		 circle.area();
	}
}