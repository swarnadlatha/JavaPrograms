class Methodwithargumentarea
{
 static void triangle(int b,int h)
	{
	 double trianglearea=0.5*b*h;
	 System.out.println("the triangle area is:" +trianglearea);
	 return;
	}
	static void square(int a)
	{
	 int squarearea=a*a;
	 System.out.println("the square area is:" +squarearea);
	 return;
	}
	 static void reactangle(int w,int h)
	{
	 int reactanglearea=w*h;
	 System.out.println("the reactangle area is:" +reactanglearea);
	 return;
	}
	 static void parallogram(int b,int h)
	{
	 int parallogramarea=b*h;
	 System.out.println("the parallogram area is:" +parallogramarea);
	 return;
	}
	public static void main(String[] args)
	{
		triangle(3,4);
		square(3);
		reactangle(10,9);
		parallogram(6,5);
	}
}
	 
	 