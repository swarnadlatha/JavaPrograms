class ellipse
{
	static void area()
	{
    double pi=3.142;
	int a=6;
	int b=4;
	double ellipsearea=pi*a*b;
	System.out.println("the  ellipse area is:" +ellipsearea);
	}
}
class staticmethodellipse
    {

	public static void main(String[] args) 
	{
		 ellipse.area();
	}
}