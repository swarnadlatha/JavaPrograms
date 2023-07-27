class triangle 
{
	static double area()
	{
		int b=2;
		int h=3;
		double triangle=0.5*b*h;
		return triangle;
	}
}
class trianglewithreturntype
{

	public static void main(String[] args) 
	{
		double trianglearea=triangle.area();
		System.out.println("the triangle area is" +trianglearea);
	}
}
