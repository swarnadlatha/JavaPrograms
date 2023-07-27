class ellipse 
{
	static void area(double pi,int a,int b)
	{
		double ellipsearea=pi*a*b;
        System.out.println("the ellipse area is" +ellipsearea);
	}
}
class ellipsewithparameter
{
    public static void main(String[] args) 
	{
		ellipse.area(3.142,4,6);
	}
}
