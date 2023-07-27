class triangle 
{
	static void area(int b,int h)
	{
		double trianglearea=0.5*b*h;
		System.out.println("the triangle area is" +trianglearea);
	}
}
class trianglewithparameter
{
  public static void main(String[] args) 
	{
		triangle.area(3,4);
	}
}
