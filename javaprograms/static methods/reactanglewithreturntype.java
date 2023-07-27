class reactangle
{
	static int area()
	{
		int w=7;
		int h=5;
		int reactangle=w*h;
		return reactangle;
	}
}
class reactanglewithreturntype
{
 public static void main(String[] args) 
	{
		int reactanglearea=reactangle.area();
		System.out.println("the reactangle area is" +reactanglearea);
	}
}
