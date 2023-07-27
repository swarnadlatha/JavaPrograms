class Methodwithreturntype
{
static int add()
	{
	int a=10;
	int b=5;
	int c=a+b;
	return c;
	}
	static int mul()
	{
	int a=3;
	int b=2;
	int c=4;
	int d=a*b*c;
	return d;
	}
	static double circle()
	{
		 final double pi=3.142;
	      int r=5;
		  double area=pi*r*r;
		  return area;
	}
	public static void main(String[] args)
	{
		int addition=add();
		int multiplication=mul();
		double circlearea=circle();
		System.out.println("the addition is" +addition);
		System.out.println("the multiplication is" +addition);
		System.out.println("the circle area is" +addition);
	}
}