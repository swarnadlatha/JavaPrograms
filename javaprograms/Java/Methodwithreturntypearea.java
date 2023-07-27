class Methodwithreturntypeareas 
{
	static double triangle()
	{
		int b=3;
		int h=2;
		double triangle=0.5*b*h;
		return triangle;
	}
	static int square()
	{
		int a=2;
		int square=a*a;
		return square;
	}
	static int reactangle()
	{
		int w=4;
	    int h=4;
		int reactangle=w*h;
		return reactangle;
	}
	static int parallogram()
	{
		int b=3;
		int h=4;
		int parallogram=b*h;
		return parallogram;
	}
  public static void main(String[] args)
	{
		double trianglearea= triangle();
		int squarearea=square();
		int reactanglearea=reactangle();
		int parallogramarea=parallogram();
		System.out.println("the triangle area is:" +trianglearea);
		System.out.println("the square area is:"   +squarearea);
		System.out.println("the reactangle area is:"   +reactanglearea);
		System.out.println("the parallogram area is:"   +parallogramarea);
	}
}
	
